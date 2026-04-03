package withnosolid.noocp;

import java.awt.*;

public class AreaCalculator {
    //violates ocp --> open for modifications method
    public double calculate(Object shape) {
        if (shape instanceof Rectangle) {
            Rectangle r = (Rectangle) shape;
            return r.width * r.height;
        } else if (shape instanceof Circle) {
            Circle c = (Circle) shape;
            return Math.PI * c.radius * c.radius;
        }
        return 0;
    }
}
