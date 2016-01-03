package fr.polytech.apo.vivies_bontron.rpg.character;


import fr.polytech.apo.vivies_bontron.rpg.item.Weapon;
import fr.polytech.apo.vivies_bontron.rpg.item.Item;
import fr.polytech.apo.vivies_bontron.rpg.item.Gear;
import fr.polytech.apo.vivies_bontron.rpg.action.Effect;
import java.util.EnumMap;
import java.util.Map;

public class Character {

    private String name;

    protected Map carac;

    private int level;

    private int maxweight;

    private int maxHEALTH;

    private int maxSpeed;

    public Character(String name) {
        this.name = name;
        this.carac = new EnumMap<>(Caracteristic.class);
        carac.put(Caracteristic.STRENGHT, 10);
        carac.put(Caracteristic.SPEED, 10);
        carac.put(Caracteristic.HEALTH, 100);
        this.level = 0;
        this.maxweight = 100;
        this.maxHEALTH = 100;
        this.maxSpeed = 100;
    }

    public String getInfo() {
        return ("Votre personnage s'appelle " + name);
    }

    public Effect applyEffect(Effect effect) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public Weapon equipWeapon(Weapon weapon) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public Gear equipGear(Gear gear) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public int getInventoryWeight() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public Item throwItem(Item item) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public Item addItem(Item item) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void calcMaxHEALTH() {
    }

    public void calcMaxSpeed() {
    }

    public void addLevel() {
    }

    public int sumCarac() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public int getCaracValue(int Caracteristic) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public int Caracteristics() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public int checkCaracteristics() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public int Capacity() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
