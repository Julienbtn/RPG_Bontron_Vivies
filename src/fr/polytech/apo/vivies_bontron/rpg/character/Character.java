package fr.polytech.apo.vivies_bontron.rpg.character;


import fr.polytech.apo.vivies_bontron.rpg.item.Weapon;
import fr.polytech.apo.vivies_bontron.rpg.item.Item;
import fr.polytech.apo.vivies_bontron.rpg.item.Gear;
import fr.polytech.apo.vivies_bontron.rpg.action.Effect;
import static fr.polytech.apo.vivies_bontron.rpg.character.Caracteristic.*;
import java.util.EnumMap;
import java.util.Map;

public class Character {

    private final String name;

    protected Map caracteristic;

    private int level;

    private final int maxweight;

    private final int maxHEALTH;

    private final int maxSpeed;

    public Character(String name) {
        this.name = name;
        this.caracteristic = new EnumMap<>(Caracteristic.class);
        caracteristic.put(STRENGHT, 10);
        caracteristic.put(SPEED, 10);
        caracteristic.put(HEALTH, 100);
        caracteristic.put(DEFENSE, 10);
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

    public void addLevel() {
        level=level+1;
    }

    public int sumCarac() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    public int getSpeed(){
        return (int) caracteristic.get(SPEED);
    }
    
    public int getHealth(){
        return (int) caracteristic.get(HEALTH);
    }
    public int getDefense(){
        return (int) caracteristic.get(DEFENSE);
    }
    public int getStrenght(){
        return (int) caracteristic.get(STRENGHT);
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
