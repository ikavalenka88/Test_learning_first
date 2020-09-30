import javax.swing.*;
import static javax.swing.JOptionPane.*;
/*
public class Inheriat extends JOptionPane {
    static void showMessage(String txt,String title){
        showMessageDialog(null,txt,title,PLAIN_MESSAGE,new ImageIcon("/home/ikavalenka/Pictures/2n9pt8.jpg"));
    }
    static void showMessage(String txt){
        showMessage(txt,"Message");
    }
    static int getInteger(String txt){
        String res;
        res = showInputDialog(null,txt,"Number(by default 10",QUESTION_MESSAGE);
        if (res==null){
            return 10;
        }
        else {return Integer.parseInt(res);
        }
    }
}
class ExtendingJOptionPaneDemo{
    public static void main(String[] args) {
        Inheriat.showMessage("Hello everyone!");
        int number;
        number = Inheriat.getInteger("Specified the integer number");
        String txt = "The number between 1 to" + number+ ":\n";
        for (int k=1;k<=number;k++){
            txt+=k+" ";
        }
        Inheriat.showMessage(txt,"The integer numbers");
    }
}
*/
/*
class Alpha{
    String name;
    int code;
    Alpha(String name,int code){
        this.name=name;
        this.code=code;
        System.out.println("Class Alpha");
        System.out.println("Field name - "+this.name);
        System.out.println("Field code -" +this.code);
    }
    Alpha(String name) {
        this(name, 0);
    }
    Alpha(int code){
        this("White",code);
    }
       Alpha(){
        this("Yellow",1);
       }
}
class Bravo extends Alpha{
    char symbol;
    private void show(){
        System.out.println("Class Bravo:");
        System.out.println("Field symbol - "+this.symbol);
        for (int k=1;k<=18;k++){
            System.out.print("-");
        }
        System.out.println("");
    }
    Bravo(String name, int code, char symbol){
        super(name, code);
        this.symbol = symbol;
        show();
    }
    Bravo(char symbol){
        super();
        this.symbol =symbol;
        show();
    }
    Bravo(String name){
        super(name);
        this.symbol = 'A';
        show();
    }
    Bravo(int code){
        super(code);
        this.symbol='B';
        show();
    }
    Bravo(){
        this.symbol='C';
        show();
    }
    Bravo(String name,int code){
        this(name,code,'D');
    }
}
class SubclassConstructorDemo{
    public static void main(String[] args) {
        Bravo obj;
        obj=new Bravo();
        obj= new Bravo("Red");
        obj =new Bravo(100);
        obj =new Bravo("Green",200);
        obj = new Bravo("Y");
        obj =new Bravo("Blue",300,'Z');
    }
}*/
/*
class Alpha{
    private int code;
    public void set(int code){
        this.code=code;
    }
    public void show(){
        System.out.println("First field:"+code);
    }
    Alpha(int code){
        set(code);
    }
}
class Bravo extends Alpha{
    Bravo(int code){
        super(code);
    }
}
class UsingPrivatesDemo{
    public static void main(String[] args) {
        Bravo obj = new Bravo(100);
        obj.show();
        obj.set(200);
        obj.show();
    }
}
*/
/*
class  UsingPackageDemo{
    public static void main(String[] args) {
        showMessageDialog(null,"Static import - it's easy!","Packet mypack",WARNING_MESSAGE);
    }
}*/
/*
class  Alpha{
    String name;
    void show(){
        System.out.println("The object of class Alpha:");
        System.out.println("THe Field name - "+name);
    }
    Alpha(String name){
        this.name=name;
    }
}
 class Bravo extends Alpha{
    int code;
    void show(){
        System.out.println("The object of class Bravo:");
        System.out.println("The field name - "+name);
        System.out.println("The  field code - "+code);
    }
    Bravo(String name, int code){
        super(name);
        this.code=code;
    }
}
class OverrrideMethodDemo{
    public static void main(String[] args) {
        Alpha objA = new Alpha("objA");
        Bravo objB = new Bravo("objB",123);
        objA.show();
        objB.show();
    }
}*/
/*
class Alpha {
    String name;
    void show(){
        System.out.println("The Object "+name);
    }
    Alpha(String name){
        this.name=name;
    }
}
class Bravo extends Alpha{
    int code;
    void show(){
        super.show();
        System.out.println("The number field "+ code);
    }
    Bravo(String name, int code){
        super(name);
        this.code=code;
    }
}
class MoreOverridingDemo{
    public static void main(String[] args) {
        Alpha objA=new Alpha("objA");
        Bravo objB=new Bravo("objB",123);
        objA.show();
        objB.show();
    }
}*/
/*
class Alpha{
    String name;
}
class Bravo extends Alpha{
    String name;
    void show(){
        System.out.println("From the class Alpha: "+ super.name);
        System.out.println("From the class Bravo: "+ name);
    }
    Bravo(String a, String b){
        super();
        super.name=a;
        name=b;
    }
}
class HidingFieldDemo{
    public static void main(String[] args) {
        Bravo obj = new Bravo("alpha","bravo");
        obj.show();
    }
}*/
/*
class Alpha{
    String name;
    void objectCreated(){
        System.out.println("Created object of class Aplha");
    }
    void hello(){
        System.out.println("The object of class Alpha");
    }
    void show(){
        hello();
        System.out.println("The field name: " + name);
    }
    Alpha(String txt){
        objectCreated();
        name = txt;
    }
}
class Bravo extends Alpha{
    void objectCreated(){
        System.out.println("Created the object of class Bravo");
    }

    @Override
    void hello() {
        System.out.println("The object of Bravo");
    }
    Bravo(String txt){
        super(txt);
    }
}
class VirtualMethodDemo{
    public static void main(String[] args) {
        Alpha objA = new Alpha("alpha");
        objA.show();
        Bravo objB = new Bravo("bravo");
        objB.show();
    }
}*/
/*
class Alpha{
    void show(){
        System.out.println("The class Alpha");
    }
    void show(String txt){
        System.out.println(txt);
    }
}
class Bravo extends Alpha{
    void show(){
        System.out.println("The class Bravo");
    }

    void show(int num) {
        System.out.println("The number" + num);
    }
}
class OverloadingAndOverringDemo{
    public static void main(String[] args) {
        Alpha objA = new Alpha();
        objA.show();
        objA.show("The object objA");
        Bravo obj = new Bravo();
        obj.show();
        obj.show("The Object objB");
        obj.show(123);
    }
}*/
/*
class MyClass{
    String name;
    int code;
    MyClass(String txt,int num){
        name = txt;
        code = num;
    }
    public String toString(){
        String txt = "The object of class MyClass\n";
        txt+="The field name: " +name+"\n";
        txt+="The field code: " +code+"\n";
        for (int k=1;k<=21;k++){
            txt+="-";
        }
        return txt;
    }
}
class UsingToStringDemo{
    public static void main(String[] args) {
        MyClass obj = new MyClass("The object obj",123);
        System.out.println(obj);
    }
}*/
class Alpha{
    String name;
    void show(){
        String txt = "The Object of class Alpha \n";
        txt+="The field name: "+name+"\n";
        for (int k=1;k<=20;k++){
            txt+="-";
        }
        System.out.println(txt);

    }
}
class Bravo extends Alpha{
    int code;
    void show(){
        String txt="The Object of class Bravo\n";
        txt+="The field name; "+name+"\n";
        txt+="The code: "+code+"\n";
        for (int k=1;k<=20;k++){
            txt+="-";
        }
        System.out.println(txt);

    }
}
class SuperAndSubDemo{
    public static void main(String[] args) {
        Alpha objA = new Alpha();
        objA.name="alpha";
        objA.show();
        Bravo objB=new Bravo();
        objB.name="bravo";
        objB.code=123;
        objB.show();
        objA=objB;
        objA.name="charlie";
        objA.show();
        objB.show(); 
    }
}