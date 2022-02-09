package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setHealth(800);
        boss.setDamage(50);
        boss.setDefenseType("Magic");
        System.out.println("Health: " + boss.getHealth() + " Damage: " +
                boss.getDamage() + " Defense Type: "
                + boss.getDefenseType());
        Hero[] heroes = createHeroes();
        for (Hero hero:heroes) {
            System.out.println(hero.getHealth()+ " " + hero.getDamage() + " " + hero.getAbility());
        }
    }
    public static Hero[] createHeroes(){
        Hero c1 = new Hero(200, 20, "ability");
        Hero c2 = new Hero(250, 20);
        Hero c3 = new Hero(300, 15, "ability");
        Hero[] heroes = {c1, c2, c3};
        System.out.println();
        return heroes;
    }
}
