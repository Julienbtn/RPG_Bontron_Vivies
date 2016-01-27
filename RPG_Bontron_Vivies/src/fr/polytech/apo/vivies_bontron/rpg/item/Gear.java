package fr.polytech.apo.vivies_bontron.rpg.item;


public class Gear extends Item {
    private int resistance;
    private int dexterity;
    
    public Gear(String name, int weight,int resistance, int dexterity){
        super(name,weight);
        this.resistance=resistance;
        this.dexterity=dexterity;
    }


    public int Gear(String name, int weight, int resistance) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     * @return the resistance
     */
    public int getResistance() {
        return resistance;
    }

    /**
     * @param resistance the resistance to set
     */
    public void setResistance(int resistance) {
        this.resistance = resistance;
    }

    /**
     * @return the dexterity
     */
    public int getDexterity() {
        return dexterity;
    }

    /**
     * @param dexterity the dexterity to set
     */
    public void setDexterity(int dexterity) {
        this.dexterity = dexterity;
    }
}
