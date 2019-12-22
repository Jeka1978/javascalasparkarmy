package spring_profiles_examples;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Evgeny Borisov
 */
@Service
public class IronBankService {

    @Autowired
    private PredictionService predictionService;


    public String loan(String name, int amount) {
        if (predictionService.willSurviveTheWinter(name)) {
            return "loan was accepted";
        } else {
            return "rejeted, you will die soon, so you will not be able to give back our money";
        }
    }
}
