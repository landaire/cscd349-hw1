package guitarhero;

/**
 * Lander Brandt
 * Sean Burright
 * Tony Moua
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

    public void changeGuitar(GuitarBehavior guitar) {
        if (guitar == null ) {
            throw new IllegalArgumentException("Guitar cannot be null");
        }

        this.guitar = guitar;
    }

    public void changeSolo(SoloBehavior solo) {
        if (solo == null ) {
            throw new IllegalArgumentException("Solo cannot be null");
        }

        this.solo = solo;
    }

    /**
     * @return Character name
     */
    public abstract String name();
}
