package fr.polytech.apo.vivies_bontron.rpg.character;

import fr.polytech.apo.vivies_bontron.rpg.action.Attack;
import fr.polytech.apo.vivies_bontron.rpg.action.Capacity;
import fr.polytech.apo.vivies_bontron.rpg.action.Heal;

public class IA extends Player {

    public IA(String name, int strength, int speed, int defense) {
        super(name, strength, speed, defense);
    }

   @Override
    public void act(Object object, Character target) {
        /*if (this.getHealth() <= 25) 
        {
            ((Heal) object).effect(this, this);
        } else {*/
            ((Attack) object).effect(this, target); 
       // }
    }
}
        


