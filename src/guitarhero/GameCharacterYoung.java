package guitarhero;

/**
 * Lander Brandt
 * Sean Burright
 * Tony Moua
 */
public class GameCharacterYoung extends GameCharacter {

    public GameCharacterYoung() {
        guitar = new GuitarTelecaster();
        solo = new PutGuitarOnFireSoloBehavior();
    }

    public String name() {
        return "Angus Young";
    }
}
