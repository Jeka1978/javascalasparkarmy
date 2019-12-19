package multiple_inheritance;

/**
 * @author Evgeny Borisov
 */
public interface Rasar {

   default void talk(){
       System.out.println("COME TO ME!!!");
   }
}
