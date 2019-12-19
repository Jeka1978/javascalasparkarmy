package heroes;

/**
 * @author Evgeny Borisov
 */
public class Main {
    public static void main(String[] args) {
        Knight knight = new Knight(new Sword());
        knight.fight();
        knight.fight();
        knight.fight();
        knight.setWeapon(new Knife());
        knight.fight();
        knight.fight();
        knight.fight();
    }
}
