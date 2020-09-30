 interface MyMethods337<X> {
    X get();
    void set(X arg);
}
class MyClass337<X> implements MyMethods337<X>{
    private X value;
    public X get(){
        return value;
    }
    public void set(X arg){
        value=arg;
    }
    void show(){
        System.out.println("The value of the field: "+get());
    }
    MyClass337(X arg){
        value=arg;
    }
}
class GenInterfaceDemo{
    public static void main(String[] args) {
        MyMethods337 ref;
        MyClass337<Integer> A=new MyClass337<>(123);
        MyClass337<Character> B =new MyClass337<>('A');
        A.show();
        ref=A;
        ref.set(321);
        A.show();
        B.show();
        ref=B;
        ref.set('B');
        B.show();
    }
}
