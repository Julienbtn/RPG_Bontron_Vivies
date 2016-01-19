package fr.polytech.apo.vivies_bontron.rpg.item;

public class Consumable extends Item {
    
    private int pointdevie;

    public Consumable(String name, int weight, int pointdevie) {
        super(name, weight);
        this.pointdevie = pointdevie;
    }

    public int consumable(String name, int weigth) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     * @return the pointdevie
     */
    public int getPointdevie() {
        return pointdevie;
    }

    /**
     * @param pointdevie the pointdevie to set
     */
    public void setPointdevie(int pointdevie) {
        this.pointdevie = pointdevie;
    }
}
