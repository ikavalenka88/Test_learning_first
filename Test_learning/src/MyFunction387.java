 interface MyFunction387 {
    double f(double x);
}
class DerivativeCalcDemo387{
    static MyFunction382 Derivatite(MyFunction382 ref){
        double dx=1e-5;
        return (double x)->{return (ref.f(x+dx)- ref.f(x))/dx;};
    }

    public static void main(String[] args) {
        MyFunction382 A=Derivatite((double x)->{return x*(3-x);});
        MyFunction382 B=Derivatite((double x)->{return x*Math.exp(-x);});
        System.out.println("Expression for the first function");
        System.out.println("Calculated: \tRight:");
        for (double t=0;t<=5;t++){
            System.out.printf("%8.5f\t%8.5f\n",A.f(t),(3-2*t));
        }
        System.out.println("Expression for the second function");
        System.out.println("Calculated: \tRight:");
        for (double t=0;t<=5;t++){
            System.out.printf("%8.5f\t%8.5f\n",B.f(t),Math.exp(-t)*(1-t));
        }
    }
}
