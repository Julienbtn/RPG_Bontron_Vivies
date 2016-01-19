package fr.polytech.apo.vivies_bontron.rpg;


import fr.polytech.apo.vivies_bontron.rpg.character.Archer;
import fr.polytech.apo.vivies_bontron.rpg.character.Character;
import fr.polytech.apo.vivies_bontron.rpg.character.Warrior;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String a;   
        /*Création d'un personnage ^^
        /* int compteurdetour = 1;  
        while{
        round1.roll(Alexlegentil, Gwendolinelamechante, action);
        }
       */
        /*
        Character Alexandre = new Character(name);
        Alexandre.attack(Alexandre, Alexandre); */
        
        
        //Scénario
        System.out.println("Enfant déjà les gens m'appelaient l'élu. L'être touché par la lumière..."
                + "... Oui... Mon nom est :  ");
        System.out.println("Veuillez saisir le nom de l'héros");
        Scanner scanIn = new Scanner(System.in); //Saisie à l'écran pour choisir l'action à réaliser
        String nom; 
        nom = scanIn.nextLine();
        scanIn.close();
        System.out.println("Mon nom est " + nom); 
        System.out.println("");
        System.out.println("Veuillez choisir la classe de votre personnage");
        System.out.println("Pour que votre Personnage soit un Guerrier taper 1");
        System.out.println("Pour que votre Personnage soit un Athlète taper 2");
        Scanner scanInC = new Scanner(System.in);
        int classe;
        classe=scanInC.nextInt();
        if (classe==1)
        {
            Warrior hero;
            hero = new Warrior(nom);
        }
        else if (classe==2)
        {
            Archer hero;
            hero = new Archer(nom);
        }
        
        // Ecriture du scénario pour arriver sur le premier combat
        Character monstre1;
        String nomMonstre1;//="nom du monstre"
        monstre1 = new Character(nomMonstre1);
        //Lancement du Combat 
        //Si victoire message de félicitation pour level+1 et augmentation des caractéristiques 
        
        // Ecriture du scénario pour arriver sur le second combat
        Character monstre2;
        int force2 = 20;
        String nomMonstre2;//="nom du monstre"
        monstre2 = new Character(nomMonstre2,force2);
        //Lancement du Combat 
        //Si victoire message de félicitation pour level+1 et augmentation des caractéristiques
        
        // Ecriture du scénario pour arriver sur le second combat
        Character monstre3;
        int force3 = 20;
        int speed3 = 30;
        String nomMonstre3;//="nom du monstre"
        monstre2 = new Character(nomMonstre3,force3,speed3);
        //Lancement du Combat 
        //Si victoire message de félicitation pour level+1 et augmentation des caractéristiques
    }
}

