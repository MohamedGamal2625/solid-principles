package solidprinciples.single.responsibility.ocp;

public class AreaCalculator {
    public double calculate(Shape shape){
        return shape.area();
    }

    public static void main(String[] args) {
        AreaCalculator areaCalculator = new AreaCalculator();
        areaCalculator.calculate(new Rectangle(5,5));
        areaCalculator.calculate(new Square(5));

    }
}
