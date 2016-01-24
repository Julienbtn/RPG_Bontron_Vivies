/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.polytech.apo.vivies_bontron.rpg;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Administrateur
 */
public class Window extends JFrame{
    public Window() {
    this.setTitle("Valentine");
    this.setSize(1366, 768);
    this.setLocationRelativeTo(null);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   
    
    //Instanciation d'un objet JPanel
    JPanel pan = new JPanel();
    //Définition de sa couleur de fond
    pan.setBackground(Color.WHITE);        
    //On prévient notre JFrame que notre JPanel sera son content pane
    this.setContentPane(pan);  
    this.setContentPane(new Board());
    this.setVisible(true);
    }
}
