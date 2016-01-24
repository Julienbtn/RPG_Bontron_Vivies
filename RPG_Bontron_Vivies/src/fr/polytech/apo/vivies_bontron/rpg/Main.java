package fr.polytech.apo.vivies_bontron.rpg;

import fr.polytech.apo.vivies_bontron.rpg.action.Attack;
import fr.polytech.apo.vivies_bontron.rpg.action.Block;
import fr.polytech.apo.vivies_bontron.rpg.action.Effect;
import fr.polytech.apo.vivies_bontron.rpg.action.Heal;
import fr.polytech.apo.vivies_bontron.rpg.character.Archer;
import fr.polytech.apo.vivies_bontron.rpg.character.Caracteristic;
import fr.polytech.apo.vivies_bontron.rpg.character.Human;
import fr.polytech.apo.vivies_bontron.rpg.character.IA;
import fr.polytech.apo.vivies_bontron.rpg.character.LightMage;
import fr.polytech.apo.vivies_bontron.rpg.character.Warrior;
import fr.polytech.apo.vivies_bontron.rpg.event.Round;
import fr.polytech.apo.vivies_bontron.rpg.item.Consumable;
import fr.polytech.apo.vivies_bontron.rpg.item.Gear;
import fr.polytech.apo.vivies_bontron.rpg.item.Weapon;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    private static Human hero;

    private static Object choseAction() {
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

    public static void main(String[] args) {
        //Scénario
        System.out.println("Enfant déjà les gens vous appelaient l'élu.\n"
                + "Leur semblable touché par la lumière, le sauveur venu écarter les ténèbres oppressantes.\n "
                + "Des oracles du monde entier avaient prédit votre venue. Des contrées bénissent sans arrêt votre naissance.\n"
                + "En effet, un destin vous a été imposé.\n"
                + "Celui de gardien du Purgatoire...\n"
                + "Au cours de l'histoire de notre monde, chaque fois que des forces malsaines se sont propagées, motivées par de sombres desseins,\n"
                + "un gardien du Purgatoire est né pour les disperser jusqu'à leur prochaine tentative.\n"
                + "Cette fois, c'est à vous qu'incombe cette mission."
                + "Je comprends votre... hésitation ou votre probable envie de renier ces responsabilités que vous n'avez jamais revendiqué.\n"
                + "Les humains, dans leur peur et leur désespoir, vous ont pris pour un objet, un moyen pour mettre fin à tous leurs maux.\n"
                + "Néanmoins gardien, vous seul possédez la force et la volonté nécessaires pour accomplir cette ultime tâche.\n");

        System.out.println("Comment vous appelez-vous ?\n");
        String nom;
        Scanner scanIn = new Scanner(System.in);
        nom = scanIn.nextLine();
        System.out.println(nom + ". Ne tournez pas le dos à l'humanité. Elevez-vous.\n"
                + "Triomphez de Valentine, l'impératrice des ombres, et avec elle, tout le mal qu'elle a répandu.\n");
        int classe;
        do {
            System.out.println("Quel est votre classe ?");
            System.out.println("Guerrier : Taper 1");
            System.out.println("Archer : Taper 2");
            System.out.println("Mage blanc : Taper 3");
            Scanner scanInC = new Scanner(System.in);
            classe = scanInC.nextInt();
        } while (classe != 1 && classe != 2 && classe != 3);
        if (classe == 1) {
            hero = new Warrior(nom, 7, 7, 5, 50);
            System.out.println(hero.getInfo());
            Weapon arme1 = new Weapon("Epée de bois", 5, 6, 0);
            hero.equipWeapon(arme1);
            Gear armure1 = new Gear ("Chemise en cuir",3,2,2);
            hero.equipGear(armure1);
            System.out.println("Vous avez équipé : Epée de bois et Chemise en cuir.");
            System.out.println("Dégâts : " + arme1.getDamage()+"\n"+"Armure :"+armure1.getResistance());

        } else if (classe == 2) {
            hero = new Archer(nom, 9, 10, 3, 45);
            System.out.println(hero.getInfo());
            Weapon arme2 = new Weapon("Arc et flèches de bois", 3, 8, 0);
            hero.equipWeapon(arme2);
            System.out.println("Vous avez équipé : Arc et flèches de bois.");
            System.out.println("Dégâts : " + arme2.getDamage());
        } else if (classe == 3) {
            hero = new LightMage(nom, 5, 9, 7, 40);
            System.out.println(hero.getInfo());
            Weapon arme3 = new Weapon("Bâton cristalisé faible", 4, 2, 10);
            hero.equipWeapon(arme3);
            System.out.println("Vous avez équipé : Bâton cristalisé faible.");
            System.out.println("Dégâts : " + arme3.getDamage() + "\n");
        }

        // Ecriture du scénario pour arriver sur le premier combat
        System.out.println("Vous êtes parti en direction du Palais Noir, où se situe Valentine sur son trône.\n"
                + "Nul doute que ses sous-fifres vont vous barrer la route. Vous devrez les défaire, un par un.\n"
                + "Alors que l'effroi vous envahi, votre première adversaire vous aggresse.");
        String nomMonstre1 = "Rat carnivore";//="nom du monstre"
        System.out.println("Vous est attaqué par " + nomMonstre1 + ". Vous devez le combattre pour continuer votre périple.");
        System.out.println("Début du combat \n");
        IA monstre1 = new IA(nomMonstre1, 3, 10, 3, 30);
        Weapon arme4 = new Weapon("griffes", 0, 5, 0);
        monstre1.equipWeapon(arme4);
        

        //Lancement du combat 1
        int numeroround = 1;
        List<Integer> listTimoutEffect = new ArrayList<Integer>();
        listTimoutEffect.add(0);
        listTimoutEffect.add(0);
        List<Effect> listEffectIn = new ArrayList<Effect>();
        listEffectIn.add(null);
        listEffectIn.add(null);
        hero.setDefFight(hero.getDefense());
        monstre1.setDefFight(monstre1.getDefense());
        while (hero.getHealth() > 0 && monstre1.getHealth() > 0) {
            Object object = choseAction();
            Round r1 = new Round();
            System.out.println("ROUND " + numeroround);
            List<Effect> listEffect = r1.roll(hero, monstre1, object);
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
                        monstre1.getCaracteristic().put(Caracteristic.HEALTH, monstre1.getHealth() - listEffectIn.get(i).getValue());
                    }
                    
                    listTimoutEffect.set(i, listTimoutEffect.get(i)-1);
                }
                if (listTimoutEffect.get(i) <= 0 && listEffectIn.get(i) != null) {
                    listEffectIn.set(i, null);
                }
            } 
            numeroround++;
        }
        if (hero instanceof Warrior) {
            Weapon arme5 = new Weapon("Epée de fer", 7, 9, 0);
            System.out.println("Vous avez reçu : Epée de fer");
            hero.equipWeapon(arme5);
        } else if (hero instanceof Archer) {
            Weapon arme5 = new Weapon("Arc solide", 6, 12, 0);
            System.out.println("\n Vous avez reçu : Arc solide");
            hero.equipWeapon(arme5);
        } else {
            Weapon arme5 = new Weapon("Baton mana", 7, 6, 12);
            System.out.println("\n Vous avez reçu : Bâton mana");
            hero.equipWeapon(arme5);
        }
        System.out.println("A peine remis de votre victoire, un deuxième ennemi tente de vous lacérer par surprise, quelques mètres plus loin.\n"
                + "Esquivant le coup fatal de justesse, vous vous mettez en position de combat. Vous savez désormais ce que vous avez à faire.");

        String nomMonstre2 = "Ours griffe de sabre";//="nom du monstre"
        System.out.println("Vous est attaqué par " + nomMonstre2 + ". Vous devez le combattre pour continuer votre périple.");
        System.out.println("Début du combat \n");
        IA monstre2 = new IA(nomMonstre2, 6, 8, 6, 60);
        Weapon arme6 = new Weapon("griffes acérées", 0, 6, 0);
        monstre2.equipWeapon(arme6);
        
        numeroround = 1;
        hero.setDefFight(hero.getDefense());
        monstre2.setDefFight(monstre2.getDefense());
        while (hero.getHealth() > 0 && monstre2.getHealth() > 0) {
            Object object = choseAction();
            Round r1 = new Round();
            System.out.println("ROUND " + numeroround);
            r1.roll(hero, monstre2, object);
            numeroround++;
        }
            
            if (hero instanceof Warrior) {
            Weapon arme7 = new Weapon("Epée incendiaire", 10, 12, 0);
            System.out.println("Vous avez reçu : Epée incendiaire");
            hero.equipWeapon(arme7);
        } else if (hero instanceof Archer) {
            Weapon arme7 = new Weapon("Arc et flèches-éclair", 6, 18, 0);
            System.out.println("Vous avez reçu : Arc et flèches-éclair");
            hero.equipWeapon(arme7);
        } else {
            Weapon arme7 = new Weapon("Bâton magma cristallisé moyen", 7, 8, 14);
            System.out.println("\n Vous avez reçu : Bâton magma cristallisé moyen");
            hero.equipWeapon(arme7);
        }
            System.out.println("Le reste de la route de déroule sans réel soucis. Le Palais Noir vous tend les portes et Valentine vous dévisage assise sur son trône.\n"
                    + "Elle vous attaque avec ses ombres mais vous êtes préparé.\n");
        
            
        String nomMonstre3 = "Valentine";//="nom du monstre"
        System.out.println("Vous est attaqué par " + nomMonstre3 + ". Vous devez le combattre pour continuer votre périple.");
        System.out.println("Début du combat \n");
        IA monstre3 = new IA(nomMonstre3, 25, 25, 25, 100);
        Weapon arme8 = new Weapon("ombres tueuses", 0, 10, 0);
        monstre3.equipWeapon(arme8);
        
        numeroround = 1;
        hero.setDefFight(hero.getDefense());
        monstre3.setDefFight(monstre3.getDefense());
        while (hero.getHealth() > 0 && monstre3.getHealth() > 0) {
            Object object = choseAction();
            Round r1 = new Round();
            System.out.println("ROUND " + numeroround);
            r1.roll(hero, monstre3, object);
            numeroround++;
        }
 
    }
}

