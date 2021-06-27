package Applets;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Collection;

public class MyNewApplet extends JApplet implements MouseListener, ComponentListener {
    private JLabel L;
    private int small=25,big=35;
    private String name ="Arial";
    private Font onFont = new Font(name,Font.ITALIC|Font.BOLD , small);
    private Font offFnt = new Font(name, Font.BOLD, small);
    private Color onFgr=Color.RED;
    private Color offFgr=Color.BLUE;
    private Color onBgr=Color.WHITE;
    private Color offBgr=Color.YELLOW;
    private String onTxt = "The Red color on the white background";
    private String offTxt = "The Blue color on the yellow background";
    private void setAll(Color fgr,Color bgr,Font fnt,String txt){
        L.setText(txt);
        L.setForeground(fgr);
        L.setBackground(bgr);
        L.setFont(fnt);
    }
    public void componentResized(ComponentEvent e){
        L.setSize(getWidth()-60,getHeight()-60);
    }
    public void componentHidden(ComponentEvent e){}
    public void componentShown(ComponentEvent e){}
    public void componentMoved(ComponentEvent e){}
    public void mouseEntered(MouseEvent e){
        if (e.getSource()==L){
            setAll(onFgr,onBgr,onFont,onTxt);
        }
    }
    public void mouseExited(MouseEvent e){
        if (e.getSource()==L){
            setAll(offFgr,offBgr,offFnt,offTxt);
        }
    }
    public void mousePressed(MouseEvent e){
        L.setFont(new Font(name,L.getFont().getStyle(),big));
    }
    public void mouseReleased(MouseEvent e){
        L.setFont(new Font(name,L.getFont().getStyle(),small));
    }
    public void mouseClicked(MouseEvent e){}
    public void init(){
        setLayout(null);
        L=new JLabel();
        L.setHorizontalAlignment(JLabel.CENTER);
        L.setBounds(30,30,getWidth()-60,getHeight()-60);
        L.setBorder(BorderFactory.createEtchedBorder());
        L.setOpaque(true);
        setAll(offFgr,offBgr,offFnt,offTxt);
        addComponentListener(this);
        addMouseListener(this);
        L.addMouseListener(this);
        add(L);
    }
}
