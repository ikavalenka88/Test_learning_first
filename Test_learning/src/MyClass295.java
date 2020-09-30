public class MyClass295 {
    private int number;
    MyClass295(int n){
        number=n;
    }
    int get(){
        return number;
    }
}
class ArrayOfObjectsDemo{
    static MyClass295[] createBinoms(int n){
        MyClass295[] bins=new MyClass295[n+1];
        bins[0]=new MyClass295(1);
        for (int k=1;k<=n;k++){
            bins[k]=new MyClass295(bins[k-1].get()*(n-k+1)/k);
        }
        return bins;
    }
    static void show(MyClass295[] objs){
        String txt="| ";
        for (int k=0;k<objs.length;k++){
            txt+=objs[k].get()+" | ";
        }
        System.out.println(txt);
    }

    public static void main(String[] args) {
        MyClass295[] A=createBinoms(5);
        MyClass295[] B=createBinoms(10);
        show(A);
        show(B);
    }
}