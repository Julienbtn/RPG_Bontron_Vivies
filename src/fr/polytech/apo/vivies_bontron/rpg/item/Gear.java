package fr.polytech.apo.vivies_bontron.rpg.item;


public class Gear extends Item {
    int resistance;
    
    public Gear(String name, int weight,int resistance){
        super(name,weight);
        this.resistance=resistance;
    }

    public int Gear(String name, int weight, int resistance) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
