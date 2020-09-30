public class MyClassForObjects {
    int number;
    MyClassForObjects(int n){
        number=n;
    }
}
class SwapFieldsDemo{
    static void swap(MyClassForObjects A, MyClassForObjects B){
        System.out.println("The execution method swap()");
        System.out.println("The Object A: "+ A.number);
        System.out.println("The Object B: "+ B.number);
        int number=B.number;
        B.number=A.number;
        A.number=number;
        System.out.println("The values of the fields changes");
        System.out.println("The Object A:" +A.number);
        System.out.println("The Object B:" +B.number);
        System.out.println("Complete of execution method swap()");
    }

    public static void main(String[] args) {
        MyClassForObjects A=new MyClassForObjects(100);
        MyClassForObjects B=new MyClassForObjects(200);
        System.out.println("Before calling method swap(): A.number="+A.number+" and B.number="+B.number);
        swap(A,B);
        System.out.println("After called method swap(): A.number="+A.number+" and B.number="+B.number );
    }
}