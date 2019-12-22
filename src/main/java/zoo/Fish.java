package zoo;

/**
 * @author Evgeny Borisov
 */
public class Fish implements Animal {
    @Override
    public void makeVoice() {
        System.out.println("Blu blu");
    }
}
