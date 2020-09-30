class MyClassTwo implements First,Second {
    public void hello(){
        System.out.println("The method from interface First");
    }
    public void bye() {
        System.out.println("Method from interface Second");
    }
}
class UsingInterfacesDemo{
    public static void main(String[] args) {
        MyClassTwo obj=new MyClassTwo();
        obj.hello();
        obj.bye();
    }
}
