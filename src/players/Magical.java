package players;

import boss.Boss;
import game.Ability;

import java.util.Random;

public class Magical extends Hero {

    public Magical(int health, int damage) {
        super(health, damage, Ability.BOOST);
    }

    @Override
    public void useAbility(Hero[] heroes, Boss boss) {
        Random r = new Random();
        int randomNum = r.nextInt(3) + 1;
        for (Hero hero : heroes) {
            if (hero.getHealth() > 0) {
                hero.setDamage(getDamage() + randomNum);
            }
        }
        System.out.println("Magical увелечивает урон героев на " + randomNum + " раз");

    }
}