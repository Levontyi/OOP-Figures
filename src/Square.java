import java.util.ArrayList;

public class Square extends  Figure {

    private static Point[] points;

    public Square(Point[] points) {
        this.points = points;
    }



    public static boolean isSquareValid() {
        double x1 = points[0].getX();
        double y1 = points[0].getY();
        double z1 = points[0].getZ();
        double x2 = points[1].getX();
        double y2 = points[1].getY();
        double z3 = points[2].getZ();
        double x3 = points[2].getX();
        double y3 = points[2].getY();
        double z2 = points[1].getZ();

        if (points.length == 2) {
            double distSquared = (x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1);
            double dist = Math.sqrt(distSquared);

            return (distSquared != 0) && (distSquared == (dist * dist * 2));

        } else if (points.length == 3) {
            double d1Squared = (x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1) + (z2 - z1) * (z2 - z1);
            double d2Squared = (x3 - x1) * (x3 - x1) + (y3 - y1) * (y3 - y1) + (z3 - z1) * (z3 - z1);
            double d3Squared = (x3 - x2) * (x3 - x2) + (y3 - y2) * (y3 - y2) + (z3 - z2) * (z3 - z2);

            double dist = Math.sqrt(d1Squared);

            return (d1Squared != 0) && (d2Squared == d1Squared) && (d3Squared == d1Squared) && ((dist * dist * 2) == d2Squared);
        }


        return false;
    }

    public static double countingAreaOfSquare() {
        double S = 0;
        if (points.length == 2) {
            S = Math.sqrt(Math.pow(points[0].getX() - points[1].getX(), 2)
                    + Math.pow(points[0].getY() - points[1].getY(), 2));
        } else if (points.length == 3) {
            S = Math.sqrt(Math.pow(points[0].getX() - points[1].getX(), 2)
                    + Math.pow(points[0].getY() - points[1].getY(), 2)
                    + Math.pow(points[0].getZ() - points[1].getZ(), 2));
        }

        return Math.pow(S, 2);
    }

    public static double countingPerimeterOfSquare() {
        if (points.length == 2) {
            return Math.sqrt(Math.pow(points[0].getX() - points[1].getX(), 2)
                    + Math.pow(points[0].getY() - points[1].getY(), 2)) * 4;
        } else {
            return Math.sqrt(Math.pow(points[0].getX() - points[1].getX(), 2)
                    + Math.pow(points[0].getY() - points[1].getY(), 2)
                    + Math.pow(points[0].getZ() - points[1].getZ(), 2)) * 4;
        }
    }
}