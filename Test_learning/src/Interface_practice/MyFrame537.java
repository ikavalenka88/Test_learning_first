package Interface_practice;

import javax.swing.*;

public class MyFrame537 extends JFrame {
    private JComboBox CB;
    private JButton B;
    private JLabel L;
    private String[] animals=new String[]{"Fox","Wolf","Bear","Racoon"};
    private String[] files=new String[]{"red-fox.jpg","Wild wolf.jpg","bear.jfif","racoon-black-and-white.jpg"};
    private String path="D:/images/";
    private ImageIcon[] imgs;
    MyFrame537(){
        super("The expand list");
        setBounds(250,250,300,150);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setLayout(null);
        imgs=new ImageIcon[files.length];
        for (int k=0;k< imgs.length;k++){
            imgs[k]=new ImageIcon(path+files[k]);
        }
        CB=new JComboBox(imgs);
        CB.setBounds(10,10,150,100);
        CB.setSelectedIndex(0);
        CB.addItemListener(e->L.setText(animals[CB.getSelectedIndex()]));
        add(CB);
        JLabel lbl=new JLabel("Your choose");
        lbl.setBounds(170,10,120,20);
        add(lbl);
        L=new JLabel(animals[0],JLabel.CENTER);
        L.setBounds(170,40,120,30);
        L.setBorder(BorderFactory.createEtchedBorder());
        add(L);
        B=new JButton("OK");
        B.setBounds(170,80,120,30);
        B.addActionListener(e->System.exit(0));
        add(B);
        setVisible(true);
    }
}
        class MoreComboBoxDemo539{
            public static void main(String[] args) {
                new MyFrame537();
            }
        }