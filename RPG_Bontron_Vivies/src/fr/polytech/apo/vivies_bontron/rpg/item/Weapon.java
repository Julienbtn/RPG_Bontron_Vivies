package fr.polytech.apo.vivies_bontron.rpg.item;

public class Weapon extends Item {
    
    private int damage;
    private int heal;
    
    public Weapon(String name, int weight,int damage, int heal){
        super(name,weight);
        this.damage=damage;
        this.heal=heal;
    }

    public int Weapon(String name, int weight, int damage, int heal) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     * @return the damage
     */
    public int getDamage() {
        return damage;
    }

    /**
     * @param damage the damage to set
     */
    public void setDamage(int damage) {
        this.damage = damage;
    }

    /**
     * @return the heal
     */
    public int getHeal() {
        return heal;
    }

}
