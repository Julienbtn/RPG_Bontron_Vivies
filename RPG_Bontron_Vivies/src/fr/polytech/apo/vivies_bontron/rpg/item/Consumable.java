package fr.polytech.apo.vivies_bontron.rpg.item;

import fr.polytech.apo.vivies_bontron.rpg.action.Effect;
import fr.polytech.apo.vivies_bontron.rpg.character.Caracteristic;
import fr.polytech.apo.vivies_bontron.rpg.character.Character;

public class Consumable extends Item {

    private int pointdevie;

    public Consumable(String name, int weight, int pointdevie) {
        super(name, weight);
        this.pointdevie = pointdevie;
    }

    public Effect drinkConsumable(Character src, Character target) {
        Consumable potion = null;
        for (int i = 0; i < src.getInventory().size(); i++) {
            if (src.getInventory().get(i) instanceof Consumable) {
                potion = (Consumable) src.getInventory().get(i);
            }
        }
        src.getCaracteristic().put(Caracteristic.HEALTH, target.getHealth() + potion.getPointdevie());
        return potion.getEffect();
    }

    /**
     * @return the pointdevie
     */
    public int getPointdevie() {
        return pointdevie;
    }

    /**
     * @param pointdevie the pointdevie to set
     */
    public void setPointdevie(int pointdevie) {
        this.pointdevie = pointdevie;
    }
}
