package fr.polytech.apo.vivies_bontron.rpg.character;

import fr.polytech.apo.vivies_bontron.rpg.action.Capacity;
import fr.polytech.apo.vivies_bontron.rpg.action.Effect;
import fr.polytech.apo.vivies_bontron.rpg.item.Consumable;

abstract class Player extends Character {

    public Player(String name, int strength, int speed, int defense, int health) {
        super(name, strength, speed, defense, health);
    }

    public Effect act(Object object, Character target) {
        return null;
    }
    
}
