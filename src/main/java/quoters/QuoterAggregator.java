package quoters;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author Evgeny Borisov
 */
@Component
public class QuoterAggregator {

    @Autowired
    private List<Quoter> quoters;

//    @Scheduled(fixedDelay = 1000)
    public void sayAllQuotes(){
        quoters.forEach(Quoter::sayQuote);
    }
}
