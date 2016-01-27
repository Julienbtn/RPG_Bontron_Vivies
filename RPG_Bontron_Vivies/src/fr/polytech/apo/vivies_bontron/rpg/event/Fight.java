/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.polytech.apo.vivies_bontron.rpg.event;

import fr.polytech.apo.vivies_bontron.rpg.action.Attack;
import fr.polytech.apo.vivies_bontron.rpg.action.Block;
import fr.polytech.apo.vivies_bontron.rpg.action.Effect;
import fr.polytech.apo.vivies_bontron.rpg.action.Heal;
import fr.polytech.apo.vivies_bontron.rpg.character.Caracteristic;
import fr.polytech.apo.vivies_bontron.rpg.character.Human;
import fr.polytech.apo.vivies_bontron.rpg.character.IA;
import fr.polytech.apo.vivies_bontron.rpg.character.LightMage;
import fr.polytech.apo.vivies_bontron.rpg.item.Consumable;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Fight {
    private Human hero;
    private IA ennemy;
    
    public Fight(Human hero,IA ennemy){
        int numeroround = 1;
        List<Integer> listTimoutEffect = new ArrayList<Integer>();
        listTimoutEffect.add(0);
        listTimoutEffect.add(0);
        List<Effect> listEffectIn = new ArrayList<Effect>();
        listEffectIn.add(null);
        listEffectIn.add(null);
        hero.setDefFight(hero.getDefense());
        ennemy.setDefFight(ennemy.getDefense());
        while (hero.getHealth() > 0 && ennemy.getHealth() > 0) {
            Object object = choseAction(hero);
            Round r1 = new Round();
            System.out.println("ROUND " + numeroround);
            List<Effect> listEffect = r1.roll(hero, ennemy, object);
            for (int i=0;i>=1;i++) {
                if (listEffectIn.get(i) == null) {
                    if(listEffectIn.get(i) != null) {
                        listEffectIn.set(i, listEffect.get(i));
                        listTimoutEffect.set(i, listEffectIn.get(i).getPermanent());
                    }
                } else {
                    if (i == 0) {
                        hero.getCaracteristic().put(listEffectIn.get(i).getC(), hero.getHealth() - listEffectIn.get(i).getValue());
                    } else if (i == 1) {
                        ennemy.getCaracteristic().put(Caracteristic.HEALTH, ennemy.getHealth() - listEffectIn.get(i).getValue());
                    }
                    
                    listTimoutEffect.set(i, listTimoutEffect.get(i)-1);
                }
                if (listTimoutEffect.get(i) <= 0 && listEffectIn.get(i) != null) {
                    listEffectIn.set(i, null);
                }
            } 
            numeroround++;
    }
    
}
        private static Object choseAction(Human hero) {
        int choice;
        boolean garbage = false;
        Object action = null;
        while (garbage == false) {
            garbage = true;
            System.out.println("Choisissez une action.");
            System.out.println("Attaque : taper 1");
            System.out.println("Défense : taper 2");
            System.out.println("Consommable : taper 3");
            if (hero instanceof LightMage) {
                System.out.println("Soin : taper 4");
            }
            Scanner scanInC = new Scanner(System.in);
            choice = scanInC.nextInt();
            switch (choice) {
                case 1:
                    action = new Attack();
                    break;
                case 2:
                    action = new Block();
                    break;
                case 4:
                    if (hero instanceof LightMage) {
                        action = new Heal();
                    } else {
                        garbage = false;
                    }
                    break;
                case 3:
                    boolean check = false;
                    for (int i = 0; i < hero.getInventory().size(); i++) {
                        if (hero.getInventory().get(i) instanceof Consumable) {
                            check = true;
                        }
                    }
                    if (check == true) {
                        action = new Consumable("Eau de vie", 10, 10);
                    } else {
                        garbage = false;
                    }
                    break;
                default:
                    garbage = false;
            }
        }
        return action;
    }
}
