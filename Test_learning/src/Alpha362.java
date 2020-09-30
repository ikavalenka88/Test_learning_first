 interface Alpha362 {
    void showA();
}
interface Bravo362{
    void showB();
}
interface Charlie363{
    void showC();
}
class LambdaAndInterfacesDemo363{
    public static void main(String[] args) {
        Alpha362 A=()-> System.out.println("Using lambda-expression");
        A.showA();
        Bravo362 B=()-> System.out.println("Using lambda-expression");
        B.showB();
        Charlie363 C=A::showA;
        C.showC();
    }
}
