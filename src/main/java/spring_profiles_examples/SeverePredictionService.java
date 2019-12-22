package spring_profiles_examples;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * @author Evgeny Borisov
 */

@Service
@Profile("WINTER_IS_HERE")
public class SeverePredictionService implements PredictionService {
    @Override
    public boolean willSurviveTheWinter(String name) {
        return name.toLowerCase().contains("lanister");
    }
}
