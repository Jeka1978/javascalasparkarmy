package real_spring;

import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

/**
 * @author Evgeny Borisov
 */
@Service
@Setter
public class TaxCalculator {



    public double withMaam(double price) {
        double maam = MaamResolverSingleton.getInstance().getMaam();
        return price + maam*price;
    }


}
