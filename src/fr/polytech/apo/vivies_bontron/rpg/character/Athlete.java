package fr.polytech.apo.vivies_bontron.rpg.character;

import static fr.polytech.apo.vivies_bontron.rpg.character.Caracteristic.SPEED;

public class Athlete extends Character {

    public Athlete(String name) {
        super(name);
        caracteristic.put(SPEED, 100);
    }
}
