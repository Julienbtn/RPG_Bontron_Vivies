package fr.polytech.apo.vivies_bontron.rpg.action;

import fr.polytech.apo.vivies_bontron.rpg.character.Caracteristic;


public class Effect {

    private final Caracteristic c;
    private final int value;
    private final int permanent;
    
    public Effect(Caracteristic c, int value,int permanent){
        this.c=c;
        this.value=value;
        this.permanent=permanent;
    }
}
