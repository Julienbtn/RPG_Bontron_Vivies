package fr.polytech.apo.vivies_bontron.rpg.character;

import fr.polytech.apo.vivies_bontron.rpg.action.Capacity;
import fr.polytech.apo.vivies_bontron.rpg.item.Consumable;

abstract class Player extends Character {

    public Player(String name, int strength, int speed, int defense) {
        super(name, strength, speed, defense);
    }

    public void act(Object object, Character target) {
    }
}
