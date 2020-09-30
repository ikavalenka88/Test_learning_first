 class MyClass379 {
    int number;
    void set(){
        number=0;
    }
    void set(int n){
        number=n;
    }
}
interface Alpha379{
    void none();
}
interface Bravo379{
    void one(int n);
}
class OverloadedMethRefDemo{
    public static void main(String[] args) {
        MyClass379 obj=new MyClass379();
        Alpha379 A=obj::set;
        Bravo379 B =obj::set;
        B.one(100);
        System.out.println("Value of the field: "+obj.number);
        A.none();
        System.out.println("Value of the field: "+obj.number);
    }
}