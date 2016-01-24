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

    void effect() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * @return the permanent
     */
    public int getPermanent() {
        return permanent;
    }

    /**
     * @return the value
     */
    public int getValue() {
        return value;
    }

    /**
     * @return the c
     */
    public Caracteristic getC() {
        return c;
    }
}
