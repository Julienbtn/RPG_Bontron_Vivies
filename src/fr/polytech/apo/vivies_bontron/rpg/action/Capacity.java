package fr.polytech.apo.vivies_bontron.rpg.action;


public interface Capacity {

    public Character effect(Character src, Character target);
    public void attack(Character src, Character target);
    public void block(Character src, Character target);
    public void heal(Character src, Character target);
    public double accuracy();
    
}
