package zoo;

/**
 * @author Evgeny Borisov
 */
public class Main {
    public static void main(String[] args) {
        ZooFactory zooFactory = new ZooFactory();
        for (int i = 0; i < 10; i++) {
            zooFactory.createRandomAnimal().makeVoice();
        }
    }
}
