package fr.polytech.apo.vivies_bontron.rpg.action;

import fr.polytech.apo.vivies_bontron.rpg.character.Caracteristic;
import fr.polytech.apo.vivies_bontron.rpg.character.Character;
import fr.polytech.apo.vivies_bontron.rpg.item.Consumable;

public class Heal implements Capacity {

    @Override
    public Effect effect(Character src, Character target) {
        Consumable potion = null;
        for (int i = 0; i < src.getInventory().size(); i++) {
            if (src.getInventory().get(i) instanceof Consumable) {
                potion = (Consumable) src.getInventory().get(i);
            }
        }
        src.getCaracteristic().put(Caracteristic.HEALTH, target.getHealth() + potion.getPointdevie());
        return potion.getEffect();
    }
}
