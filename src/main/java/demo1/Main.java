package demo1;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Evgeny Borisov
 */
@Slf4j
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
