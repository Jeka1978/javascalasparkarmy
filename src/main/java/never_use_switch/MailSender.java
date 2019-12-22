package never_use_switch;

/**
 * @author Evgeny Borisov
 */
public class MailSender {
    public void sendMail(MailInfo mailInfo) {
        int mailType = mailInfo.getMailType();
        if (mailType == 1) {
            // 60 lines of code to prepare welcome mail
            System.out.println("welcome mail was sent to "+mailInfo.getEmail());
        }
        if (mailType == 2) {
            //50 lines of code
            System.out.println("don't call we call you. was sent to "+mailInfo.getEmail());
        }
    }
}
