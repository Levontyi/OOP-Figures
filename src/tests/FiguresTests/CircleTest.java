import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.assertj.core.api.BDDAssertions.then;

public class CircleTest {

    ArrayList<Point> points = new ArrayList<>();

    @Test
    @DisplayName("Circle area and perimeter methods")
    public void CircleAreaAndPerimeterMethods() {
        addPointsForValidTest();
        Circle circle = new Circle(points);

        then(circle.round(circle.countingFigureArea())).isEqualTo(12.57);
        then(circle.round(circle.countingFigurePerimeter())).isEqualTo(12.57);
    }

    @Test
    @DisplayName("Circle validation method")
    public void CircleValidationMethod() {
        addPointsForValidTest();
        Circle circle = new Circle(points);
        then(circle.isFigureValid()).isTrue();

        addPointsForInvalidTest();
        circle = new Circle(points);
        then(circle.isFigureValid()).isFalse();
    }

    private void addPointsForValidTest() {
        points.clear();
        points.add(new Point(0, 0));
        points.add(new Point(2, 0));
    }

    private void addPointsForInvalidTest() {
        points.clear();
        points.add(new Point(1, 1));
        points.add(new Point(1, 1));
    }
}
