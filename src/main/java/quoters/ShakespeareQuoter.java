package quoters;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author Evgeny Borisov
 */
@Component
public class ShakespeareQuoter implements Quoter {

    @Value("${shake}")
    private String message;

    @Override
    public void sayQuote() {
        System.out.println(message);
    }
}
