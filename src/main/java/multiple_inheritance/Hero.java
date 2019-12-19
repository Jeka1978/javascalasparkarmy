package multiple_inheritance;

/**
 * @author Evgeny Borisov
 */
public class Hero implements Father,Rasar {

    @Override
    public void talk() {
        Rasar.super.talk();
        Father.super.talk();
    }
}
