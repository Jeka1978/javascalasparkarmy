package demo1;

/**
 * @author Evgeny Borisov
 */
public class Main {

    public static void main(String[] args) {
        Person person = Person.builder().age(12).salary(20000)
                .beer("tuborg",2)
                .beer("Leff",4)
                .דג("solomon")

                .name("Jeka").build();
        System.out.println("person = " + person);
    }
}
