package real_spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author Evgeny Borisov
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        TaxCalculator taxCalculator = context.getBean(TaxCalculator.class);
        double withMaam = taxCalculator.withMaam(100);
        System.out.println(withMaam);
    }
}
