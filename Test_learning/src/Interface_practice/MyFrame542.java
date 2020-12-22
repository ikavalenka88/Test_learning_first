package Interface_practice;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class MyFrame542 extends JFrame implements ListSelectionListener {
    private JList LS;
    private JButton B;
    private JLabel L;
    private String[] animals = new String[]{"Fox", "Wolf", "Bear", "Racoon"};
    private String[] files = new String[]{"red-fox.jpg", "Wild wolf.jpg", "bear.jfif", "racoon-black-and-white.jpg"};
    private String path = "D:/images/";
    private ImageIcon[] imgs;

    public void valueChanged(ListSelectionEvent e) {
        L.setIcon(imgs[LS.getSelectedIndex()]);
    }

    MyFrame542() {
        super("The List of options");
        setBounds(250, 250, 300, 185);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setLayout(null);
        imgs = new ImageIcon[files.length];
        for (int k = 0; k < imgs.length; k++) {
            imgs[k] = new ImageIcon(path + files[k]);
        }
        L = new JLabel(imgs[0]);
        L.setBounds(10, 10, 150, 100);
        add(L);
        JLabel lbl = new JLabel("Make a choose");
        lbl.setBounds(170, 10, 120, 20);
        add(lbl);
        LS = new JList(animals);
        LS.setBounds(170, 35, 120, 75);
        LS.addListSelectionListener(this);
        LS.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        LS.setSelectedIndex(0);
        add(LS);
        B = new JButton("OK");
        B.setBounds(90, 120, 120, 30);
        B.addActionListener(e -> System.exit(0));
        add(B);
        setVisible(true);
    }
}
    class UsingListDemo{
        public static void main(String[] args) {
            new MyFrame542();
        }
    }