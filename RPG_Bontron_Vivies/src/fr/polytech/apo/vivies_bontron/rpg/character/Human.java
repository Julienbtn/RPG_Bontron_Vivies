package fr.polytech.apo.vivies_bontron.rpg.character;

import fr.polytech.apo.vivies_bontron.rpg.action.Action;
import fr.polytech.apo.vivies_bontron.rpg.action.Capacity;
import fr.polytech.apo.vivies_bontron.rpg.item.Consumable;

public class Human extends Player {

    protected Character ia;
    protected Character human;

    public Human(String name, int strength, int speed, int defense) {
        super(name, strength, speed, defense);
    }

    @Override
    public void act(Object object, Character target) {
        Action action = null;
        if (object instanceof Consumable){
            action = new Action((Character)this, target, (Consumable)object);
        } else if (object instanceof Capacity){
            action = new Action((Character)this, target, (Capacity)object);
        }
        action.doAction();
    }
}
