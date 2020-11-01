package Interface_practice;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class MyFrame484 extends JFrame implements ActionListener {
    public void actionPerformed(ActionEvent e) {
        System.exit(0);
    }

    MyFrame484(String name) {
        super(name);
        setBounds(100, 200, 1000, 1000);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        JPanel pnl = new JPanel();
        pnl.setBounds(100, 100, 800, 800);
        pnl.setBorder(BorderFactory.createEtchedBorder());
        pnl.setLayout(null);
        ImageIcon img = new ImageIcon("C:\\Users\\home\\Downloads\\1.gif");
        String txt = "<html>This is money.<br>He is nice.<br>He get lucky.</html>";
        JLabel imgLbl = new JLabel(img);
        imgLbl.setBounds(50,50,400,300);
        imgLbl.setBorder(BorderFactory.createEtchedBorder());
        JLabel txtLbl = new JLabel(txt, JLabel.CENTER);
        txtLbl.setBounds(50, 400, 200, 300);
        txtLbl.setBorder(BorderFactory.createEtchedBorder());
        JButton btn = new JButton("Close window");
        btn.setBounds(300, 900, 400, 60);
        btn.setFocusPainted(false);
        btn.addActionListener(this);
        Font F = new Font(
                btn.getFont().getName(), Font.BOLD | Font.ITALIC, btn.getFont().getSize() + 2);
        txtLbl.setFont(F);
        pnl.add(imgLbl);
        pnl.add(txtLbl);
        add(pnl);
        add(btn);
        setVisible(true);
    }
}
            class WindowAsHandlerDemo{
                public static void main(String[] args) {
                    new MyFrame484("Obrabotchik - oject window");
                }
            }
