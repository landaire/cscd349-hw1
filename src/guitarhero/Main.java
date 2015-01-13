package guitarhero;

public class Main {

    public static void main(String[] args) {
        GameCharacter[] characters = {
                new GameCharacterSlash(),
                new GameCharacterHendrix(),
                new GameCharacterYoung(),
        };

        GuitarBehavior[] guitars = {
                new GuitarFlyingV(),
                new GuitarSg(),
                new GuitarTelecaster(),
        };

        SoloBehavior[] solos = {
                new PutGuitarOnFireBehavior(),
                new SmashGuitarBehavior(),
                new JumpOffStageBehavior(),
        };

        System.out.println("--BASE CONFIGURATIONS--\n");
        // Kind of unnecessary to loop, but each character is supposed to
        // play guitar, then each plays solo
        for (GameCharacter character : characters) {
            character.playGuitar();
            character.playSolo();
        }

        System.out.println("\n--SWAPPING BEHAVIOR--");

        // Start swapping solos and guitars
        for (GameCharacter character : characters) {
            System.out.println();
            for (GuitarBehavior guitar : guitars) {
                System.out.printf("Changing %s's guitar to %s\n", character.name(), guitar.getClass().getSimpleName());
                character.changeGuitar(guitar);
                character.playGuitar();
            }

            for (SoloBehavior solo : solos) {
                System.out.printf("Changing %s's solo to %s\n", character.name(), solo.getClass().getSimpleName());
                character.changeSolo(solo);
                character.playSolo();
            }

            System.out.println();
        }
    }
}
