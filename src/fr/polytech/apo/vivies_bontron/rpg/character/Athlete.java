package fr.polytech.apo.vivies_bontron.rpg.character;


import fr.polytech.apo.vivies_bontron.rpg.character.Caracteristic;
import fr.polytech.apo.vivies_bontron.rpg.character.Character;


public class Athlete extends Character {

    public Athlete(String name) {
        super(name);
        carac.put(Caracteristic.SPEED, 100);
    }
}
