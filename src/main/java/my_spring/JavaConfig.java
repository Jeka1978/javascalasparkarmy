package my_spring;

import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

/**
 * @author Evgeny Borisov
 */
public class JavaConfig implements Config {
    private Map<Class,Class> ifc2ImplClass = new HashMap<>();

    public JavaConfig() {
        ifc2ImplClass.put(Speaker.class, ConsoleSpeaker.class);
        ifc2ImplClass.put(Cleaner.class, CleanerImpl.class);
    }

    @Override
    public <T> Class<T> getImplClass(Class<T> ifc) {
        return ifc2ImplClass.get(ifc);
    }
}




