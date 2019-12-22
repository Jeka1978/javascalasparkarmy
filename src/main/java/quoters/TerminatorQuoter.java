package quoters;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;

import static java.util.Arrays.asList;

/**
 * @author Evgeny Borisov
 */
@Component
public class TerminatorQuoter implements Quoter {

    private List<String> messages;


    @Value("${os}")
    public void setJavaHome(String javaHome){
        System.out.println(javaHome);
    }

    @Value("${terminator}")
    public void setMessages(String[] messages) {
        this.messages = asList(messages);
    }

    @Override
    public void sayQuote() {
        messages.forEach(System.out::println);
    }
}
