package fr.polytech.apo.vivies_bontron.rpg.action;

import fr.polytech.apo.vivies_bontron.rpg.character.Caracteristic;
import fr.polytech.apo.vivies_bontron.rpg.character.Character;

public class Block implements Capacity {

    @Override
    public Effect effect(Character src, Character target) {
        Effect weaponeffect = null;
        src.setDefFight((int)(src.getDefense()*1.2));
        if (src.getWeaponequiped() != null) {
            weaponeffect = src.getWeaponequiped().getEffect();
        }
        return weaponeffect;
    }
}
