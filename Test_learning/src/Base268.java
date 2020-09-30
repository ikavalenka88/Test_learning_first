class Base268 {
    String getBase268(){
        return "Class Base268";
    }
    void show(){
        System.out.println("The Class: the method show()");
    }
}
class MyClass268 extends Base268 implements First267,Second268{
    public String getFirst267(){
        return "The Interface First267";
    }

    @Override
    public String getSecond268() {
        return "The Interface Bravo";
    }

    @Override
    public void show() {
        System.out.println("We are use:");
        System.out.println(getFirst267());
        System.out.println(getSecond268());
        System.out.println(getBase268());
        First267.super.show();
        Second268.super.show();
        super.show();
    }
}
class ExtendingAndImplementingDemo{
    public static void main(String[] args) {
        MyClass268 obj=new MyClass268();
        obj.show();
    }
}
