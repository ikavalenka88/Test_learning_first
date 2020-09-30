 interface MyNums360 {
    default void show(int n){
        System.out.println("The Argument: " +n);
        System.out.println("The results: "+get(n));
    }
    int get(int n);
}
class UsingAnonymousClassDemo{
    public static void main(String[] args) {
        MyNums360 A = new MyNums360() {
    public int get(int n){
        int k,s=0;
        for (k=1;k<=n;k++){
            s+=k;
        }
        return s;
    }
        };
        System.out.println("Using Anonymous class:");
        A.show(10);
        System.out.println("Verification: "+ A.get(10));
        MyNums360 B=A;
        System.out.println("The new anonymous class:");
        A=new MyNums360() {
            public int get(int n){
                return n*n;
            }
        };
        System.out.println("The call method show() from A:");
        A.show(10);
        System.out.println("The call method show() from B:");
        B.show(10);
        }
    }
