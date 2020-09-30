 interface MyInterface389 {
    int getNumber(int n);
}
class MyClass389{
    private MyInterface389 ref;
    MyClass389(MyInterface389 mi){
        ref=mi;
    }
    void set(MyInterface389 mi){
        ref=mi;
    }
    int get(int n){
        return ref.getNumber(n);
    }
}
class LambdaAsFieldDemo390{
    public static void main(String[] args) {
        MyClass389 obj=new MyClass389((int n)->{return n*n;});
        System.out.println("The Argument:");
        for (int k=0;k<=5;k++){
            System.out.print(k+"\t");
        }
        System.out.println("\n The Argument in square:");
        for (int k=0;k<=5;k++) {
            System.out.print(obj.get(k) + "\t");
        }
            obj.set((int n)->{return n*n*n;});
            System.out.println("\n The Argument in square:");
            for (int k=0;k<=5;k++){
                System.out.print(obj.get(k)+"\t");
            }
            System.out.println("");
        }
    }


