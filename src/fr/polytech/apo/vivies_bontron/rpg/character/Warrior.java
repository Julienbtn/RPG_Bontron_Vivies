package fr.polytech.apo.vivies_bontron.rpg.character;


import fr.polytech.apo.vivies_bontron.rpg.character.Caracteristic;
import fr.polytech.apo.vivies_bontron.rpg.character.Character;


public class Warrior extends Character {

    public Warrior(String name) {
        super(name);
        carac.put(Caracteristic.STRENGHT, 100);
    }
}
