package fr.polytech.apo.vivies_bontron.rpg.character;


public class Archer extends Character {

    public Archer(String name) {
        super(name);
        getCaracteristic().put(Caracteristic.STRENGTH, 12);
        getCaracteristic().put(Caracteristic.SPEED, 14);
        getCaracteristic().put(Caracteristic.DEFENSE, 9);
    }
}
