package fr.polytech.apo.vivies_bontron.rpg.character;

import fr.polytech.apo.vivies_bontron.rpg.action.Action;
import fr.polytech.apo.vivies_bontron.rpg.action.Attack;
import fr.polytech.apo.vivies_bontron.rpg.action.Block;
import fr.polytech.apo.vivies_bontron.rpg.action.Capacity;
import fr.polytech.apo.vivies_bontron.rpg.action.Effect;
import fr.polytech.apo.vivies_bontron.rpg.action.Heal;
import fr.polytech.apo.vivies_bontron.rpg.item.Consumable;
import fr.polytech.apo.vivies_bontron.rpg.item.Gear;
import fr.polytech.apo.vivies_bontron.rpg.item.Weapon;
import java.util.Scanner;

public class Human extends Player {

    protected Character ia;
    protected Character human;

    public Human(String name, int strength, int speed, int defense, int health) {
        super(name, strength, speed, defense, health);
    }

    @Override
    public Effect act(Object object, Character target) {
        Action action = null;
        Effect effect = null;
        if (object instanceof Consumable){
            action = new Action((Character)this, target, (Consumable)object);
        } else if (object instanceof Capacity){
            action = new Action((Character)this, target, (Capacity)object);
        }
        effect = action.doAction();
        return effect;
    }

    public void amelioration(int nbCombat) {
        switch (nbCombat) {
            case 1:
                if (this instanceof Warrior) {
                    Weapon arme5 = new Weapon("Epée de fer", 7, 9, 0);
                    System.out.println("Vous avez reçu : Epée de fer");
                    this.equipWeapon(arme5);
                }
                else if (this instanceof Archer) {
                    Weapon arme5 = new Weapon("Arc solide", 6, 12, 0);
                    System.out.println("\n Vous avez reçu : Arc solide");
                    this.equipWeapon(arme5);
                }
                else {
                    Weapon arme5 = new Weapon("Baton mana", 7, 6, 12);
                    System.out.println("\n Vous avez reçu : Bâton mana");
                    this.equipWeapon(arme5);
                }       break;
            case 2:
                if (this instanceof Warrior) {
                    Weapon arme7 = new Weapon("Epée incendiaire", 10, 12, 0);
                    System.out.println("Vous avez reçu : Epée incendiaire");
                    this.equipWeapon(arme7);
                } else if (this instanceof Archer) {
                    Weapon arme7 = new Weapon("Arc et flèches-éclair", 6, 18, 0);
                    System.out.println("Vous avez reçu : Arc et flèches-éclair");
                    this.equipWeapon(arme7);
                } else {
                    Weapon arme7 = new Weapon("Bâton magma cristallisé moyen", 7, 8, 14);
                    System.out.println("\n Vous avez reçu : Bâton magma cristallisé moyen");
                    this.equipWeapon(arme7);
                }       break;
            case 3:
                if (this instanceof Warrior) {
                    Gear armure3 = new Gear("Armure légère", 5, 10, 0);
                    System.out.println("Vous avez reçu : "+armure3.getName());
                    this.equipGear(armure3);
                } else if (this instanceof Archer) {
                    Gear armure3 = new Gear("Armure légère", 5, 10, 0);
                    System.out.println("Vous avez reçu : "+armure3.getName());
                    this.equipGear(armure3);
                } else {
                    Gear armure3 = new Gear("Armure légère", 5, 10, 0);
                    System.out.println("Vous avez reçu : "+armure3.getName());
                    this.equipGear(armure3);
                }       break;
            case 4:
                if (this instanceof Warrior) {
                    Weapon arme13 = new Weapon("Epée millénaire", 15, 20, 0);
                    System.out.println("Vous avez reçu : "+arme13.getName());
                    this.equipWeapon(arme13);
                } else if (this instanceof Archer) {
                    Weapon arme13 = new Weapon("Arc solide et flèches enflamées", 8, 22, 0);
                    System.out.println("Vous avez reçu : "+arme13.getName());
                    this.equipWeapon(arme13);
                } else {
                    Weapon arme13 = new Weapon("Bâton magma cristallisé puissant", 10, 13, 14);
                    System.out.println("\n Vous avez reçu : "+arme13.getName());
                    this.equipWeapon(arme13);
                }       break;
                case 5:
                if (this instanceof Warrior) {
                    Gear armure4 = new Gear("Armure elfique", 10, 20, 5);
                    System.out.println("Vous avez reçu : "+armure4.getName());
                    this.equipGear(armure4);
                } else if (this instanceof Archer) {
                    Gear armure4 = new Gear("Cape de Camouflage", 7, 14, 8);
                    System.out.println("Vous avez reçu : "+armure4.getName());
                    this.equipGear(armure4);
                } else {
                    Gear armure4 = new Gear("Cape de Mage", 8, 16, 4);
                    System.out.println("Vous avez reçu : "+armure4.getName());
                    this.equipGear(armure4);
                }       break;
                case 6:
                if (this instanceof Warrior) {
                    Weapon arme14 = new Weapon("Epée de l'élu", 20, 31, 5);
                    System.out.println("Vous avez reçu : "+arme14.getName());
                    this.equipWeapon(arme14);
                } else if (this instanceof Archer) {
                    Weapon arme14 = new Weapon("Arc en ch^ne ancien et flèches multiples", 15, 33, 3);
                    System.out.println("Vous avez reçu : "+arme14.getName());
                    this.equipWeapon(arme14);
                } else {
                    Weapon arme14 = new Weapon("Bâton de mage", 18, 22, 21);
                    System.out.println("\n Vous avez reçu : "+arme14.getName());
                    this.equipWeapon(arme14);
                }       break;
            default:
                break;
        }
    }
 
}
