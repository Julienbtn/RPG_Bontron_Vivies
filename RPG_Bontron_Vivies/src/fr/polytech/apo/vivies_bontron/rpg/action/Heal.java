package fr.polytech.apo.vivies_bontron.rpg.action;

import fr.polytech.apo.vivies_bontron.rpg.character.Caracteristic;
import fr.polytech.apo.vivies_bontron.rpg.character.Character;
import fr.polytech.apo.vivies_bontron.rpg.item.Consumable;
import fr.polytech.apo.vivies_bontron.rpg.item.Weapon;

public class Heal implements Capacity {

    private Object weapon;

    @Override
    public Effect effect(Character src, Character target) {
          Effect weaponeffect = null;
        src.getCaracteristic().put(Caracteristic.HEALTH, src.getHealth() + src.getWeaponequiped().getHeal());
        if (src.getWeaponequiped() != null) 
            weaponeffect = src.getWeaponequiped().getEffect();
            return weaponeffect;
        }
    }

