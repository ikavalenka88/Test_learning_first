class Alpha347 {
    private String name;

    Alpha347(String txt) {
        name = txt;
    }

    public String toString() {
        return name;
    }
}
    class Bravo348 extends Alpha347{
        Bravo348(String txt){
            super(txt);
        }
    }
    class Charlie348 extends Bravo348{
        Charlie348(String txt){
            super(txt);
        }
    }
    class Delta348 extends Charlie348{
        Delta348(String txt){
            super(txt);
        }
    }
    class Echo348 extends Delta348{
        Echo348(String txt){
            super(txt);
        }
    }
    class MyClass348<T>{
        private T obj;
        public String toString(){
            return obj.toString();
        }
        MyClass348(T arg){
            obj=arg;
        }
    }
    class BoundedWildCardsDemo349{
        static void show(MyClass348<? extends Charlie348>obj){
            System.out.println(obj);
        }
        static void display(MyClass348<? super Charlie348>obj){
            System.out.println(obj);
        }

        public static void main(String[] args) {
            MyClass348<Alpha347> A=new MyClass348<>(new Alpha347("The Object A"));
            MyClass348<Bravo348> B=new MyClass348<>(new Bravo348("The Object B"));
            MyClass348<Charlie348> C=new MyClass348<>(new Charlie348("The Object C"));
            MyClass348<Delta348> D=new MyClass348<>(new Delta348("The Object D"));
            MyClass348<Echo348> E=new MyClass348<>(new Echo348("The Object E"));
            display(A);
            display(B);
            display(C);
            show(C);
            show(D);
            show(E);
        }

    }
