class MyClass327 {
    String name;
    <X> void show(X arg){
        System.out.println(name+": "+arg);
    }
    MyClass327(String txt){
        name=txt;
    }
}
class UsingGenMethodsDemo{
    public static void main(String[] args) {
        MyClass327 A=new MyClass327("The Object A");
        MyClass327 B=new MyClass327("The Object B");
        A.show(123);
        A.show("Alpha");
        A.show('A');
        B.show(123);
        B.show("Bravo");
        B.show('B');
    }
}
