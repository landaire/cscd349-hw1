package guitarhero;

/**
 * Created by Lander Brandt on 1/12/15.
 */
public abstract class GameCharacter {
    protected GuitarBehavior guitar;
    protected SoloBehavior solo;

    /**
     * Plays the character's guitar
     */
    public void playGuitar() {
        System.out.printf("%s is playing their guitar\n", name());
        guitar.play();
    }

    /**
     * Plays the character's solo
     */
    public void playSolo() {
        System.out.printf("%s is doing their solo\n", name());
        solo.perform();
    }

    /**
     * @return Character name
     */
    public abstract String name();
}
