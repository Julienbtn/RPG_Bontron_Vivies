package fr.polytech.apo.vivies_bontron.rpg.character;

import fr.polytech.apo.vivies_bontron.rpg.action.Action;
import fr.polytech.apo.vivies_bontron.rpg.action.Attack;
import fr.polytech.apo.vivies_bontron.rpg.action.Block;
import fr.polytech.apo.vivies_bontron.rpg.action.Capacity;
import fr.polytech.apo.vivies_bontron.rpg.action.Effect;
import fr.polytech.apo.vivies_bontron.rpg.action.Heal;
import fr.polytech.apo.vivies_bontron.rpg.item.Consumable;
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
 
}
