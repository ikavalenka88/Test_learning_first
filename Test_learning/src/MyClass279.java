
public class MyClass279 {
    private int code;
    private String name;
    MyClass279(int n, String s){
        System.out.println("Creation of object:");
        set(n,s).show();
    }
    MyClass279 set(int n){
        code = n;
        return this;
    }
    MyClass279 set(String s){
        name=s;
        return this;
    }
    MyClass279 set(int n, String s){
        return set(n).set(s);
    }
    void show(){
        System.out.println("The Field code="+code);
        System.out.println("The Field name="+name);
        System.out.println("--------------------");
    }
}
class ObjectAsResultDemo{
    static MyClass279 creteObject(int n,String s){
        return new MyClass279(n,s);
    }

    public static void main(String[] args) {
        MyClass279 obj = creteObject(100,"alpha");
        obj.set(200).show();
        obj.set("bravo").show();
        obj.show();
        creteObject(300,"Charlie").set(400,"delta").show();
    }
}