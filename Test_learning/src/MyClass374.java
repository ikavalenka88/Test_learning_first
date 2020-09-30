 class MyClass374 {
    static void show(){
        System.out.println("The method of class MyClass");
    }
    static int sum(int n){
        int k,s=0;
        for (k=1;k<=n;k++){
            s+=k;
        }
        return s;
    }
}
interface MyShow374{
    void myshow();
}
interface MySum374{
    int mysum(int n);
}
interface MyPrinter374{
    void myprint(Object t);
}
class StateMethReferenceDemo375{
    public static void main(String[] args) {
        MyShow374 A = MyClass374::show;
        MySum374 B = MyClass374::sum;
        MyPrinter374 C=System.out::println;
        A.myshow();
        C.myprint("The Sum of number: "+B.mysum(10));
    }
}