package Interface_practice;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class MyButton490 extends JButton implements ActionListener {
    public void actionPerformed(ActionEvent e){
        System.exit(0);
    }
    MyButton490(int x,int y,int w,int h){
        super("Close window");
        setBounds(x,y,w,h);
        setFocusPainted(false);
        addActionListener(this);
    }
}

class MyPanel491 extends JPanel{
    MyPanel491(String txt,ImageIcon img){
        super();
        setBounds(5,5,285,110);
        setBorder(BorderFactory.createEtchedBorder());
        setLayout(null);
        JLabel imgLbl = new JLabel(img);
        imgLbl.setBounds(10,10,90,90);
        imgLbl.setBorder(BorderFactory.createEtchedBorder());
        JLabel txtLbl = new JLabel(txt,JLabel.CENTER);
        txtLbl.setBounds(110,10,165,90);
        txtLbl.setBorder(BorderFactory.createEtchedBorder());
        add(txtLbl);
        add(imgLbl);
    }
}
class MyFrame491 extends JFrame{
    MyFrame491(String name,String txt,ImageIcon img){
        super(name);
        setBounds(250,250,300,200);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        MyPanel491 pnl = new MyPanel491(txt, img);
        MyButton490 btn = new MyButton490(50,120,200,30);
        add(pnl);
        add(btn);
        setVisible(true);
    }
}
class ButtonAndHandlerDemo{
    public static void main(String[] args) {
        ImageIcon img = new ImageIcon("C:\\Users\\home\\Downloads\\1.gif");
        String txt ="<html>Dance<br>Everybody dance<br>Ow-ow-ow</html>";
        new MyFrame491("Handler - object button",txt,img);
    }
}