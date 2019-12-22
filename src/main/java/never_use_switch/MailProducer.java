package never_use_switch;

import org.fluttercode.datafactory.impl.DataFactory;

import java.util.Random;

/**
 * @author Evgeny Borisov
 */
public class MailProducer {

    private MailSender mailSender;
    private Random random = new Random();
    private DataFactory dataFactory = new DataFactory();

    //todo
    //this method should work every second
    public void produceMailInfo() {
        int i = random.nextInt(2)+1;
        MailInfo mailInfo = MailInfo.builder().email(dataFactory.getEmailAddress()).mailType(i).build();
        mailSender.sendMail(mailInfo);

    }
}
