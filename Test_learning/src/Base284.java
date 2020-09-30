abstract class Base284 {
    abstract void show();
}
class Alpha284 extends Base284{
    void show() {
        System.out.println("The object of class Alpha");
    }
}
class Bravo284 extends Base284{
    void show(){
        System.out.println("The object of class Bravo");
    }
}
class Charlie284 extends Base284{
    void show(){
        System.out.println("The object of class Charlie");
    }
}
class ObjectFactoryDemo{
    static Base284 createObject(int n){
        if (n==1)return new Alpha284();
        if (n==2)return new Bravo284();
        return new Charlie284();
    }

    public static void main(String[] args) {
        Base284 obj;
        for (int k=1;k<=3;k++){
            obj=createObject(k);
            obj.show();
        }
    }
}