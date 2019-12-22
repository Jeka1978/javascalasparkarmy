package never_use_switch;

import org.springframework.stereotype.Component;

/**
 * @author Evgeny Borisov
 */
@Component
public class EmailCallbackMailGenerator implements MailGenerator {
    @Override
    public String generateHtml() {
        //50 lines of code
        return "don't call us we call you";
    }

    @Override
    public int getMyCode() {
        return 2;
    }
}
