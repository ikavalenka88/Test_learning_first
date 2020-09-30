public class Base288 {
    String name;
    Base288(String txt){
        name=txt;
    }
    Base288(Base288 obj){
        name=obj.name;
    }
}
class MyClass288 extends Base288{
    int code;
    MyClass288(String txt,int n){
        super(txt);
        code=n;
    }
    MyClass288(MyClass288 obj){
        super(obj);
        code=obj.code;
    }
    void show(){
        System.out.println("The text field:"+name);
        System.out.println("Integer field:"+code);
    }
}
class CopyConstructorDemo{
    public static void main(String[] args) {
        MyClass288 A=new MyClass288("Yellow",200);
        MyClass288 B=new MyClass288(A);
        A.name="Red";
        A.code=100;
        MyClass288 C = new MyClass288(new MyClass288("Green",300));
        System.out.println("The object A");
        A.show();
        System.out.println("The object B");
        B.show();
        System.out.println("The object C");
        C.show();
    }
}