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
import fr.polytech.apo.vivies_bontron.rpg.event.Fight;
import fr.polytech.apo.vivies_bontron.rpg.event.Round;
import fr.polytech.apo.vivies_bontron.rpg.item.Consumable;
import fr.polytech.apo.vivies_bontron.rpg.item.Gear;
import fr.polytech.apo.vivies_bontron.rpg.item.Weapon;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    private static Human hero;

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
            hero.giveEquipmentHuman(hero, "Epée de bois", "Plastron fragile", "Bottes usées", 5, 5, 3, 6, 0, 5, 2);
        } else if (classe == 2) {
            hero = new Archer(nom, 9, 10, 3, 45);
            System.out.println(hero.getInfo());
            hero.giveEquipmentHuman(hero, "Arc de bois", "Chemise en cuir", "Bottes en cuir", 4, 4, 2, 9, 0, 3, 4);

        } else if (classe == 3) {
            hero = new LightMage(nom, 5, 9, 7, 40);
            System.out.println(hero.getInfo());
            Weapon arme3 = new Weapon("Bâton cristalisé faible", 4, 2, 10);
            hero.giveEquipmentHuman(hero, "Bâton gemme faible", "Toge de chanvre", "Bottes en tissu", 4, 2, 1, 2, 10, 2, 3);

        }

        // Ecriture du scénario pour arriver sur le premier combat
        System.out.println("Vous êtes parti en direction du Palais Noir, où se situe Valentine sur son trône.\n"
                + "Nul doute que ses sous-fifres vont vous barrer la route. Vous devrez les défaire, un par un.\n"
                + "Alors que l'effroi vous envahi, votre première adversaire vous aggresse.\n");

        String nomMonstre1 = "Rat carnivore";//="nom du monstre"
        System.out.println("Vous est attaqué par " + nomMonstre1 + ". Vous devez le combattre pour continuer votre périple.");
        System.out.println("Début du combat \n");
        IA monstre1 = new IA(nomMonstre1, 3, 10, 3, 30);
        monstre1.giveEquipmentIA(monstre1, "Petites griffes", 5);
        
        int nbCombat = 1;
        Fight combat1 = new Fight(hero, monstre1);
        hero.amelioration(nbCombat);

        System.out.println("A peine remis de votre victoire, un deuxième ennemi tente de vous lacérer par surprise, quelques mètres plus loin.\n"
                + "Esquivant le coup fatal de justesse, vous vous mettez en position de combat. Vous savez désormais ce que vous avez à faire.\n");

        String nomMonstre2 = "Ours griffe de sabre";//="nom du monstre"
        System.out.println("Vous est attaqué par " + nomMonstre2 + ". Vous devez le combattre pour continuer votre périple.");
        System.out.println("Début du combat \n");
        IA monstre2 = new IA(nomMonstre2, 6, 8, 6, 60);
        monstre2.giveEquipmentIA(monstre2, "Griffes acérées", 8);
        
        Fight combat2 = new Fight(hero, monstre2);
        nbCombat++;
        hero.amelioration(nbCombat);

         System.out.println("Vous continuez votre route. Réalisant que vous êtes épuisé, vous décidez de prendre un peu de répit. Vous vous installez aussi confortablement que possible contre un rocher...\n"
                 + "Vous reprenez votre souffle et regagnez votre sang froid. Tellement, que vos paupières deviennent lourdes. La torpeur vous assaillit et vous ne la combattez pas...\n"
                 + "Soudainement, vous sentez sur votre peau une brise qui vous donne la chair de poule, comme à chaque que fois que le mal vous approche. Il ne vous faut pas plus de temps pour vous mettre sur vos pieds\n"
                 + "et remarquer qu'une nouvelle créature lorgne votre mort. Le son d'un hurlement d'ogre enragé parvient à vos oreilles et avec lui, le glas d'un nouveau combat.\n");
        String nomMonstre3 = "Ogre";//="nom du monstre"
        System.out.println("Vous est attaqué par " + nomMonstre3 + ". Vous devez le combattre pour continuer votre périple.");
        System.out.println("Début du combat \n");
        IA monstre3 = new IA(nomMonstre3, 10, 10, 9, 65);
        monstre2.giveEquipmentIA(monstre3, "Gourdin énorme", 9);
        Fight combat3 = new Fight(hero, monstre3);
        //nbCombat++;
        //hero.amelioration(nbCombat); ajouter les nouveaux équipements Human

        String nomMonstre4 = "Dragon des cavernes";//="nom du monstre"
        System.out.println("Vous est attaqué par " + nomMonstre4 + ". Vous devez le combattre pour continuer votre périple.");
        System.out.println("Début du combat \n");
        IA monstre4 = new IA(nomMonstre4, 15, 12, 13, 80);
        Weapon arme9 = new Weapon("Flames bleues", 0, 8, 0);
        monstre4.equipWeapon(arme9);
        Fight combat4 = new Fight(hero, monstre4);
        //nbCombat++;
        //hero.amelioration(nbCombat); ajouter les nouveaux équipements Human

        String nomMonstre5 = "Valentine";//="nom du monstre"
        System.out.println("Vous est attaqué par " + nomMonstre5 + ". Vous devez le combattre pour continuer votre périple.");
        System.out.println("Début du combat \n");
        IA monstre5 = new IA(nomMonstre4, 25, 25, 25, 100);
        Weapon arme10 = new Weapon("ombres tueuses", 0, 10, 0);
        monstre4.equipWeapon(arme10);
        Fight combat5 = new Fight(hero, monstre5);
        //nbCombat++;
        //hero.amelioration(nbCombat); ajouter les nouveaux équipements Human
        //ajouter une fin 

    }
}
