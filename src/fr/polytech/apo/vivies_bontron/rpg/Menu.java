
package fr.polytech.apo.vivies_bontron.rpg;

import java.util.Scanner;

public class Menu {

    String title;
    String[] Item;

    public Menu(String title, String[] Item, Object[] Actions) {
        System.out.println(title);
        Scanner sc = new Scanner(System.in);
        boolean arret = false;
        while (!arret) {
            for (int n = 0; n < Item.length; n++) {
                System.out.println(n + Item[n]);
            }
            int choix = sc.nextInt();
            switch (choix) {
                case 0:
                    Actions[0];
                    break;
                default:
                    arret = true;
                    break;
            }
        }

    }

}
