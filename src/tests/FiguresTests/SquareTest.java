import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.assertj.core.api.BDDAssertions.then;

public class SquareTest {

    ArrayList<Point> points = new ArrayList<>();

    @Test
    @DisplayName("Square area and perimeter methods")
    public void SquareAreaAndPerimeterMethods() {
        addPointsForValidTest();
        Square square = new Square(points);

        then(square.round(square.countingFigureArea())).isEqualTo(4);
        then(square.round(square.countingFigurePerimeter())).isEqualTo(8);
    }

    @Test
    @DisplayName("Square validation method")
    public void SquareValidationMethod() {
        addPointsForValidTest();
        Square square = new Square(points);
        then(square.isFigureValid()).isTrue();

        addPointsForInvalidTest();
        square = new Square(points);
        then(square.isFigureValid()).isFalse();
    }

    private void addPointsForValidTest() {
        points.clear();
        points.add(new Point(0, 0));
        points.add(new Point(2, 0));
        points.add(new Point(2, 2));
        points.add(new Point(0, 2));
    }

    private void addPointsForInvalidTest() {
        points.clear();
        points.add(new Point(0, 0));
        points.add(new Point(4, 0));
        points.add(new Point(4, 4));
        points.add(new Point(0, 3));
    }
}
