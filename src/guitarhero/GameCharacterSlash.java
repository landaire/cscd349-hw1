package guitarhero;

/**
 * Lander Brandt
 * Sean Burright
 * Tony Moua
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
