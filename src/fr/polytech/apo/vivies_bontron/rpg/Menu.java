package fr.polytech.apo.vivies_bontron.rpg;

import java.util.Scanner;

public class Menu {


    public Menu(String title, String[] item, Object[] actions) {
        System.out.println(title);
        Scanner sc = new Scanner(System.in);
        boolean arret = false;
        while (!arret) {
            for (int n = 0; n < item.length; n++) {
                System.out.println(n + item[n]);
            }
            int choix = sc.nextInt();
            switch (choix) {
                case 0:
                    actions[0];
                    break;
                default:
                    arret = true;
                    break;
            }
        }

    }

}
