interface MyNums356 {
    default void show(int n){
        System.out.println("The argument: "+n);
        System.out.println("The results: "+get(n));
    }
    int get(int n);
}
class UsingLambdaDemo356 {
    public static void main(String[] args) {
        MyNums356 A = (int n) -> {
            int k, s = 0;
            for (k = 1; k <= n; k++) {
                s += k;
            }
            return s;
        };
        System.out.println("Using lambda-expression:");
        A.show(10);
        System.out.println("The verification: " + A.get(10));
        MyNums356 B = A;
        System.out.println("The new lambda-expression:");
        A = n -> n * n;
        System.out.println("The call of method show() form A:");
        A.show(10);
        System.out.println("The call of method show() from B:");
        B.show(10);
    }
}
