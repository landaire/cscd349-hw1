package guitarhero;

/**
 * Created by Lander Brandt on 1/12/15.
 */
public class GameCharacterSlash extends GameCharacter {

    public GameCharacterSlash() {
        guitar = new GuitarFlyingV();
        solo = new SmashGuitarSoloBehavior();
    }

    public String name() {
        return "Slash";
    }
}
