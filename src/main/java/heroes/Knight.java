package heroes;

import lombok.AllArgsConstructor;
import lombok.Setter;

/**
 * @author Evgeny Borisov
 */
@AllArgsConstructor
public class Knight implements Character {

    @Setter
    private Weapon weapon;


    public void fight() {
        weapon.fight();
    }
}




