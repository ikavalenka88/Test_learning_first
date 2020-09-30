 class MyClass370 {
    private int number;
    MyClass370(int n){
        number=n;
    }
    void set(int n){
        number=n;
    }
    int get(){
        return number;
    }
}
interface MyGetter371{
    int myget(MyClass370 obj);
    }
interface MySetter371{
    void myset(MyClass370 obj,int n);
}
class MethReferenceDemo371{
    public static void main(String[] args) {
        MyClass370 obj=new MyClass370(100);
        System.out.println("Created the object with field 100");
        MyGetter371 A=MyClass370::get;
        MySetter371 B=MyClass370::set;
        System.out.println("The Variable A: "+A.myget(obj));
        System.out.println("The Variable obj: "+obj.get());
        obj.set(200);
        System.out.println("The Field has value 200");
        System.out.println("The Variable A:"+A.myget(obj));
        B.myset(obj,300);
        System.out.println("Executed command B.myset(obj,300)");
        System.out.println("The variable A: "+A.myget(obj));
        System.out.println("The Variable obj: "+ obj.get());
        obj=new MyClass370(400);
        System.out.println("Created the object with field 400");
        System.out.println("The Variable A: "+A.myget(obj));
        System.out.println("The Variable obj: "+obj.get());
        B.myset(obj,500);
        System.out.println("Executed command b.myset(obj,500)");
        System.out.println("The Variable A: "+A.myget(obj));
        System.out.println("The Variable obj:"+obj.get());
    }
}