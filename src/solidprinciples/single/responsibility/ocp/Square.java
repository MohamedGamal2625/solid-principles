package solidprinciples.single.responsibility.ocp;

public class Square implements Shape{
    private double L;
    public Square(double L){this.L=L}
    @Override
    public double area() {
        return L*L;
    }
}
