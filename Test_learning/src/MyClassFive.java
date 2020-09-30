public class MyClassFive implements Four{
    public void bravo(){
        Four.super.bravo();
        System.out.println("The class MyClassFive: method bravo()");
    }
}
class MoreExtendingInterfaceDemo{
    public static void main(String[] args) {
        MyClassFive obj=new MyClassFive();
        obj.alphaThird();
        obj.bravo();
    }
}