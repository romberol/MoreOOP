package lotr;

import lombok.Getter;

@Getter
public abstract class Character {
    private int power;
    private int hp;

    public Character(int hp, int power){
        this.hp = hp;
        this.power = power;
    }

    public void kick(Character c){

    }

    public boolean isAlive(){
        return getHp() > 0;
    }

    public void setHp(int hp) {
        this.hp = Math.max(0, hp);
    }

    public void setPower(int power){
        this.power = Math.max(0, power);
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() +
                "{hp=" + hp +
                ", power=" + power +
                '}';
    }
}
