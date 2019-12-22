package never_use_switch;

import org.fluttercode.datafactory.impl.DataFactory;
import org.springframework.context.annotation.*;
import org.springframework.scheduling.annotation.EnableScheduling;

import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.function.Function;

import static java.util.stream.Collectors.toMap;

/**
 * @author Evgeny Borisov
 */
@Configuration
@ComponentScan
@EnableScheduling
//@Profile("DEV")
public class Confi {

    @Bean
    public Map<Integer, MailGenerator> mailGeneratorMap(List<MailGenerator> mailGenerators) {
        return mailGenerators.stream().collect(toMap(MailGenerator::getMyCode, Function.identity()));
    }

    @Bean
    public Random random() {
        return new Random();
    }


    @Bean
    public DataFactory dataFactory() {
        return new DataFactory();
    }


    public static void main(String[] args) {
        new AnnotationConfigApplicationContext(Confi.class);
    }

}
