package fr.polytech.apo.vivies_bontron.rpg.item;

public class Weapon extends Item {
    
    int damage;
    int heal;
    
    public Weapon(String name, int weight,int damage, int heal){
        super(name,weight);
        this.damage=damage;
        this.heal=heal;
    }

    public int Weapon(String name, int weight, int damage, int heal) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
