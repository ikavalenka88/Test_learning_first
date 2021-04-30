package UsingMenuApplication;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {
    private int state;
    private JPanel pnl;
    private Border bdr;
    private Color[] clr = new Color[3];
    private JButton btn;
    private JMenu content,view,program;
    private ImageIcon[] imgs;
    private String[] engNames={"fox","wolf","bear","racoon"};
    private String[] cyrNames={"Fox_cyr","Wolf_cyr","Bear_cyr","Racoon_cyr"};
    private String[] files;
    private JLabel lbl;
    private JTextPane tp;
    private JMenuBar mb;
    private JMenuItem about,exit;
    private JMenuItem[] animals;
    private JCheckBoxMenuItem light,dark,ordinary;
    private JToolBar tb;
    private MyButton585 exitBtn,nextBtn,prevBtn,startBtn;
    private JPopupMenu pm;

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
