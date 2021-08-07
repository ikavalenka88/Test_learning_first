package FileAndArgument;

import javax.swing.*;
import java.io.*;

import static javax.swing.JOptionPane.*;

public class FileChooserDemo {
    public static void main(String[] args) throws IOException {
        int res = JOptionPane.showConfirmDialog(null,"Ready to choose file? ","Work with files ",YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
        if (res!=YES_OPTION){
            System.exit(0);
        }
        JFileChooser fch = new JFileChooser();
        res=fch.showOpenDialog(null);
        if (res!=JFileChooser.APPROVE_OPTION){
            System.exit(0);
        }
        File file =fch.getSelectedFile();
        String text = "You are selected file \n";
        text+=file.getAbsolutePath();
        text+="\n Do you want to creat the copy of file? ";
        res=showConfirmDialog(null,text,"File are selected",YES_NO_OPTION,QUESTION_MESSAGE);
        if (res!=YES_OPTION){
            System.exit(0);
        }
        res = fch.showSaveDialog(null);
        if (res!=JFileChooser.APPROVE_OPTION){
            System.exit(0);
        }
        FileInputStream inputStream = new FileInputStream(file);
        file=fch.getSelectedFile();
        FileOutputStream outputStream = new FileOutputStream(file);
        while ((res=inputStream.read())!=1){
            outputStream.write(res);
        }
        inputStream.close();
        outputStream.close();
        showMessageDialog(null,"The copy is saved \n"+file.getAbsolutePath(),"The copy is created",INFORMATION_MESSAGE);
    }
}
