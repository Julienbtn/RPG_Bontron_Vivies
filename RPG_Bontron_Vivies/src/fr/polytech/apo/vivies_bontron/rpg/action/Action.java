package fr.polytech.apo.vivies_bontron.rpg.action;

import fr.polytech.apo.vivies_bontron.rpg.character.Caracteristic;
import fr.polytech.apo.vivies_bontron.rpg.item.Consumable;
import fr.polytech.apo.vivies_bontron.rpg.character.Character;
import fr.polytech.apo.vivies_bontron.rpg.character.Human;
import fr.polytech.apo.vivies_bontron.rpg.character.LightMage;
import java.util.Scanner;

public class Action {

    private Character target;

    private Character src;

    private Capacity capacity;

    private Consumable consumable;

    private String action;

    public Action(Character src, Character target, Capacity capacity) {
        this.target = target;
        this.src = src;
        this.capacity = capacity;
    }

    public Action(Character src, Character target, Consumable consumable) {
        this.target = target;
        this.src = src;
        this.consumable = consumable;
    }

    public Effect doAction() {
        Effect effect = null;
        if (capacity == null) {
            src.getCaracteristic().put(Caracteristic.HEALTH, target.getHealth() + consumable.getPointdevie());
        }
        if (consumable == null) {
            if (capacity instanceof Attack) {
                effect = ((Attack) capacity).effect(src, target);
            }
            if (capacity instanceof Block) {
                effect = ((Block) capacity).effect(src, target);
            }
            if (capacity instanceof Heal) {
                effect = ((Heal) capacity).effect(src, target);
            }
        }
        return effect;
    }
        
}
