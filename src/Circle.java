public class Circle extends Figure {

    private static Point[] points;
    static double radiusOfCircle = 0;

    public Circle(Point[] points) {
        this.points = points;
    }

    public static boolean isCircleValid() {
        if (points.length == 2) {
            int x1 = points[0].getX();
            int y1 = points[0].getY();
            int x2 = points[1].getX();
            int y2 = points[1].getY();

            radiusOfCircle = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        } else if (points.length == 3) {
            int x1 = points[0].getX();
            int y1 = points[0].getY();
            int z1 = points[0].getZ();
            int x2 = points[1].getX();

            int y2 = points[1].getY();
            int z2 = points[1].getZ();

            radiusOfCircle = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2)
                                                        + Math.pow(z2 - z1, 2));
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
