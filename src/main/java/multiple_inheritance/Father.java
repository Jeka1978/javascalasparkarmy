package multiple_inheritance;

/**
 * @author Evgeny Borisov
 */
public interface Father {

   default void talk(){
       System.out.println("Come to me");
   }
}
