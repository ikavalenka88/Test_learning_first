/*
import javafx.scene.Scene;

import  javax.swing.JOptionPane;
import  java.util.Scanner;
import java.awt.*;

*/
/*public class DemoVasilyev {
*//*
*/
/*    public static void main(String[] args) {
        System.out.println("Java & Idea");your
    }*//*
*/
/*
*//*
*/
/*public static void main(String[] args) {
    JOptionPane.showMessageDialog(null,"First Java-programm! MAGIC!");  //  Всплывающее  окно с текстом
}*//*
*/
/*
public static void main(String[] args) {
    String title = "Message";
    String text = "We will learn JAVA!";
    JOptionPane.showMessageDialog(null,text,title,JOptionPane.WARNING_MESSAGE);
    System.out.println("We are learning JAVA!");
}*//*

*/
/*class InputDualogDemo{
    public static void main(String[] args) {
        String text;
        String title;
        title = JOptionPane.showInputDialog(null,"Name for the window:","Name_example",JOptionPane.WARNING_MESSAGE);
        text = JOptionPane.showInputDialog(null,"Text for message:","Contained",JOptionPane.PLAIN_MESSAGE);
//        text = JOptionPane.showInputDialog("Please, enter text message");
//        JOptionPane.showMessageDialog(null,"You are entered next text messages:\n" + text);
        JOptionPane.showMessageDialog(null,text,title, JOptionPane.INFORMATION_MESSAGE);
    }*//*

*/
/*class ConsoleInputDemo{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String day,month;
        System.out.println("What is day today?");
        day = input.nextLine();
        System.out.println("What is month today?");
        month = input.nextLine();
        String text;
        text = "Today is " + day +" and month is - " + month;
        System.out.println(text);
    }*//*

*/
/*
class UsingVariablesDemo{
    public static void main(String[] args) {
        int number =123;
        double x = 13.5;
        char sym = 'F';
        boolean state = true;
        String text =  "Used variables:\n";
        text = text + "Int number" + number + "\n";
        text = text + "Current number" + x + "\n";
        text = text + "Symbols" + sym + "\n";
        text = text + "Boolean" + state + "\n";
        JOptionPane.showMessageDialog(null,text);
        System.out.println("Int number" + number);
        System.out.println("Current number" + x);
        System.out.println("Symbols" + sym);
        System.out.println("Boolean" + state);
    }
*//*

*/
/*class InputIntVariablesDemo{
    public static void main(String[] args) {
        int age,year,birth;
        String result;
        result = JOptionPane.showInputDialog("What Year is now?");
        year = Integer.parseInt(result);
        result = JOptionPane.showInputDialog("How old are you?");
        age = Integer.parseInt(result);
        birth = year-age;
        JOptionPane.showMessageDialog(null,"You had born in " + birth + " year!");
    }
}*//*

*/
/*class InputDoubleVariablesDemo {
    public static void main(String[] args) {
        double mass, height, bmi;
        String result;
        result = JOptionPane.showInputDialog("What is your height?");
        height = Double.parseDouble(result);
        result = JOptionPane.showInputDialog("What is your mass in kilo?");
        mass = Double.parseDouble(result);
        bmi = mass / height / height;
        bmi = Math.round(bmi * 100) / 100.0;
        JOptionPane.showMessageDialog(null, "Index mass of your body: " + bmi);
    }
}*//*

*/
/*class InputVariablesConsoleDemo{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int now = 2019;
        String name;
        int age;
        double height;
        double mass;
        System.out.println("Your name is: ");
        name = input.nextLine();
        System.out.println("Your age: ");
        age = input.nextInt();
        System.out.println("Your height(in meters): ");
        height = input.nextDouble();
        System.out.println("Your mass (in kilo): ");
        mass = input.nextDouble();
        double bmi = mass/height/height;
        System.out.println("Hello, " + name + "!");
        System.out.println("You are born in " + (now-age) + " year.");
        System.out.printf("Your index mass of body: %5.2f\n",bmi);

    }*//*

}*/
