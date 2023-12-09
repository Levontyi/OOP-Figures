import java.util.ArrayList;

public class Square extends Figure {

    private static ArrayList<Point> points;

    public Square(ArrayList<Point> points) {
        this.points = points;
    }

    public static boolean isSquareValid() {
        Point firstPoint = points.get(Constants.FIRST_POINT_INDEX);
        Point secondPoint = points.get(Constants.SECOND_POINT_INDEX);
        Point thirdpoint = points.get(Constants.THIRD_POINT_INDEX);
        Point fourthPoint = points.get(Constants.FOURTH_POINT_INDEX);

        double AB = distanceBetweenPoints(firstPoint, secondPoint);
        double BC = distanceBetweenPoints(secondPoint, thirdpoint);
        double CD = distanceBetweenPoints(thirdpoint, fourthPoint);
        double AD = distanceBetweenPoints(fourthPoint, firstPoint);

        boolean isPerpendicular = (Math.pow(AB * BC, 2) == Math.pow(CD * AD, 2));

        return isPerpendicular && AB == AD && AD == BC && BC == CD;
    }

    public static double countingAreaOfSquare() {
        Point firstPoint = points.get(Constants.FIRST_POINT_INDEX);
        Point secondPoint = points.get(Constants.SECOND_POINT_INDEX);

        double S = Math.sqrt(Math.pow(firstPoint.getX() - secondPoint.getX(), 2)
                    + Math.pow(firstPoint.getY() - secondPoint.getY(), 2));

        return Math.pow(S, 2);
    }

    public static double countingPerimeterOfSquare() {
        Point firstPoint = points.get(Constants.FIRST_POINT_INDEX);
        Point secondPoint = points.get(Constants.SECOND_POINT_INDEX);

        double perimeter = Math.sqrt(Math.pow(firstPoint.getX() - secondPoint.getX(), 2)
                + Math.pow(firstPoint.getY() - secondPoint.getY(), 2)) * Constants.AMOUNT_OF_SQUARE_SIDES;

        return perimeter;
    }

    static double distanceBetweenPoints(Point p, Point q) {
        return Math.sqrt(Math.pow(p.getX() - q.getX(), 2) + Math.pow(p.getY() - q.getY(), 2) + Math.pow(p.getZ() - q.getZ(), 2));
    }

}