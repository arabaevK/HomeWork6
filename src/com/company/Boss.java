package com.company;

public class Boss extends GameEntity {
    Weapon oruzhie = new Weapon();

    public Weapon getOruzhie() {
        return oruzhie;
    }

    public void setOruzhie(Weapon oruzhie) {
        this.oruzhie = oruzhie;
    }
    public String info(){
        return this.oruzhie.getSword() + " Health " + getHealth() +
                " Damage: " +  getDamage();
    }
}
