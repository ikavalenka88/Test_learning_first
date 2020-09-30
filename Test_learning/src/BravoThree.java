public class BravoThree implements BaseTwo {
    @Override
    public void hello() {
        System.out.println("The object of class Bravo");
    }
}
class UsingDefaultMethodsDemo{
    public static void main(String[] args) {
        BaseTwo ref;
        AlphaThree objA=new AlphaThree();
        objA.hello();
        objA.show("The object variable objA");
        ref=objA;
        ref.show("The object variable ref");
        BravoThree objB= new BravoThree();
        objB.hello();
        objB.show("The object variable objB");
        ref=objB;
        ref.show("the intefrace variable ref");
    }
}