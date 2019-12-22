package my_spring;

import demo1.Person;
import lombok.SneakyThrows;
import org.reflections.ReflectionUtils;
import org.reflections.Reflections;
import sun.reflect.Reflection;

import javax.annotation.PostConstruct;
import java.lang.invoke.SerializedLambda;
import java.lang.reflect.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Set;

/**
 * @author Evgeny Borisov
 */
public class ObjectFactory {
    private static ObjectFactory ourInstance = new ObjectFactory();
    private Config config = new JavaConfig();
    private List<ObjectConfigurator> configurators = new ArrayList<>();
    private Reflections scanner = new Reflections("my_spring");

    public static ObjectFactory getInstance() {
        return ourInstance;
    }

    @SneakyThrows
    private ObjectFactory() {
        Set<Class<? extends ObjectConfigurator>> classes = scanner.getSubTypesOf(ObjectConfigurator.class);
        for (Class<? extends ObjectConfigurator> aClass : classes) {
            configurators.add(aClass.newInstance());
        }

    }


    @SneakyThrows
    public <T> T createObject(Class<T> type) {

        type = resolveImpl(type);
        T t = type.newInstance();
        configure(t);

        runInitMethod(type, t);

        if (type.isAnnotationPresent(Benchmark.class)) {
            return (T) Proxy.newProxyInstance(type.getClassLoader(), type.getInterfaces(), new InvocationHandler() {
                @Override
                public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                    System.out.println("********BENCHMARK for method "+method.getName()+" started *****");
                    long start = System.nanoTime();
                    Object retVal = method.invoke(t, args);
                    long end = System.nanoTime();
                    System.out.println(end-start);
                    System.out.println("********BENCHMARK for method "+method.getName()+" ended *****");
                    return retVal;
                }
            });
        }

        return t;
    }

    private <T> void runInitMethod(Class<T> type, T t) throws IllegalAccessException, InvocationTargetException {
        Method[] methods = type.getMethods();
        for (Method method : methods) {
            if (method.isAnnotationPresent(PostConstruct.class)) {
                method.invoke(t);
            }
        }
    }

    private <T> Class<T> resolveImpl(Class<T> type) {
        if (type.isInterface()) {
            type = config.getImplClass(type);
        }
        return type;
    }

    private <T> void configure(T t) {
        for (ObjectConfigurator configurator : configurators) {
            configurator.configure(t);
        }
    }


}
