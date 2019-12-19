package lab;

/**
 * @author Evgeny Borisov
 */
@FunctionalInterface
public interface Equalator<T> {
    boolean isEqual(T t1, T t2);
}
