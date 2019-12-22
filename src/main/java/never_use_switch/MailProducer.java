package never_use_switch;

import org.fluttercode.datafactory.impl.DataFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Random;

/**
 * @author Evgeny Borisov
 */
@Component
public class MailProducer {

    @Autowired
    private MailSender mailSender;
    @Autowired
    private Random random;
    @Autowired
    private DataFactory dataFactory;

    @Scheduled(fixedDelay = 1000)
    public void produceMailInfo() {
        int i = random.nextInt(3)+1;
        MailInfo mailInfo = MailInfo.builder().email(dataFactory.getEmailAddress()).mailType(i).build();
        mailSender.sendMail(mailInfo);

    }
}
