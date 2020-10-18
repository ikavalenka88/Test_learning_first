package Interface_practice;

import javax.swing.*;

class MyFrame467 extends JFrame {
    MyFrame467(String name){
        super(name);
        setBounds(250,250,300,200);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }
}
class SimpleWindowDemo{
    public static void main(String[] args) {
        new MyFrame467("The Simple window");
    }
}
