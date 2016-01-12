package fr.polytech.apo.vivies_bontron.rpg;


import fr.polytech.apo.vivies_bontron.rpg.character.Character;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Début du jeu");
        
        String name;
        Character perso = null;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Début du jeu");
        boolean arret = false;
        while (!arret) {
            System.out.println("--Mon menu--");
            System.out.println("1. Création d'un personnage");
            System.out.println("2. Voir personnage");
            System.out.println("3. Combattre");
            System.out.println("4. Chercher objet");
            System.out.println("9. Quitter");
            int choix = sc.nextInt();
            switch (choix) {
                case 1: {
                    System.out.println("---Choix du type de Personnge---");
                    System.out.println("Guerrier : tapez 1");
                    System.out.println("Athelete : tapez 2");
                    System.out.println("quitter : tapez 9");
                    int choix2 = sc.nextInt();
                    sc.nextLine();
                    switch (choix2) {
                        case 1:
                            System.out.println("Création d'un guerrier");
                            System.out.println("Choisir un nom");
                            name = sc.nextLine();
                            perso = new Character(name); 
                            break;
                        case 2:
                            System.out.println("Création d'un athlète");
                            System.out.println("Choisir un nom");
                            name = sc.nextLine();
                            perso = new Character(name);
                            break;
                        case 9:
                            arret = true;
                            break;
                        default:
                            System.out.println("entrez un choix entre 1 et 2");
                            break;
                    }
                }
                break;
                case 2:
                    perso.getInfo();
                    break;
                case 3:
                    System.out.println("---Combat---");
                    break;
                case 4:
                    System.out.println("---Chercher un objet---");
                    break;
                default:
                    arret = true;
                    break;
            }
        }
    }

}
