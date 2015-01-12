package guitarhero;

/**
 * Created by Lander Brandt on 1/12/15.
 */
public class GameCharacterHendrix extends GameCharacter {
    public GameCharacterHendrix() {
        this.guitar = new GuitarSg();
        this.solo = new JumpOffStageBehavior();
    }

    public String name() {
        return "Jimi Hendrix";
    }
}
