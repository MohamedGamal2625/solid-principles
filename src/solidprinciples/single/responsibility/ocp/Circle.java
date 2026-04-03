package solidprinciples.single.responsibility.ocp;

public class Circle implements Shape {
    double radius;
    Circle(double r){ radius=r;}
    public double area(){ return Math.PI * radius * radius; }
}
