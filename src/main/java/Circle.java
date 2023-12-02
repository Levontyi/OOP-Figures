import java.util.ArrayList;

public class Circle extends Figure {

    private static ArrayList<Point> points;
    private static double radiusOfCircle = 0;

    public Circle(ArrayList<Point> points) {
        this.points = points;
    }

    public static boolean isCircleValid() {
        if (points.size() == 2) {
            Point center = points.get(0);
            Point anotherPoint = points.get(1);

            radiusOfCircle = Math.sqrt(Math.pow(anotherPoint.getX() - center.getX(), 2)
                    + Math.pow(anotherPoint.getY() - center.getY(), 2));


            System.out.println("Correct number of points");
        }
        return radiusOfCircle > 0;
    }

    public static double countingCircleArea() {
        double S = Math.PI * radiusOfCircle * radiusOfCircle;
        return S;
    }

    public static double countingCirclePerimeter() {
        double P = 2 * Math.PI * radiusOfCircle;
        return P;
    }
}
