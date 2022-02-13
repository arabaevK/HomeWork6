package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setHealth(800);
        boss.setDamage(50);
        boss.oruzhie.setSteelArms("amongus");
        boss.oruzhie.setSword("Sword");
        /*System.out.println("Armor: " + boss.oruzhie.getSteelArms() + " Weapon: " + boss.oruzhie.getSword() + " Health: "
                + boss.getHealth() +
                " Damage: " + boss.getDamage());*/
        System.out.println("Boss: " + boss.info());

        Skeleton skeleton = new Skeleton();
        skeleton.setHealth(200);
        skeleton.setDamage(20);
        skeleton.setArrow(10);
        skeleton.oruzhie.setSword("Onion");
        System.out.println("Skeleton: " + skeleton.info() + " Arrows: " + skeleton.getArrow() );

        Skeleton skeleton1 = new Skeleton();
        skeleton1.setHealth(200);
        skeleton1.setDamage(20);
        skeleton1.setArrow(10);
        skeleton1.oruzhie.setSword("Onion");
        System.out.println("Skeleton1: " + skeleton1.info() + " Arrows: " + skeleton1.getArrow());
    }


}
