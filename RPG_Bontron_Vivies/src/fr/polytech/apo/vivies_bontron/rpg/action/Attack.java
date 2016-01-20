package fr.polytech.apo.vivies_bontron.rpg.action;

import fr.polytech.apo.vivies_bontron.rpg.character.Caracteristic;
import fr.polytech.apo.vivies_bontron.rpg.character.Character;

public class Attack implements Capacity {

    @Override
    public Effect effect(Character src, Character target) {
        target.getCaracteristic().put(Caracteristic.HEALTH, target.getHealth() - src.getStrength());
        System.out.println(src.getName() + " a infligé " + (src.getStrength()) + " points de dégât à " + target.getName() + ".");
        if (target.getHealth() <= 0) {
            System.out.println(src.getName() + " a vaincu " + target.getName() + ".");
        } else {
            System.out.println(target.getName() + " : " + target.getHealth());
        }
        return src.getWeaponequiped().getEffect();
    }

}
