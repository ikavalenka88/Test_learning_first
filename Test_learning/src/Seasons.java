public class Seasons implements FirstSeason,SecondSeason {
    public void hello(){
        FirstSeason.super.hello();
        SecondSeason.super.hello();
    }
}
class MoreDefaultMethodsDemo{
    public static void main(String[] args) {
        Seasons obj=new Seasons();
        obj.hello();
    }
}