package lab;

/**
 * @author Evgeny Borisov
 */
@FunctionalInterface
public interface Action<T> {
    void doAction(T t);
    boolean equals(Object o);
}
