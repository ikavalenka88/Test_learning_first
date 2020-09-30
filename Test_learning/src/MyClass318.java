class MyClass318<X> {
    X data;
    MyClass318(X data){
        this.data=data;
    }
    void show(){
        System.out.println("The field value: "+data);
    }
}
class UsingGenClassDemo{
    public static void main(String[] args) {
        MyClass318<Integer> A=new MyClass318<Integer>(100);
        MyClass318<Character> B=new MyClass318<Character>('B');
        MyClass318<String> C=new MyClass318<String>("Green");
        A.show();
        B.show();
        C.show();
    }
}