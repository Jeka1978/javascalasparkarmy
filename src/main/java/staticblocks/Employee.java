package staticblocks;

import lombok.SneakyThrows;

/**
 * @author Evgeny Borisov
 */
public class Employee {
    public Employee() {
        System.out.println("I'm constructor");
    }

    {
        System.out.println("I'm initializer");
    }

    static {
        System.out.println("I'm static block");
    }

    @SneakyThrows
    public static void main(String[] args) {

//        Class.forName("staticblocks.Employee");

        for (int i = 0; i < 5; i++) {
            new Employee();

        }
    }
}
