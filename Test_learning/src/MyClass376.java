 class MyClass376 {
    private int number;
    MyClass376(int n){
        number=n;
    }
    void show(){
        System.out.println("The value of the field: "+number);
    }
    void set(int n){
        number=n;
    }
}
interface MyInterface377{
    MyClass376 create(int n);
}
class ConstructorRefereneceDemo{
    public static void main(String[] args) {
        MyInterface377 ref=MyClass376::new;
        MyClass376 obj=ref.create(100);
        obj.show();
        obj.set(200);
        obj.show();
    }
}
