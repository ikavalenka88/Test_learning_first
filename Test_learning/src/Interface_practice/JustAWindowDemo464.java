package Interface_practice;

import javax.swing.*;

public class JustAWindowDemo464 {
    public static void main(String[] args) {
        JFrame wnd=new JFrame("The Simple window");
        wnd.setSize(300,200);
        wnd.setLocation(250,250);
        wnd.setResizable(false);
        wnd.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        wnd.setVisible(true);
    }
}
