package guitarhero;

public class Main {

    public static void main(String[] args) {
        GameCharacter[] characters = {
                new GameCharacterSlash(),
                new GameCharacterHendrix(),
                new GameCharacterYoung(),
        };

        // Kind of unnecessary to loop, but each character is supposed to
        // play guitar, then each plays solo
        for (GameCharacter character : characters) {
            character.playGuitar();
        }

        for (GameCharacter character : characters) {
            character.playSolo();
        }
    }
}
