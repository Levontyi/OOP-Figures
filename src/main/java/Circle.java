import java.util.ArrayList;

public class Circle extends Figure {

    private static ArrayList<Point> points;
    private static double radiusOfCircle;

    public Circle(ArrayList<Point> points) {
        this.points = points;
    }

    public static boolean isCircleValid() {
        if (points.size() == 2) {
            System.out.println("Correct number of points");
        }

        Point center = points.get(0);
        Point anotherPoint = points.get(1);

        radiusOfCircle = Math.sqrt(Math.pow(anotherPoint.getX() - center.getX(), 2)
                + Math.pow(anotherPoint.getY() - center.getY(), 2)
                + Math.pow(anotherPoint.getZ() - center.getZ(), 2));

        return radiusOfCircle > 0;
    }

    public static double countingCircleArea() {
        return Math.PI * radiusOfCircle * radiusOfCircle;
    }

    public static double countingCirclePerimeter() {
        return 2 * Math.PI * radiusOfCircle;
    }
}
