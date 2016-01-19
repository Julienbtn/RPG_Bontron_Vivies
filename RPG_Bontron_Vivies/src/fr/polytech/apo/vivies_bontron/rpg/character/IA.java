package fr.polytech.apo.vivies_bontron.rpg.character;

import fr.polytech.apo.vivies_bontron.rpg.action.Attack;
import fr.polytech.apo.vivies_bontron.rpg.action.Capacity;
import fr.polytech.apo.vivies_bontron.rpg.action.Heal;

public class IA extends Player {

    Character ia;
    Character human; //human ?

    public IA(String name) {
        super(name);
    }

   @Override
    public void act(Object object, Character target) {
        if (ia.getHealth() <= 25) 
        {
            ((Heal) object).effect(ia, ia);
        } else {
            ((Attack) object).effect(ia, human); 
        }
    }
}
        


