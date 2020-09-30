abstract class Base309 {
    private String name;
    Base309(String txt){
        name=txt;
    }
    void show(){
        System.out.println("The name of object: "+name);
    }
    abstract void hello();
}
class AnonymousClassDemo{
    public static void main(String[] args) {
        Base309 obj=new Base309("Red") {
            void hello() {
                System.out.println("The object of Anonymous class");
            }
        };
        obj.show();
        obj.hello();
        new Base309("Creen"){
            void hello(){
                System.out.println("The Anonymous object");
            }
            void showAll(){
                hello();
                show();
            }
        }.showAll();
    }
}
