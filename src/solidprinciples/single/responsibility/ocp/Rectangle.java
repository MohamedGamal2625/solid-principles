package solidprinciples.single.responsibility.ocp;

public class Rectangle implements Shape{
    double width, height;
    Rectangle(double w, double h){ width=w; height=h;}
    @Override
    public double area() {
        return (width*height);
    }
}
