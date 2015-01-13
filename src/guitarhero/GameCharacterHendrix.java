package guitarhero;

/**
 * Lander Brandt
 * Sean Burright
 * Tony Moua
 */
public class GameCharacterHendrix extends GameCharacter {
    public GameCharacterHendrix() {
        this.guitar = new GuitarSg();
        this.solo = new JumpOffStageSoloBehavior();
    }

    public String name() {
        return "Jimi Hendrix";
    }
}
