package quoters;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

/**
 * @author Evgeny Borisov
 */
@Service
public class MainService {

    @Autowired
    private QuoterAggregator quoterAggregator;

    @PostConstruct
    public void doWork(){
        quoterAggregator.sayAllQuotes();
    }
}
