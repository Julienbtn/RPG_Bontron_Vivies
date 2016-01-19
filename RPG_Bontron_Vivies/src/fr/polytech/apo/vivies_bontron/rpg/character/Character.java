package fr.polytech.apo.vivies_bontron.rpg.character;

import fr.polytech.apo.vivies_bontron.rpg.item.Weapon;
import fr.polytech.apo.vivies_bontron.rpg.item.Item;
import fr.polytech.apo.vivies_bontron.rpg.item.Gear;
import fr.polytech.apo.vivies_bontron.rpg.action.Effect;
import static fr.polytech.apo.vivies_bontron.rpg.character.Caracteristic.*;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;

public class Character {

    private final String name;

    private Map caracteristic;

    private int level;

    private final int maxweight;

    private final int maxHEALTH;

    private final int maxSpeed;

    private Weapon weaponequiped;
    
    private Gear gearequiped;
    
    private List<Item> inventory;

    public Character(String name) {
        this.name = name;
        this.caracteristic = new EnumMap<>(Caracteristic.class);
        caracteristic.put(STRENGTH, 1);
        caracteristic.put(SPEED, 1);
        caracteristic.put(HEALTH, 100);
        caracteristic.put(DEFENSE, 1);
        this.level = 1;
        this.maxweight = 100;
        this.maxHEALTH = 100;
        this.maxSpeed = 100;
    }

    public Character(String name, int strenght) {
        this.name = name;
        this.caracteristic = new EnumMap<>(Caracteristic.class);
        caracteristic.put(STRENGTH, strenght);
        caracteristic.put(SPEED, 10);
        caracteristic.put(HEALTH, 100);
        caracteristic.put(DEFENSE, 10);
        this.level = 1;
        this.maxweight = 100;
        this.maxHEALTH = 100;
        this.maxSpeed = 100;
    }

    public Character(String name, int strenght, int speed) {
        this.name = name;
        this.caracteristic = new EnumMap<>(Caracteristic.class);
        caracteristic.put(STRENGTH, strenght);
        caracteristic.put(SPEED, speed);
        caracteristic.put(HEALTH, 100);
        caracteristic.put(DEFENSE, 10);
        this.level = 1;
        this.maxweight = 100;
        this.maxHEALTH = 100;
        this.maxSpeed = 100;

    }

    public String getInfo() {
        return ("Votre personnage s'appelle " + getName());
    }

    public Effect applyEffect(Effect effect) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void equipWeapon(Weapon weapon, Character player) {
        if (getWeaponequiped() != null) {
            getCaracteristic().put(Caracteristic.STRENGTH, player.getStrength() - getWeaponequiped().getDamage());
        }
        this.weaponequiped = weapon;
        getCaracteristic().put(Caracteristic.STRENGTH, player.getStrength() + weapon.getDamage());
    }

    public void equipGear(Gear gear, Character player) {
        if (getWeaponequiped() != null) {
            getCaracteristic().put(Caracteristic.DEFENSE, player.getStrength() - getGearequiped().getResistance());
            getCaracteristic().put(Caracteristic.SPEED, player.getStrength() - getGearequiped().getDexterity());
        }
        this.gearequiped = gear;
        getCaracteristic().put(Caracteristic.DEFENSE, player.getStrength() + getGearequiped().getResistance());
        getCaracteristic().put(Caracteristic.SPEED, player.getStrength() + getGearequiped().getDexterity());
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
        // rajouter int experience. quand experience =100 on fait level=level+1
        level = level + 1;
        getCaracteristic().put(Caracteristic.DEFENSE, getDefense() + 10);
        getCaracteristic().put(Caracteristic.STRENGTH, getStrength() + 10);
        getCaracteristic().put(Caracteristic.SPEED, getSpeed() + 10);
        getCaracteristic().put(Caracteristic.HEALTH, getHealth() + 10);
    }

    public int sumCarac() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public int getSpeed() {
        return (int) getCaracteristic().get(SPEED);
    }

    public int getHealth() {
        return (int) getCaracteristic().get(HEALTH);
    }

    public int getStrength() {
        return (int) getCaracteristic().get(STRENGTH);
    }

    public int getDefense() {
        return (int) getCaracteristic().get(DEFENSE);
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

    public void block(Character src) {
        getCaracteristic().put(Caracteristic.DEFENSE, src.getDefense() * 2);
    }

    void heal(Character src, Character target) {
        getCaracteristic().put(Caracteristic.HEALTH, 5 + src.getHealth());
    }

    public void attack(Character src, Character target) {
        getCaracteristic().put(Caracteristic.HEALTH, target.getHealth() - src.getStrength());
        System.out.println(src.getName() + " a infligé " + (target.getHealth() - src.getStrength()) + " points de dégât à " + target.getName());
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @return the caracteristic
     */
    public Map getCaracteristic() {
        return caracteristic;
    }

    /**
     * @param caracteristic the caracteristic to set
     */
    public void setCaracteristic(Map caracteristic) {
        this.caracteristic = caracteristic;
    }

    /**
     * @return the weaponequiped
     */
    public Weapon getWeaponequiped() {
        return weaponequiped;
    }

    /**
     * @return the gearequiped
     */
    public Gear getGearequiped() {
        return gearequiped;
    }

    /**
     * @return the inventory
     */
    public List<Item> getInventory() {
        return inventory;
    }

    /**
     * @param inventory the inventory to set
     */
    public void setInventory(List<Item> inventory) {
        this.inventory = inventory;
    }
}
