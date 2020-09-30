public class MyClass278 {
        int number;
    MyClass278(int n){
            number=n;
        }
    }
    class SwapsObjectDemo{
        static void swap(MyClass278 A, MyClass278 B){
            System.out.println("The execution method swap()");
            System.out.println("The Object A: "+ A.number);
            System.out.println("The Object B: "+ B.number);
            MyClass278 X=B;
            B=A;
            A=X;
            System.out.println("The values of the fields changes");
            System.out.println("The Object A:" +A.number);
            System.out.println("The Object B:" +B.number);
            System.out.println("Complete of execution method swap()");
        }

        public static void main(String[] args) {
            MyClass278 A=new MyClass278(100);
            MyClass278 B=new MyClass278(200);
            System.out.println("Before calling method swap(): A.number="+A.number+" and B.number="+B.number);
            swap(A,B);
            System.out.println("After called method swap(): A.number="+A.number+" and B.number="+B.number );
        }
    }
