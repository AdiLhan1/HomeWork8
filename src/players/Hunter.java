package players;

import boss.Boss;
import game.Ability;

import java.util.Random;

public class Hunter extends Hero {

    public Hunter(int health, int damage){
        super(health, damage, Ability.CRITICAL_DAMAGE);
    }

    @Override
    public void useAbility(Hero[] heroes, Boss boss) {
        Random r = new Random();
        int randomNum = r.nextInt(2) + 2;
        for (Hero hero : heroes) {
            if (hero.getHealth() > 0) {
                hero.setDamage(getDamage() * randomNum);
            }
        }
        System.out.println("Hunter увеличивает в " +randomNum+" раз");

    }
}