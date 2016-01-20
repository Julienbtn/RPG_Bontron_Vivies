package fr.polytech.apo.vivies_bontron.rpg;

import fr.polytech.apo.vivies_bontron.rpg.action.Attack;
import fr.polytech.apo.vivies_bontron.rpg.action.Block;
import fr.polytech.apo.vivies_bontron.rpg.action.Heal;
import fr.polytech.apo.vivies_bontron.rpg.character.Archer;
import fr.polytech.apo.vivies_bontron.rpg.character.Human;
import fr.polytech.apo.vivies_bontron.rpg.character.IA;
import fr.polytech.apo.vivies_bontron.rpg.character.Warrior;
import fr.polytech.apo.vivies_bontron.rpg.event.Round;
import fr.polytech.apo.vivies_bontron.rpg.item.Consumable;
import fr.polytech.apo.vivies_bontron.rpg.item.Weapon;
import java.util.Scanner;

public class Main {

    private static Object choseAction() {
        int choice;
        boolean garbage = false;
        Object action = null;
        Human human = null;
        while (garbage == false) {
            garbage = true;
            System.out.println("Choisissez une action.");
            System.out.println("Attaque : taper 1");
            System.out.println("Défense : taper 2");
            System.out.println("Compétence : taper 3");
            System.out.println("Consommable : taper 4");
            Scanner scanInC = new Scanner(System.in);
            choice = scanInC.nextInt();
            switch (choice) {
                case 1:
                    action = new Attack();
                    break;
                case 2:
                    action = new Block();
                    break;
                case 3:
                    action = new Heal();
                    break;
                case 4:
                    boolean check = false;
                    for (int i = 0; i < human.getInventory().size(); i++) {
                        if (human.getInventory().get(i) instanceof Consumable) {
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
        System.out.println("Enfant déjà les gens m'appelaient l'élu. L'être touché par la lumière..."
                + "... Oui... Mon nom est :  ");
        System.out.println("Veuillez saisir le nom de l'héros.");
        String nom;
        Scanner scanIn = new Scanner(System.in);
        nom = scanIn.nextLine();
        System.out.println("Mon nom est " + nom);

        int classe;
        Human hero = null;

        do {
            System.out.println("Veuillez saisir la classe de votre personnage");
            System.out.println("Guerrier : Taper 1");
            System.out.println("Archer : Taper 2");
            Scanner scanInC = new Scanner(System.in);
            classe = scanInC.nextInt();
        } while (classe != 1 && classe != 2);
        if (classe == 1) {
            hero = new Warrior(nom, 14, 9, 12);
            System.out.println(hero.getInfo());
            Weapon arme1 = new Weapon("Epée de bois", 3, 4, 0);
            hero.equipWeapon(arme1);

        } else if (classe == 2) {
            hero = new Archer(nom, 12, 14, 9);
            System.out.println("Votre personnage est:" + hero.getInfo());
            Weapon arme2 = new Weapon("Arc de bois", 8, 2, 0);
            hero.equipWeapon(arme2);
        }

        // Ecriture du scénario pour arriver sur le premier combat
        String nomMonstre1 = "Rat carnivore";//="nom du monstre"
        System.out.println(nom + " est attaqué par " + nomMonstre1 + ". Il doit le combattre pour continuer son périple.");
        System.out.println("Début du combat");
        IA monstre1 = new IA(nomMonstre1, 3, 10, 1);
        Weapon arme3 = new Weapon("griffes", 8, 2, 0);
        monstre1.equipWeapon(arme3);

        //Lancement du combat 1
        int numeroround = 1;
        while (hero.getHealth() > 0 && monstre1.getHealth() > 0) {
            Object object = choseAction();
            Round r1 = new Round();
            System.out.println("ROUND " + numeroround);
            r1.roll(hero, monstre1, object);
            numeroround ++;
        }
        //Si victoire message de félicitation pour level+1 et augmentation des caractéristiques 
/*
        // Ecriture du scénario pour arriver sur le second combat 
        String nomMonstre2 = "Ours";//="nom du monstre"
        System.out.println("Au non !!, un ours je dois le combatre");
        System.out.println("Début du combat");
        IA monstre2 = new IA(nomMonstre2, 2, 3, 4);
        //Lancement du Combat 

        //Si victoire message de félicitation pour level+1 et augmentation des caractéristiques
        // Ecriture du scénario pour arriver sur le second combat
        String nomMonstre3 = "Gorille";//="nom du monstre"
        System.out.println("Au non !!, un gorille je dois le combatre");
        System.out.println("Début du combat");
        IA monstre3 = new IA(nomMonstre3, 2, 5, 5);
        System.out.println("Le monstre est un " + monstre3.getInfo());
        //Lancement du Combat 
        //Si victoire message de félicitation pour level+1 et augmentation des caractéristiques
*/
    } 
}
