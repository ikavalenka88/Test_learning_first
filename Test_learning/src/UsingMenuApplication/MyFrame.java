package UsingMenuApplication;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;

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
    private JCheckBoxMenuItem color;
    private JRadioButtonMenuItem light,dark,ordinary;
    private JToolBar tb;
    private MyButton585 exitBtn,nextBtn,prevBtn,startBtn;
    private JPopupMenu pm;

    private void setContent(){
        lbl.setIcon(imgs[state]);
        try{
            tp.setPage(files[state]);
        }catch (IOException err){
            tp.setText("The information is not available");
        }
    }
    public void actionPerformed(ActionEvent e){
        state=Integer.parseInt(((JMenuItem)e.getSource()).getActionCommand());
        setContent();
    }
    MyFrame(){
        super("The Window With Menu Panel");
        setBounds(250,250,350,230);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        state=0;
        bdr=BorderFactory.createEtchedBorder();
        clr[0]=getBackground();
        clr[1]=Color.WHITE;
        clr[2]=Color.DARK_GRAY;
        imgs=new ImageIcon[engNames.length];
        files=new String[engNames.length];
        animals=new JMenuItem[cyrNames.length];
        for (int k=0;k<engNames.length;k++){
            imgs[k]=new ImageIcon("D:/Download from Google/image for java/"+engNames[k]+".jpg");
            files[k]="file:///D:/Download from Google/image for java/"+engNames[k]+".txt";
        }
        tb=new JToolBar("The Menu panel");
        exitBtn=new MyButton585("exit.png");
        exitBtn.setToolTipText("Complete work");
        startBtn=new MyButton585("start.png");
        startBtn.setToolTipText("The first image");
        prevBtn=new MyButton585("prev.png");
        prevBtn.setToolTipText("Previous image");
        nextBtn=new MyButton585("next.png");
        nextBtn.setToolTipText("Next image");
        tb.add(exitBtn);
        tb.add(startBtn);
        tb.add(prevBtn);
        tb.add(nextBtn);
        add(tb,BorderLayout.NORTH);
        pnl=new JPanel();
        pnl.setBorder(bdr);
        pnl.setLayout(new GridLayout(1,2));
        lbl=new JLabel();
        lbl.setHorizontalAlignment(JLabel.CENTER);
        pnl.add(lbl);
        add(pnl,BorderLayout.CENTER);
        Component table;
        JScrollPane sp =new JScrollPane();
        tp=new JTextPane();
        tp.setEditable(false);
        sp.getViewport().add(tp);
        pnl.add(sp);
        btn=new JButton("OK");
        btn.setFocusPainted(false);
        JPanel p =new JPanel();
        p.setLayout(new GridLayout(1,3));
        p.setBorder(bdr);
        p.add(new JPanel());
        p.add(btn);
        p.add(new JPanel());
        add(p,BorderLayout.SOUTH);
        mb=new JMenuBar();
        content=new JMenu("Contain");
        view=new JMenu("View");
        program=new JMenu("Program");
        about=new JMenuItem("About program");
        Icon icon;
        exit=new JMenuItem("Exit", exitBtn.getIcon());
        program.add(about);
        program.addSeparator();
        program.add(exit);
        color=new JCheckBoxMenuItem("The color of panel",true);
        light=new JRadioButtonMenuItem("Light",false);
        dark=new JRadioButtonMenuItem("Dark",false);
        ordinary=new JRadioButtonMenuItem("Default",true);
        ButtonGroup bg =new ButtonGroup();
        bg.add(ordinary);
        bg.add(light);
        bg.add(dark);
        view.add(color);
        view.addSeparator();
        view.add(ordinary);
        view.add(light);
        view.add(dark);
        for (int k =0;k<animals.length;k++){
            animals[k]=new JMenuItem(cyrNames[k]);
            animals[k].setActionCommand(" "+k);
            animals[k].addActionListener(this);
            content.add(animals[k]);
        }
        mb.add(content);
        mb.add(view);
        mb.add(program);
        setJMenuBar(mb);
        pm=new JPopupMenu();
        for (int k =0;k<cyrNames.length;k++){
            pm.add(new JMenuItem(cyrNames[k])).setActionCommand(" "+k);
            ((JMenuItem)pm.getComponent(k)).addActionListener(this);
        }
        pm.addSeparator();
        pm.add(new JMenuItem("Exit",exitBtn.getIcon())).addActionListener(e->exitBtn.doClick());
        lbl.setComponentPopupMenu(pm);
        btn.addActionListener(e->System.exit(0));
        exitBtn.addActionListener(btn.getActionListeners()[0]);
        nextBtn.addActionListener(e->{state=(state+1)%(engNames.length);
        setContent();
        });
        prevBtn.addActionListener(e->{state=state==0?engNames.length-1:(state-1);
        setContent();
        });
        exit.addActionListener(exitBtn.getActionListeners()[0]);
        about.addActionListener(e->{JOptionPane.showMessageDialog(this,"In this program use menu panel\nand Instrument panel.",
                "About program",JOptionPane.INFORMATION_MESSAGE);});
        lbl.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e){
                if(e.isPopupTrigger()){
                    pm.show(e.getComponent(),e.getX(),e.getY());
                }
            }
        });
        color.addActionListener(e->{if(color.isSelected()){
        ordinary.setEnabled(true);
        light.setEnabled(true);
        dark.setEnabled(true);
        }else {
            ordinary.setEnabled(false);
            light.setEnabled(false);
            dark.setEnabled(false);
        }
        });
        ordinary.addActionListener(e->pnl.setBackground(clr[0]));
        light.addActionListener(e->pnl.setBackground(clr[1]));
        dark.addActionListener(e->pnl.setBackground(clr[2]));
        setContent();
        setVisible(true);
    }
}
