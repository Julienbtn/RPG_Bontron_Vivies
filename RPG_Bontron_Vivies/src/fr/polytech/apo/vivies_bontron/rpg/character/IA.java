package fr.polytech.apo.vivies_bontron.rpg.character;

import fr.polytech.apo.vivies_bontron.rpg.action.Attack;
import fr.polytech.apo.vivies_bontron.rpg.action.Capacity;
import fr.polytech.apo.vivies_bontron.rpg.action.Effect;
import fr.polytech.apo.vivies_bontron.rpg.action.Heal;

public class IA extends Player {

    public IA(String name, int strength, int speed, int defense, int health) {
        super(name, strength, speed, defense, health);
    }

    @Override
    public Effect act(Object object, Character target) {
        /*if (this.getHealth() <= 25) 
        {
            ((Heal) object).effect(this, this);
        } else {*/
        Effect effect = ((Attack) object).effect(this, target);
        
        return effect;
    }
}
