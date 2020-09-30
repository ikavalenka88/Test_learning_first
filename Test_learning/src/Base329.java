class Base329<X> {
    X data;
    Base329(X data){
        this.data=data;
    }
    void show(){
        System.out.println(data);
    }
}
class Alpha329 extends Base329<Integer>{
    Alpha329(Integer n){
        super(n);
    }
    void show(){
        System.out.print("The Integer field: ");
        super.show();
    }
}
class Bravo330 extends Base329<String>{
    Bravo330(String txt){
        super(txt);
    }
    void show(){
        System.out.print("The text field: ");
        super.show();
    }
}
class Charlie330 extends Base329<Character>{
    Charlie330(Character s){
        super(s);
    }
    void show(){
        System.out.print("The symbol field: ");
        super.show();
    }
}
class ExtendingGenClassDemo331{
    public static void main(String[] args) {
        Alpha329 A=new Alpha329(123);
        Bravo330 B=new Bravo330("The object B");
        Charlie330 C=new Charlie330('C');
        A.show();
        B.show();
        C.show();
    }
}