package zoo;

import lombok.SneakyThrows;
import org.reflections.Reflections;

import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.function.Supplier;

import static java.util.Arrays.asList;

/**
 * @author Evgeny Borisov
 */
public class ZooFactory {

    private Reflections scanner = new Reflections("zoo");

    private List<Class<? extends Animal>> animalClasses = new ArrayList<>();


    public ZooFactory() {
        Set<Class<? extends Animal>> classes = scanner.getSubTypesOf(Animal.class);
        for (Class<? extends Animal> aClass : classes) {
            if (!Modifier.isAbstract(aClass.getModifiers())) {
                animalClasses.add(aClass);
            }
        }

    }

    @SneakyThrows
    public Animal createRandomAnimal(){


        Random random = new Random();
        int i = random.nextInt(animalClasses.size());
        Class<? extends Animal> aClass = animalClasses.get(i);
        Animal animal = aClass.newInstance();
        return animal;

    }
}











