class MyClass344<T> {
    T value;
    MyClass344(T val){
        value=val;
    }
}
class UsingWildCardDemo344{
    static <T> void show(MyClass344<T> obj){
        System.out.println("Calling method show():");
        System.out.println(obj.value);
    }
    static void display(MyClass344<?> obj){
        System.out.println("Calling method display():");
        System.out.println(obj.value);
    }

    public static void main(String[] args) {
        MyClass344<Integer> A=new MyClass344<>(100);
        MyClass344 B = new MyClass344<>('B');
        MyClass344<?>C=new MyClass344<>("The Object C");
        show(A);
        display(A);
        show(B);
        display(B);
        show(C);
        display(C);
    }
}