package fr.polytech.apo.vivies_bontron.rpg.item;

import fr.polytech.apo.vivies_bontron.rpg.action.Effect;
import fr.polytech.apo.vivies_bontron.rpg.character.Caracteristic;

public class Item {

    private final String name;

    private final int weigth;

    private Effect effect;

    public Item(String name, int weight) {
        this.name = name;
        this.weigth = weight;
    }

    public int Item(String name, int weight) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public Caracteristic getEffectValue(Caracteristic caracteristic) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void addEffect(Effect effect) {
        this.effect = effect;
    }

    /**
     * @return the effect
     */
    public Effect getEffect() {
        return effect;
    }
}
