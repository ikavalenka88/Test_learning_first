import java.util.stream.Stream;

class Base332 {
    String name;
    Base332(String txt){
        name=txt;
    }
    void show(){
        System.out.println("The text field: "+name);
    }
}
class Alpha333 extends Base332{
    int number;
    Alpha333(String txt,int n){
        super(txt);
        number=n;
    }
    void show(){
        super.show();
        System.out.println("The Integer field: "+number);
    }
}
class Bravo333 extends Alpha333{
    char symbol;
    Bravo333(String txt,int n,char s){
        super(txt,n);
        symbol=s;
    }
    void show(){
        super.show();
        System.out.println("The Character field: "+symbol);
    }
}
class MyClass334<X extends Base332>{
    X obj;
    MyClass334(X obj){
        this.obj=obj;
    }
    void show(){
        System.out.println("The object of class MyClass");
        obj.show();
    }
}
class GenTypeExtendingDemo{
    public static void main(String[] args) {
        MyClass334<Alpha333> A=new MyClass334<>(new Alpha333("Alpha",123));
        MyClass334<Bravo333> B= new MyClass334<>(new Bravo333("Bravo",321,'B'));
        A.show();
        B.show();
    }
}
