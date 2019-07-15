package players;

import boss.Boss;
import game.Ability;

import java.util.Random;

public class Thor extends Hero {
    public Thor(int health, int damage) {
        super(health, damage, Ability.DEAFEN);
    }

    @Override
    public void useAbility(Hero[] heroes, Boss boss) {
        Random random=new Random();
        int randomNum=random.nextInt(2);
        if(randomNum!=0){
            System.out.println("Thor  оглушает Босса на 1 раунд");
            boss.setDamage(0);
        }else{
            boss.setDamage(30);
        }

    }
}

