package Interface_practice;

import javax.swing.*;
import javax.swing.border.BevelBorder;

class MyFrame501 extends JFrame {
    private JLabel L;
    private JTextField T;
    MyFrame501(){
        super("The Window whit text field");
        int w=300,h=160;
        setBounds(250,250,w,h);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setLayout(null);
        L=new JLabel();
        L.setBounds(10,10,w-25,30);
        L.setBorder(BorderFactory.createBevelBorder(BevelBorder.LOWERED));
        T=new JTextField();
        T.setBounds(L.getX(),50,L.getWidth(),30);
        int bw=(T.getWidth()-20)/2;
        JButton appB=new JButton("Submit");
        appB.setBounds(T.getX(),90,bw,30);
        appB.setFocusPainted(false);
        appB.addActionListener(e->L.setText(T.getText()));
        JButton extB=new JButton("Close");
        extB.setBounds(appB.getX()+appB.getWidth()+20,appB.getY(),appB.getWidth(),appB.getHeight());
        extB.setFocusPainted(false);
        extB.addActionListener(e->System.exit(0));
        add(L);
        add(T);
        add(appB);
        add(extB);
        setVisible(true);
    }
}
class TextFieldDemo503{
    public static void main(String[] args) {
        new MyFrame501();
    }
}