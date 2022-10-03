package lotr;

import java.util.Random;

public class Noble extends Character{
    private final static Random randomGenerator = new Random();
    public Noble(int min, int max) {
        super(randomGenerator.nextInt(max-min+1) + min, randomGenerator.nextInt(max-min+1)+min);
    }

    @Override
    public void kick(Character c) {
        c.setHp(c.getHp() - randomGenerator.nextInt(getPower()+1));
    }
}
