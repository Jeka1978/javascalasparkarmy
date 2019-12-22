package never_use_switch;

import org.springframework.stereotype.Component;

/**
 * @author Evgeny Borisov
 */
@Component
public class WelcomeMailGenerator implements MailGenerator {
    @Override
    public String generateHtml() {
        //50 lines of code
        return "welcome new client";
    }

    @Override
    public int getMyCode() {
        return 1;
    }
}
