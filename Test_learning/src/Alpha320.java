class Alpha320 <X> {
    private X first;
    Alpha320(X first){
        set(first);
    }
    void set(X first){
        this.first=first;
    }
    X get(){
        return first;
    }
}
class Bravo321<X,Y>{
    Alpha320<X>obj;
    Y second;
    Bravo321(X first,Y second){
        obj=new Alpha320<X>(first);
        this.second=second;
    }
    void show(){
        System.out.println("The value "+obj.get()+" and "+second);
    }
}
class UsingGenericsDemo{
    public static void main(String[] args){
        Bravo321<Integer,Character> A=new Bravo321<Integer,Character>(100,'A');
        A.show();
        Bravo321<String,Double> B=new Bravo321<>("BRAVO",12.345);
        B.show();
    }
}