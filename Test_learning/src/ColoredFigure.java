abstract class ColoredFigure{
    String color;
    int size;
    ColoredFigure(String clr,int s){
        color = clr;
        size = s;
    }
    void show(){
        System.out.println("Figure: " +color+" "+getName());
        System.out.println("The characters size ("+getSizeName()+"): " +size);
        System.out.printf("The space: %.3f\n",getArea());
        String line="";
        for (int k=1;k<=30;k++){
            line+="*";
        }
        System.out.println(line);
    }
        String getSizeName(){
        return "The side";
        }
        abstract String getName();
        abstract double getArea();
}
class Triangle extends ColoredFigure{
    Triangle(String clr,int s){
        super(clr, s);
    }
    String getName(){
        return "Triangle";
    }

    @Override
    double getArea() {
        double k = Math.sqrt(3)/4;
        return size*size*k;
    }
}
class Square extends ColoredFigure{
    Square(String clr, int s){
        super(clr, s);
    }
    String getName(){
        return "Square";
    }
    double getArea(){
        double k=1;
        return size*size*k;
    }
}
class Circle extends ColoredFigure{
    Circle(String clr,int s){
        super(clr, s);
    }
    String getName(){
        return "Circle";
    }

    @Override
    double getArea() {
        double k=Math.PI;
        return size*size*k;
    }
    String getSizeName(){
        return "Radius";
    }
}
class UsingAbstractClassDemo{
    public static void main(String[] args) {
        Triangle T = new Triangle("red",2);
        Square S = new Square("black",3);
        Circle C = new Circle("yellow",1);
        T.show();
        S.show();
        C.show();
        ColoredFigure F;
        System.out.println("The using of object variable a abstract of superclass");
        F=T;
        F.show();
        F=S;
        S.show();
        F=C;
        F.show();
    }
}