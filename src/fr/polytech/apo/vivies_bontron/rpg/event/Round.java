package fr.polytech.apo.vivies_bontron.rpg.event;
import fr.polytech.apo.vivies_bontron.rpg.character.Character;

public class Round {

    Character fastest;
    Character slowest;
    Character hero;
    Character ennemy;

    public Round() {
        if (hero.getSpeed() > ennemy.getSpeed()) {
            hero = fastest;
            ennemy = slowest;
        } else {
            ennemy = fastest;
            hero = slowest;
        }
    }

   /* public void Roll() {
        if(hero = fastest) {
            fastest.iaact();
            slowest.act();
        }
            
        else
        {
            fastest.act();
            slowest.iaact();
    }*/
            
        
}

