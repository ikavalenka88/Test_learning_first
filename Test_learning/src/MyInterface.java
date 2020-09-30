public interface MyInterface {
    int NUMBER=100;
    int getNumber(double x);
    char getSymbol(int n);
}
class MyClass implements MyInterface{
    public int getNumber(double x){
        return (int)x;
    }
    public char getSymbol(int n){
        return (char)('A'+n);
    }

    public void show() {
    }
}
class UsingInterfaceDemo{
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        System.out.println("Static const: "+MyClass.NUMBER);
        System.out.println("Integer number: "+ obj.getNumber(12.5));
        System.out.println("Symbol: "+obj.getSymbol(3));
    }
}
