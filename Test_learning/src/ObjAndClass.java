import javax.swing.*;
import java.awt.*;
import javax.swing.JOptionPane;

/*

public class ObjAndClass {
*/
/*    int number;
    char symbol;
    void set (int n, char s){
        number = n;
        symbol = s;
    }
    String getInfo(){
        String text =  "Number: " + number + "\n";
        text+= "Symbol: " + symbol;
        return text;
    }
}
class UsingObjectWithMethodsDemo {
    public static void main(String[] args) {
        ObjAndClass objA = new ObjAndClass();
        ObjAndClass objB = new ObjAndClass();
        objA.set(100,'I');
        objB.set(200,'K');
        JOptionPane.showMessageDialog(null,objA.getInfo(),"Firs object", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null,objB.getInfo(),"Second object", JOptionPane.INFORMATION_MESSAGE);
    }
}*//*

*/
/*class UsingObjectDemo{
    public static void main(String[] args) {
        ObjAndClass obj = new ObjAndClass();
        obj.number = 280888;
        obj.symbol = 'I';
        String text = "Number: " + obj.number + "\n";
        text+= "Symbol: " + obj.symbol;
        JOptionPane.showMessageDialog(null,text);
    }
}*//*

// page 93 example
*/
/*
int number;
char symbol;
void set (int n){
    number = n;
}
    void set (char s){
    symbol = s;
    }
    void set(int n,char s){
    set(n);
    set(s);
    }
    void  set(){
    set(0,'Z');
    }
    void  show(){
        System.out.println("Value of the field:" + number + " and " + symbol);
    }
    void show(String txt){
        System.out.println(txt + ":value of field: " + number + " and " + symbol);
    }
    void show(String txt1, String txt2){
        System.out.println(txt1 + ": " + number);
        System.out.println(txt2 + ": " + symbol);
    }
}
class MethodOverloadingDemo{
    public static void main(String[] args) {
        ObjAndClass objA,objB;
        objA = new ObjAndClass();
        objB = new ObjAndClass();
        objA.set(234);
        objA.set('G');
        System.out.println("Object objA:");
        objA.show();
        objB.set();
        objB.show("Object objB:");
        objB.set(321,'O');
        System.out.println("Object objB after update:");
        objB.show("Number","Symbol");
    }
*//*

 int number;
 char symbol;
 ObjAndClass(){
     number = 100;
     symbol = 'A';
 }
 ObjAndClass(int n,char s){
     number = n;
     symbol = s;
 }
 void show(){
     System.out.println("Values of fields " + number + " and " + symbol);
 }
}
class UsingConstructorDemo{
    public static void main(String[] args) {
        ObjAndClass objA = new ObjAndClass();
        ObjAndClass objB = new ObjAndClass(200,'B');
        System.out.println("Object objA: ");
        objA.show();
        System.out.println("Object objB: ");
        objB.show();
    }
}*/
/*
class MyClass {
    static  int count = 0;
    MyClass(){
        count++;
        System.out.println("Create a new object number" + count);
    }
    static void show(){
        System.out.println("Count of  objects:" + count);
    }
}
class UsingStaticMembersDemo{
    public static void main(String[]args){
        MyClass.show();
        MyClass objA = new MyClass();
        MyClass objB = new MyClass();
        MyClass objC = new MyClass();
        MyClass.show();
        objC.show();
        objB.show();
    }
}*/
/*
class MyClassTwo{
    private static int count = 0;
    private int number;
    private String name;
    MyClassTwo(String n){
        count++;
        name = n;
        number = count;
        System.out.println("Created object with name" + name);
    }
    public void show(){
        System.out.println("Name of object:" + name);
        System.out.println("Number of object:" + number);
        System.out.println("Count of  object:" + count);
    }
    public void set(String n){
        name = n;
    }
}
class UsingPrivateMembersDemo{
    public static void main(String[] args) {
        MyClassTwo objA = new MyClassTwo("Alpha");
        MyClassTwo objB = new MyClassTwo("Bravo");
        MyClassTwo objC = new MyClassTwo("Charlie");
        objA.show();
        objB.show();
        objC.show();
        objB.set("Second object");
        objB.show();
    }
}*/
/*
class UsingIfDemo{
    public static void main(String[] args) {
        String input,txt,title;
        int number;
        ImageIcon img;
        input = JOptionPane.showInputDialog(null,"Enter the number", "Verification the number",JOptionPane.QUESTION_MESSAGE);
        if (input==null) {
            JOptionPane.showMessageDialog(null, "You are not enter the number!", "Error of input", JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        }
            number = Integer.parseInt(input);
            if (number%2==0){
                img = new ImageIcon("/home/ikavalenka/Pictures/respectF2.png");
                txt = "Number " + number + "- even!";
                title = " This number is even";
            }
            else {
                img = new ImageIcon("/home/ikavalenka/Pictures/Remarok.net8772.jpg");
                txt = "Number "+ number+" - odd!";
                title = "This number is odd!";
            }
            JOptionPane.showMessageDialog(null,txt,title,JOptionPane.PLAIN_MESSAGE,img);
        }
    }*/
/*
class UsingMultiIfDemo{
    public static void main(String[] args) {
        ImageIcon img;
        String animal;
        String file = "/home/ikavalenka/Pictures/";
        String diamand = "Diamand";
        String brain = "Brain";
        String refresh = "Refresh";
        String wheel = "Wheel";
        animal=JOptionPane.showInputDialog(null,diamand +"," + brain + " or " + wheel + " ? ", "Please,select one of  elements",JOptionPane.QUESTION_MESSAGE);
        if (animal==null){
            System.exit(0);
        }
        else if (animal.equalsIgnoreCase(diamand)){
            file +="i340-512.png";
            animal = diamand;
        }
        else if (animal.equalsIgnoreCase(brain)){
            file +="Brain-Technology-Intelligence-Engineering-Scientific-Neuroscience-512.png";
            animal = brain;
        }
        else if (animal.equalsIgnoreCase(wheel)){
            file +="i344-512.png";
            animal = wheel;
        }
        else {file+="i330-512.png";
        animal = refresh;
        }
        img = new ImageIcon(file);
        JOptionPane.showMessageDialog(null,img,animal,JOptionPane.PLAIN_MESSAGE);
    }
}*/
/*class  UsingWhileDemo{
    static int decoder(String code){
        int n = code.length();
        int s=0,k=1,q=1,a;
        while (k<=n){
            if (code.charAt(n-k)=='1'){
                a=1;
            }
            else {
                a=0;
            }
            s+=q*a;
            q*=2;
            k++;
        }
            return s;
    }

    public static void main(String[] args) {
        String input;
        String title = "Decoding binary code";
        input = JOptionPane.showInputDialog(null,"Enter binary code", title,JOptionPane.QUESTION_MESSAGE);
        if (input == null){
            System.exit(0);
        }
        int num = decoder(input);
        String text = "You are set binary code:" + input;
        text+="\nCode is equal number:" + num;
        JOptionPane.showMessageDialog(null,text,title,JOptionPane.INFORMATION_MESSAGE);
    }*//*
}*/
/*
class UsingDoWhileDemo{
    static String coder(int number){
        String s = "";
        int n = number;
        do {
            s=(n%2)+s;
            n/=2;
        }while (n!=0);
        return s;
    }

    public static void main(String[] args) {
        String input;
        String title="Please enter binar code";
        input = JOptionPane.showInputDialog(null,"Enter full number",title,JOptionPane.QUESTION_MESSAGE);
        if (input==null){
            System.exit(0);
        }
        int num = Integer.parseInt(input);
        String code = coder(num);
        String text = "You entered number:"+num;
        text+="\nBinary code of number: "+code;
        JOptionPane.showMessageDialog(null,text,title,JOptionPane.INFORMATION_MESSAGE);
    }
}*/
/*class  UsingForDemo {
    public static void main(String[] args) {
        int s =0,k,n=10;
        for (k=1;k<=n;k++){
            s+=k*k;
        }
        String txt = "Summmary quatro of numbers from 1 to " +n+": "+s;
        System.out.println(txt);
    }
}*/
/*
class  UsingSwithcDemo{
    static String getDay(int num){
        String day;
        switch (num){
            case 1: day="monday";
            break;
            case  2:  day="tuesday";
            break;
            case 3: day = "wensday";
            break;
            case 4: day = "thursday";
            break;
            case 5: day = "friday";
            break;
            case 6: day = "saturday";
            break;
            case 7: day = "Sunday";
            break;
            default:
                day="Unexpected";
        }
        return day;
    }
    static String testDay(int num){
        String day;
        switch (num){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                day="Working days";
                break;
            case 6:
            case 7:
                day="Weekend days";
                break;
            default:
                day="Unexpected days";
        }
        return day;
    }

    public static void main(String[] args) {
        for (int k =0;k<=8;k++){
            System.out.println(k+":"+getDay(k)+"\t-"+testDay(k));
        }
    }
}
*/
