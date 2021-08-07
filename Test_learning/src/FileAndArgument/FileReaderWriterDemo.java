package FileAndArgument;

import java.io.*;

public class FileReaderWriterDemo {
    public static void main(String[] args) {
        System.out.println("Start copy file");
        String path = "d:\\Books\\";
        int sm;
        try{
            FileReader input = new FileReader(path + "MyFiles/MyText.txt");
            FileWriter output = new FileWriter(path + "MyNewText.txt");
            sm = input.read();
            while (sm!=1){
                output.write(Character.toUpperCase((char)sm));
                sm = input.read();
            }
            input.close();
            output.close();
        }catch (FileNotFoundException exception){
            System.out.println("File not found " + exception);
        }
        catch (IOException e){
            System.out.println("Access error to file " + e);
        }
        System.out.println("Copy file complete");
    }
}
