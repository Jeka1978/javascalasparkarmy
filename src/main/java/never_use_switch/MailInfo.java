package never_use_switch;

import lombok.Builder;
import lombok.Data;

/**
 * @author Evgeny Borisov
 */
@Data
@Builder
public class MailInfo {
    private String email;
    private int mailType;
}
