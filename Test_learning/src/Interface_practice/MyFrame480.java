package Interface_practice;

import javax.swing.*;
import java.awt.*;

class MyFrame480 extends JFrame {
    MyFrame480 (String name){
        super(name);
        setBounds(250,250,600,600);
    setResizable(false);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setLayout(null);
    ImageIcon img = new ImageIcon("C:\\Users\\home\\OneDrive\\Desktop\\example.png");
    String txt = "<html>This is symbol of money.<br>He is yellow.<br>He so beautiful.</html>";
    JLabel lbl =new JLabel(txt,img,JLabel.LEFT);
    Font F=new Font(Font.MONOSPACED,Font.BOLD,16);
    lbl.setFont(F);
    lbl.setBounds(50,60,400,200);
    lbl.setOpaque(true);
    lbl.setBackground(Color.LIGHT_GRAY);
    lbl.setBorder(BorderFactory.createEtchedBorder());
    add(lbl);
    JButton btn = new JButton("Close the window");
   btn.setBounds(150,350,200,30);
   btn.setFocusPainted(false);
   btn.addActionListener(e->{System.exit(0);});
   add(btn);
   setVisible(true);
    }
}
class LambdaHandlerDemo{
    public static void main(String[] args) {
        new MyFrame480("Lambda-expression");
    }
}