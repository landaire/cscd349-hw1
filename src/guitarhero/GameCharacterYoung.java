package guitarhero;

/**
 * Created by Lander Brandt on 1/12/15.
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
