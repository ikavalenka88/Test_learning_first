package FileAndArgument;

import java.io.*;

public class FileInputOutputDemo {
    public static void main(String[] args) {
        System.out.println("Start copy file");
        String path = "d:\\Books\\";
        String pathTwo = "d:\\Books\\MyFiles\\";
        int bt;
        try{
            FileInputStream inputStream = new FileInputStream(path + "MyFiles/MyCV.pdf");
            FileOutputStream outputStream = new FileOutputStream(pathTwo + "MyData.pdf");
            bt = inputStream.read();
            while (bt!=-1){
                outputStream.write(bt);
                bt = inputStream.read();
            }
            inputStream.close();
            outputStream.close();
        } catch (FileNotFoundException exception){
            System.out.println("File not found: " + exception);
        }
        catch (IOException e){
            System.out.println("The Error of access by file: " + e);
        }
        System.out.println("The copy is completed");
    }
}
