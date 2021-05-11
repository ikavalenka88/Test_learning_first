package Applets;

import javax.swing.*;
import java.awt.*;

public class MyApplet613 extends JApplet {
    public void init(){
        JLabel lbl = new JLabel("The Blue text on yellow background");
        lbl.setFont(new Font("Arial", Font.BOLD,30));
        lbl.setForeground(Color.BLUE);
        lbl.setOpaque(true);
        lbl.setBackground(Color.YELLOW);
        add(lbl);
    }
}
