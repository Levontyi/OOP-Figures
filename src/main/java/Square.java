import java.util.ArrayList;

public class Square extends Figure {

    private static ArrayList<Point> points;

    public Square(ArrayList<Point> points) {
        this.points = points;
    }

    public static boolean isSquareValid() {
        Point firstPoint = points.get(0);
        Point secondPoint = points.get(1);
        Point thirdpoint = points.get(2);
        Point fourthPoint = points.get(3);

        double AB = distanceBetweenPoints(firstPoint, secondPoint);
        double BC = distanceBetweenPoints(secondPoint, thirdpoint);
        double CD = distanceBetweenPoints(thirdpoint, fourthPoint);
        double AD = distanceBetweenPoints(fourthPoint, firstPoint);

        boolean isPerpendicular = (Math.pow(AB * BC, 2) == Math.pow(CD * AD, 2));

        return isPerpendicular && AB == AD && AD == BC && BC == CD;
    }

    public static double countingAreaOfSquare() {
        Point firstSide = points.get(0);
        Point secondSide = points.get(1);

        double S = Math.sqrt(Math.pow(firstSide.getX() - secondSide.getX(), 2)
                    + Math.pow(firstSide.getY() - secondSide.getY(), 2));

        return Math.pow(S, 2);
    }

    public static double countingPerimeterOfSquare() {
        Point firstSide = points.get(0);
        Point secondSide = points.get(1);

        double perimeter = Math.sqrt(Math.pow(firstSide.getX() - secondSide.getX(), 2)
                + Math.pow(firstSide.getY() - secondSide.getY(), 2)) * 4;

        return perimeter;
    }

    static double distanceBetweenPoints(Point p, Point q) {
        return Math.sqrt(Math.pow(p.getX() - q.getX(), 2) + Math.pow(p.getY() - q.getY(), 2) + Math.pow(p.getZ() - q.getZ(), 2));
    }

}