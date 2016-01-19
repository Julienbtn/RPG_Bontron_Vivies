package fr.polytech.apo.vivies_bontron.rpg.character;

import fr.polytech.apo.vivies_bontron.rpg.action.Capacity;
import fr.polytech.apo.vivies_bontron.rpg.item.Consumable;

abstract class Player extends Character {

    public Player(String name) {
        super(name);
    }

    public void act(Object object, Character target) {
    }
}
