public class AlphaTwo implements Base {
    String word;

    AlphaTwo(String txt) {
        word = txt;
    }

    public void show() {
        System.out.println("The object of class Alpha");
        System.out.println("The text field: " + word);
    }
}
class BravoTwo implements Base{
    int number;
    BravoTwo(int n){
        number=n;
    }
    public void show(){
        System.out.println("The object of the class Bravo");
        System.out.println("The integer field: " + number);
    }
}
class UsingInterfaceVarsDemo {
    public static void main(String[] args) {
        Base ref;
        ref = new AlphaTwo("text");
        ref.show();
        ref = new BravoTwo(123);
        ref.show();
    }
}