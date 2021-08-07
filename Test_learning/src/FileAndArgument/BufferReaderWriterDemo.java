package FileAndArgument;

import java.io.*;

public class BufferReaderWriterDemo {
    public static void main(String[] args) {
        System.out.println("Start copy file");
        String path = "d:\\Books\\";
        String str;
        try{
            InputStream in;
            BufferedReader input = new BufferedReader(new FileReader(path + "MyNewText.txt"));
            File file;
            BufferedWriter output =new BufferedWriter(new FileWriter(path + "MyFiles/MyVeryNewText.txt"));
            int k=1;
            while ((str = input.readLine())!=null){
                output.write("["+k+"]"+str.toLowerCase());
                output.newLine();
                k++;
            }
            input.close();
            output.close();
        } catch (FileNotFoundException exception){
            exception.getMessage();
        }
        catch (IOException e){
            e.getMessage();
        }
    }
}
