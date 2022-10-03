package lotr;

import java.util.Random;

public class CharacterFactory {
    public static Character createCharacter(){
        int characterNum = new Random().nextInt(4)+1;
        Character character = null;
        switch (characterNum){
            case 1:
                character = new Elf();
                break;
            case 2:
                character = new Hobbit();
                break;
            case 3:
                character = new King();
                break;
            case 4:
                character = new Knight();
                break;
        }
        return character;
    }
}
