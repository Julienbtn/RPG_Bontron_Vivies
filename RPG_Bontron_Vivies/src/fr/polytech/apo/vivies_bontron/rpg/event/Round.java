package fr.polytech.apo.vivies_bontron.rpg.event;

import fr.polytech.apo.vivies_bontron.rpg.action.Attack;
import fr.polytech.apo.vivies_bontron.rpg.action.Capacity;
import fr.polytech.apo.vivies_bontron.rpg.action.Effect;
import fr.polytech.apo.vivies_bontron.rpg.character.Human;
import fr.polytech.apo.vivies_bontron.rpg.character.IA;
import fr.polytech.apo.vivies_bontron.rpg.item.Consumable;
import java.util.ArrayList;
import java.util.List;

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

    public List<Effect> roll(Human human, IA ia, Object object) {
        Effect effectHero = null;
        Effect effectMonstre = null;
        if (human.getSpeed() > ia.getSpeed()) {
            effectMonstre = human.act(object, ia);
            if (ia.getHealth() > 0 && human.getHealth() > 0) {
                effectHero = ia.act(new Attack(), human);
            }
        } else {
            effectHero = ia.act(new Attack(), human);
            if (human.getHealth() > 0) {
                effectMonstre = human.act(object, ia);
            }
        }
        if (human.getHealth() <= 0 && ia.getHealth() > 0) {
            System.out.println("Game Over");
        } else if (ia.getHealth() <= 0) {
            human.addLevel(human);
            System.out.println("VICTOIRE ! Vous avez remporté votre combat et gagné un niveau !");
            System.out.println("Nouvelles statistiques de " + human.getInfo() + "\n");
        }
        
        List<Effect> listEffect = new ArrayList<Effect>();
        listEffect.add(effectHero);
        listEffect.add(effectMonstre);
        return listEffect;
    }
}
