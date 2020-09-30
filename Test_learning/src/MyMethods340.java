interface MyMethods340<X> {
    X get();
    void set(X arg);
}
class Alpha340 implements MyMethods340<Integer>{
    private Integer value;
    public Integer get(){
        return value;
    }
    public void set(Integer arg){
        value=arg;
    }
    void show(){
        System.out.println("The Integer field: "+get());
    }
    Alpha340(Integer arg){
        value=arg;
    }
}
class Bravo341 implements MyMethods340<Character>{
    private Character value;
    public Character get(){
        return value;
    }
    public void set(Character arg){
        value=arg;
    }
    void show(){
        System.out.println("The Character field: "+ get());
    }
    Bravo341(Character arg){
        value=arg;
    }
    }
class MoreGenInterfaceDemo341{
    public static void main(String[] args) {
        MyMethods340 ref;
        Alpha340 A=new Alpha340(123);
        Bravo341 B =new Bravo341('A');
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
