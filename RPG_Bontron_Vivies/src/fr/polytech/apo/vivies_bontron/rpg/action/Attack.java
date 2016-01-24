package fr.polytech.apo.vivies_bontron.rpg.action;

import fr.polytech.apo.vivies_bontron.rpg.character.Caracteristic;
import fr.polytech.apo.vivies_bontron.rpg.character.Character;

public class Attack implements Capacity {

    @Override
    public Effect effect(Character src, Character target) {
        Effect weaponeffect = null;
        int blow = (int) ((0.5+ (Math.random()/2))*src.getStrength());
        int damage = (int)(blow - (0.3*target.getDefFight()));
        target.getCaracteristic().put(Caracteristic.HEALTH, target.getHealth() - damage);
        target.setDefFight(target.getDefense());
        System.out.println(src.getName() + " a infligé " + damage + " points de dégât à " + target.getName() + ".");
        if (target.getHealth() <= 0) {
            System.out.println(src.getName() + " a vaincu " + target.getName() + ".");
        } else {
            System.out.println(target.getName() + " : " + target.getHealth());
        }
        if (src.getWeaponequiped() != null) 
            weaponeffect = src.getWeaponequiped().getEffect();
            return weaponeffect;
    }

}
