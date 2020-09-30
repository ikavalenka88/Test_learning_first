public class MyClass299 {
    int number;
    MyClass299 next;
}
class ListOfObjectsDemo{
    static MyClass299 createList(int n){
        MyClass299 obj=new MyClass299();
        obj.number=1;
        MyClass299 t=obj;
        for (int k=1;k<=n;k++){
            t.next=new MyClass299();
            t.next.number=t.number*(n-k+1)/k;
            t=t.next;
        }
        t.next=null;
        return obj;
    }
    static void showList(MyClass299 obj){
        String txt="| ";
        MyClass299 t=obj;
        do {
            txt+=t.number+" | ";
            t=t.next;
        }while (t!=null);
        System.out.println(txt);
    }

    public static void main(String[] args) {
        MyClass299 A= createList(5);
        MyClass299 B= createList(10);
        showList(A);
        showList(B);
    }
}
