package my_spring;

import lombok.Data;

/**
 * @author Evgeny Borisov
 */
@Data
public class Messenger {

    @InjectRandomQuote(Quote.CHUCK_NORRIS)
    private String quote1;

    @InjectRandomQuote(Quote.GAME_OF_THRONES)
    private String quote2;


}
