 class MyClass365 {
    private int number;
    MyClass365(int n){
        number=n;
    }
    void set(int n){
        number=n;
    }
    int get(){
        return number;
    }
}
interface MyGetter366{
    int myget();
}
interface MySetter366{
    void myset(int n);
}
class ObjMethReferenceDemo366{
    public static void main(String[] args) {
        MyClass365 obj=new MyClass365(100);
        System.out.println("Created the object with field 100");
        MyGetter366 A=obj::get;
        MySetter366 B=obj::set;
        System.out.println("Variable A: "+A.myget());
        System.out.println("Variable obj: "+obj.get());
        obj.set(200);
        System.out.println("Field has value 200");
        System.out.println("Variable A: "+A.myget());
        B.myset(300);
        System.out.println("Executed command B.myset(300)");
        System.out.println("Variable A: "+A.myget());
        System.out.println("Variable obj:"+obj.get());
        obj=new MyClass365(400);
        System.out.println("Create the object with field 400");
        System.out.println("Variable A:"+A.myget());
        System.out.println("Variablr obj:"+obj.get());
        B.myset(500);
        System.out.println("Executed the command B.myset(500)");
        System.out.println("Variable A:"+A.myget());
        System.out.println("Variable obj:"+obj.get());
    }
}
