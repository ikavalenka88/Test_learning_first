package FileAndArgument;

import java.io.File;
import java.io.IOException;

public class GetFileInfoDemo {
    public static void main(String[] args) {
        String path = "D:\\Books\\Kavalenka-Ilya-CV.pdf";
        System.out.println(path);
        File F = new File(path);
        System.out.println("The name: "+F.getName());
        System.out.println("The Directory: "+F.getParent());
        File[] files=F.getParentFile().listFiles();
        System.out.println("The folder contains: ");
        for (int i=0;i< files.length;i++){
            System.out.println("\t"+files[i].getName());
            if (files[i].isFile()){
                System.out.println(" - The file");
            } else {
                System.out.println(" - The directory");
            }
        }
        System.out.println("The creation of new directory and replacing file");
        File D=new File(F.getParentFile(),"\\MyFiles");
        D.mkdir();
        try{
            System.out.println("Create directory "+ D.getCanonicalPath());
        }catch (IOException e){
            System.out.println("Error: "+e);
        }
        F.renameTo(new File(D,"MyCV.pdf"));
        System.out.println("The File "+F.getAbsolutePath());
        if (F.exists()){
            System.out.println("This file is exist");
        } else{
            System.out.println("This file is not exist");
        }
        System.out.println("In the directory "+D.getPath()+" have files: ");
        files=D.listFiles();
        for (int i =0;i< files.length;i++){
            System.out.println(files[i].getName());
        }
    }
}
