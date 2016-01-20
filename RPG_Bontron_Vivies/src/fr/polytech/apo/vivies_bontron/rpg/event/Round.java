package fr.polytech.apo.vivies_bontron.rpg.event;

import fr.polytech.apo.vivies_bontron.rpg.action.Capacity;
import fr.polytech.apo.vivies_bontron.rpg.character.Human;
import fr.polytech.apo.vivies_bontron.rpg.character.IA;
import fr.polytech.apo.vivies_bontron.rpg.item.Consumable;

public class Round {

    Human human;
    IA ia;
    Capacity capacity;
    Consumable consumable;

    public Round() {
        this.human = human;
        this.ia = ia;
        this.capacity = capacity;
        this.consumable = consumable;
    }

    public void roll(Human human, IA ia, Object object) {
        if (human.getSpeed() > ia.getSpeed()) {
            human.act(object, ia);
            if (ia.getHealth() > 0 && human.getHealth() > 0) {
                ia.act(object, human);
            }
        } else {
            ia.act(object, human);
            if (human.getHealth() > 0) {
                human.act(object, ia);
            }
        }
        if (human.getHealth() <= 0 && ia.getHealth() > 0) {
            System.out.println("Game Over");
        } else if (ia.getHealth() <= 0) {
            human.addLevel();
            System.out.println("VICTOIRE ! Vous avez remporté votre combat et gagné un niveau !");
            System.out.println(human.getInfo());
        }
    }
}
