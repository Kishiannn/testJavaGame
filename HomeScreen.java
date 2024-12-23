package mygame;

import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;



public class MyGame {
    public static void main(String[] args) {
        JFrame homescreen = new JFrame("MyGame");
        homescreen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        homescreen.setSize(1500,900);
        homescreen.setLocationRelativeTo(null);
        
        JLabel gameTitle = new JLabel("MY GAME", SwingConstants.CENTER);
        gameTitle.setFont(new Font("Arial", Font.BOLD, 100));
        gameTitle.setBorder(new EmptyBorder(0,0,500,0));
        
        
        JLabel welcomeTXT = new JLabel("WELCOME PLAYER", SwingConstants.CENTER);
        welcomeTXT.setFont(new Font("Arial", Font.BOLD, 80));
        welcomeTXT.setBorder(new EmptyBorder(0,0,100,0));
        homescreen.add(gameTitle);
        
        homescreen.setVisible(true);
        
    }
    
}
