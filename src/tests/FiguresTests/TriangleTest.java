import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.assertj.core.api.BDDAssertions.then;

public class TriangleTest {

    ArrayList<Point> points = new ArrayList<>();

    @Test
    @DisplayName("Triangle area and perimeter methods")
    public void TriangleAreaAndPerimeterMethods() {
        addPointsForValidTest();
        Triangle triangle = new Triangle(points);

        then(triangle.round(triangle.countingFigureArea())).isEqualTo(8);
        then(triangle.round(triangle.countingFigurePerimeter())).isEqualTo(12.94);
    }

    @Test
    @DisplayName("Triangle validation method")
    public void TriangleValidationMethod() {
        addPointsForValidTest();
        Triangle triangle = new Triangle(points);
        then(triangle.isFigureValid()).isTrue();

        addPointsForInvalidTest();
        triangle = new Triangle(points);
        then(triangle.isFigureValid()).isFalse();
    }

    private void addPointsForValidTest() {
        points.clear();
        points.add(new Point(0, 0));
        points.add(new Point(4, 0));
        points.add(new Point(2, 4));
    }

    private void addPointsForInvalidTest() {
        points.clear();
        points.add(new Point(0, 0));
        points.add(new Point(5, 0));
        points.add(new Point(2, 0));
    }
}
