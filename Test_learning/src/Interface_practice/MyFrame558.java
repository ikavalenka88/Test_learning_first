package Interface_practice;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.Hashtable;

public class MyFrame558 extends JFrame implements ItemListener, ChangeListener {
    private JSpinner SP;
    private JSpinner.DefaultEditor editor;
    private String name="Arial";
    private int size=15;
    private JSlider SL;
    private JToggleButton TB;
    private String pressed="Blocked";
    private String unpressed="Unlocked";
    private ImageIcon locked,unlocked;
    private JCheckBox IT,BL;
    private JButton B;
    private JLabel L;
    private String[] animals= new String[]{"Fox","Wolf","Bear","Racoon"};
    private String[] files= new String[]{"red-fox.jpg", "Wild wolf.jpg", "bear.jfif", "racoon-black-and-white.jpg"};
    private String path="D:/images/";
    private ImageIcon[] imgs;
    private void setSpinnerFont(){
        int style= Font.PLAIN;
        if (IT.isSelected()){
            style|=Font.BOLD;
        }
        if (BL.isSelected()){
            style|=Font.BOLD;
        }
        editor.getTextField().setFont(new Font(name,style,size));
    }
    public void itemStateChanged(ItemEvent e){
        setSpinnerFont();
    }
    public void stateChanged(ChangeEvent e){
        int k;
        String s;
        if (e.getSource()==SP){
            s=(String)SP.getValue();
            for (k=0;k<animals.length;k++){
                if (animals[k].equals(s)){
                    SL.setValue(k);
                    break;
                }
            }
        }
        else{k= SL.getValue();
        SP.setValue(animals[k]);
        }
        L.setIcon(imgs[k]);
    }
    MyFrame558(){
        super("Spinner and slider");
        setBounds(250,250,390,200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setLayout(null);
        JPanel pnl=new JPanel();
        pnl.setBounds(10,10,170,160);
        pnl.setBorder(BorderFactory.createEtchedBorder());
        imgs=new ImageIcon[files.length];
        for (int k=0;k< imgs.length;k++){
            imgs[k]=new ImageIcon(path+files[k]);
        }
        L= new JLabel(imgs[0]);
        L.setBounds(10,10,150,100);
        pnl.add(L);
        B=new JButton("OK");
        B.setBounds(10,10,150,100);
        pnl.add(L);
        B=new JButton("Ok");
        B.setBounds(10,120,150,30);
        B.addActionListener(e->System.exit(0));
        pnl.add(B);
        add(pnl);
        JTabbedPane tp = new JTabbedPane();
        tp.setBounds(190,10,190,160);
        JPanel one = new JPanel();
        one.setLayout(null);
        SpinnerModel sm = new SpinnerListModel(animals);
        SP=new JSpinner(sm);
        SP.setBounds(5,5,170,30);
        editor=(JSpinner.DefaultEditor)SP.getEditor();
        editor.getTextField().setHorizontalAlignment(JTextField.CENTER);
        editor.getTextField().setEditable(false);
        SP.setValue(animals[0]);
        SP.addChangeListener(this);
        one.add(SP);
        IT=new JCheckBox("Accept cursor");
        IT.setBounds(5,35,170,25);
        IT.addItemListener(this);
        one.add(IT);
        BL=new JCheckBox("The bold text");
        BL.setBounds(5,65,170,25);
        BL.setSelected(true);
        BL.addItemListener(this);
        one.add(BL);
        TB=new JToggleButton(unpressed);
        TB.setBounds(5,95,170,30);
        locked=new ImageIcon(path+"locked.png");
        unlocked=new ImageIcon(path+"unlocked.png");
        TB.setIcon(locked);
        TB.setSelectedIcon(unlocked);
        TB.addActionListener(e->{
            if (TB.isSelected()){
                TB.setText(pressed);
                editor.getTextField().setEditable(true);
            }
            else{
                TB.setText(unpressed);
                editor.getTextField().setEditable(false);
            }
        });
        one.add(TB);
        setSpinnerFont();
        tp.add("Spinner",one);
        JPanel two=new JPanel();
        two.setLayout(null);
        SL=new JSlider(JSlider.VERTICAL,0,3,1);
        SL.setBounds(5,5,100,120);
        Hashtable ht = new Hashtable();
        for (int k=0;k< animals.length;k++){
            ht.put(new Integer(k),new JLabel(animals[k]));
        }
        SL.setLabelTable(ht);
        SL.setInverted(true);
        SL.setMajorTickSpacing(1);
        SL.setPaintTicks(true);
        SL.setPaintLabels(true);
        SL.setValue(0);
        SL.addChangeListener(this);
        two.add(SL);
        tp.add("The Slider",two);
        add(tp);
        setVisible(true);
    }
}
    class SpinnerAndSliderDemo{
        public static void main(String[] args) {
            new MyFrame558();
        }
    }
