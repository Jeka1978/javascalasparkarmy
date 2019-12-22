package my_spring;

import com.github.javafaker.Faker;
import lombok.SneakyThrows;

import java.lang.reflect.Field;

/**
 * @author Evgeny Borisov
 */
public class InjectRandomQuoteObjectConfigurator implements ObjectConfigurator {
    private Faker faker = new Faker();
    @Override
    @SneakyThrows
    public void configure(Object t) {
        Field[] fields = t.getClass().getDeclaredFields();
        for (Field field : fields) {
            InjectRandomQuote annotation = field.getAnnotation(InjectRandomQuote.class);
            if (annotation != null) {
                Quote quote = annotation.value();
                String quoteToInject = null;
                if (quote == Quote.GAME_OF_THRONES) {
                    quoteToInject = faker.gameOfThrones().quote();
                }
                if (quote == Quote.CHUCK_NORRIS) {
                    quoteToInject = faker.chuckNorris().fact();
                }
                field.setAccessible(true);
                field.set(t,quoteToInject);

            }
        }
    }
}
