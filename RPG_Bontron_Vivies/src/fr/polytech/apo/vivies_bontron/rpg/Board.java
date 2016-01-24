/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.polytech.apo.vivies_bontron.rpg;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author Administrateur
 */
public class Board extends JPanel {
     public void paintComponent(Graphics g){
    Font font = new Font("Arial", Font.BOLD, 150);
    g.setFont(font);
    g.setColor(Color.black);   
    g.drawString("Valentine", 335, 384);
  }              
}
