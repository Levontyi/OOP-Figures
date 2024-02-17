import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.assertj.core.api.BDDAssertions.then;

public class ParallelogramTest {

    ArrayList<Point> points = new ArrayList<>();

    @Test
    @DisplayName("Parallelogram area and perimeter methods")
    public void ParallelogramAreaAndPerimeterMethods() {

        addPointsForValidTest();
        Parallelogram parallelogram = new Parallelogram(points);

        then(parallelogram.round(parallelogram.countingFigureArea())).isEqualTo(8.00);
        then(parallelogram.round(parallelogram.countingFigurePerimeter())).isEqualTo(13.66);
    }

    @Test
    @DisplayName("Parallelogram validation method")
    public void ParallelogramValidationMethod() {
        addPointsForValidTest();
        Parallelogram parallelogram = new Parallelogram(points);
        then(parallelogram.isFigureValid()).isTrue();

        addPointsForInvalidTest();
        parallelogram = new Parallelogram(points);
        then(parallelogram.isFigureValid()).isFalse();
    }

    private void addPointsForValidTest() {
        points.clear();
        points.add(new Point(0, 0));
        points.add(new Point(4, 0));
        points.add(new Point(6, 2));
        points.add(new Point(2, 2));
    }

    private void addPointsForInvalidTest() {
        points.clear();
        points.add(new Point(0, 0));
        points.add(new Point(4, 0));
        points.add(new Point(6, 2));
        points.add(new Point(2, 1));
    }
}
