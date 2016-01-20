package fr.polytech.apo.vivies_bontron.rpg.action;

import fr.polytech.apo.vivies_bontron.rpg.character.Caracteristic;
import fr.polytech.apo.vivies_bontron.rpg.character.Character;


public class Block implements Capacity {
    
    @Override
    public Effect effect(Character src, Character target) {
         src.getCaracteristic().put(Caracteristic.DEFENSE, src.getDefense() * 2);
         return src.getGearequiped().getEffect();
    }
}
