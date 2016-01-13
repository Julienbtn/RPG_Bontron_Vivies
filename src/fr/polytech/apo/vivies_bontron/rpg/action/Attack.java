package fr.polytech.apo.vivies_bontron.rpg.action;

public class Attack implements Capacity {

    public Character Effect(Character src, Character target) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double accuracy() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }    
    
 
    @Override
    public void attack(Character src, Character target) {
        target.getHealth() =-src.getStrenght(); 
    }
    
    @Override
    public void block(Character src, Character target) {
        target.getHealth() =-(target.getDefense()-src.getStrenght());
}
    
    @Override
    public void heal(Character src, Character target) {
}

    @Override
    public Character effect(Character src, Character target) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
