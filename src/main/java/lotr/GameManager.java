package lotr;

public class GameManager {
    public static void fight(Character c1, Character c2){
        while (c1.isAlive() && c2.isAlive()){
            System.out.println("pl1-"+c1 + "  kicks  " + "pl2-"+c2);
            c1.kick(c2);
            System.out.println("Result of the fight: " + "pl2-"+c2);
            if (!c2.isAlive()){
                System.out.println("Player 1 won!");
                break;
            }
            System.out.println("pl2-"+c2 + "  kicks  " + "pl1-"+c1);
            c2.kick(c1);
            System.out.println("Result of the fight: " + "pl1-"+c1);
        }
        System.out.println("PLayer 2 won!");
    }
}
