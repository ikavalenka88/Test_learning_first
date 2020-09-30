public class MethodArgumentsDemo {
    static void swap(int a, int b){
        System.out.println("The execution of the method swap()");
        System.out.println("The arguments before changing the values: "+a+" and "+b);
        int x=b;
        b=a;
        a=x;
        System.out.println("The arguments after changes the values: "+a+" and "+b);
        System.out.println("The completing of execution the method swap()");
    }

    public static void main(String[] args) {
        int m=100,n=200;
        System.out.println("The variables before calling method swap():" +m+" and "+n);
        swap(m,n);
        System.out.println("The variables after calling method swap(): "+m+" and "+n);
    }
}
