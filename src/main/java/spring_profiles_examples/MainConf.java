package spring_profiles_examples;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author Evgeny Borisov
 */
@Configuration
@ComponentScan
//spring.profiles.active=WINTER_IS_HERE
public class MainConf {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConf.class);
        IronBankService bankService = context.getBean(IronBankService.class);
        String answer = bankService.loan("john snow stark", 1);
        System.out.println("john snow: ");
        System.out.println("answer = " + answer);

        String answer2 = bankService.loan("therion lanister", 2);
        System.out.println("answer for Therion Lanister ");
        System.out.println("answer2 = " + answer2);
    }
}


