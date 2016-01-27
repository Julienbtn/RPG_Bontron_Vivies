package fr.polytech.apo.vivies_bontron.rpg.character;

import fr.polytech.apo.vivies_bontron.rpg.action.Action;
import fr.polytech.apo.vivies_bontron.rpg.action.Attack;
import fr.polytech.apo.vivies_bontron.rpg.action.Block;
import fr.polytech.apo.vivies_bontron.rpg.action.Capacity;
import fr.polytech.apo.vivies_bontron.rpg.action.Effect;
import fr.polytech.apo.vivies_bontron.rpg.action.Heal;
import fr.polytech.apo.vivies_bontron.rpg.item.Consumable;
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
        if (nbCombat == 1){
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
        }
        }  
            
        else if (nbCombat ==2)
        {
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
        }
            System.out.println("Le reste de la route de déroule sans réel soucis. Le Palais Noir vous tend les portes et Valentine vous dévisage assise sur son trône.\n"
                    + "Elle vous attaque avec ses ombres mais vous êtes préparé.\n");
                          
        }
    }
 
}
