package FileAndArgument;

import javax.swing.*;

import static javax.swing.JOptionPane.showMessageDialog;

public class GetMoneyDemo {
    public static void main(String[] args) {
        String name;
        double m;
        double r;
        int t;
        double val;
        try{
            name=args[0]+" "+args[1];
            m=Double.parseDouble(args[2]);
            r=Double.parseDouble(args[3]);
            t=Integer.parseInt(args[4]);
            val=m;
            for (int k=1;k<=t;k++){
                val*=(1+r/100);
            }
            val=((int)(100*val))/100.0;
            String txt = "Name:   "+name+"\n";
            txt+="Contribution:  "+m+"\n";
            txt+="Bid:  "+r+"\n";
            txt+="Time:  "+t+"\n";
            txt+="Total:  "+val;
            showMessageDialog(null,txt,"Total amount of the deposit", JOptionPane.INFORMATION_MESSAGE);
        }catch (Exception exception){
            showMessageDialog(null,"Wrong parameters for deposit!\n"+exception,"Error",JOptionPane.ERROR_MESSAGE);
        }
    }
}
