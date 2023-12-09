import java.util.ArrayList;

public class Parallelogram extends Figure {

    private static ArrayList<Point> points;

    public Parallelogram(ArrayList<Point> points) {
        this.points = points;
    }

    public static boolean isParallelogramValid() {
        Point firstPoint = points.get(0);
        Point secondPoint = points.get(1);
        Point thirdPoint = points.get(2);
        Point fourthPoint = points.get(3);

        double AB = distanceBetweenPoints(firstPoint, secondPoint);
        double BC = distanceBetweenPoints(secondPoint, thirdPoint);
        double CD = distanceBetweenPoints(thirdPoint, fourthPoint);
        double AD = distanceBetweenPoints(fourthPoint, firstPoint);

        if (AB == CD && BC == AD) {
            return countingVectorCoordinates(firstPoint.getX(), secondPoint.getX())
                    * countingVectorCoordinates(secondPoint.getX(), thirdPoint.getX())
                    + countingVectorCoordinates(firstPoint.getY(), secondPoint.getY())
                    * countingVectorCoordinates(secondPoint.getY(), thirdPoint.getY())
                    + countingVectorCoordinates(firstPoint.getZ(), secondPoint.getZ())
                    * countingVectorCoordinates(secondPoint.getZ(), thirdPoint.getZ()) != 0;

        } else {
            return false;
        }
    }

    public static double countingParallelogramArea() {
        Point firstPoint = points.get(0);
        Point secondPoint = points.get(1);
        Point thirdPoint = points.get(2);


        double AB = Math.sqrt(Math.pow(firstPoint.getX() - secondPoint.getX(), 2)
                + Math.pow(firstPoint.getY() - secondPoint.getY(), 2))
                + Math.pow(firstPoint.getZ() - secondPoint.getZ(), 2);
        double BC = Math.sqrt(Math.pow(secondPoint.getX() - thirdPoint.getX(), 2)
                + Math.pow(secondPoint.getY() - thirdPoint.getY(), 2)
                + Math.pow(secondPoint.getZ() - thirdPoint.getZ(), 2));

        double vectorProduct = countingVectorCoordinates(firstPoint.getX(), secondPoint.getX())
                * countingVectorCoordinates(secondPoint.getX(), thirdPoint.getX())
                + countingVectorCoordinates(firstPoint.getY(), secondPoint.getY())
                * countingVectorCoordinates(secondPoint.getY(), thirdPoint.getY())
                + countingVectorCoordinates(firstPoint.getZ(), secondPoint.getZ())
                * countingVectorCoordinates(secondPoint.getZ(), thirdPoint.getZ());

        double scalarProduct = Math.sqrt(Math.pow(firstPoint.getX() - secondPoint.getX(), 2) + Math.pow(firstPoint.getY()
                - secondPoint.getY(), 2) + Math.pow(firstPoint.getZ() - secondPoint.getZ(), 2))
                * Math.sqrt(Math.pow(secondPoint.getX() - thirdPoint.getX(), 2)
                + Math.pow(secondPoint.getY() - thirdPoint.getY(), 2)
                + Math.pow(secondPoint.getZ() - thirdPoint.getZ(), 2));

        double sine = Math.sqrt(1 - Math.pow(vectorProduct / scalarProduct, 2));

        return AB * BC * sine;

    }

    public static double countingParallelogramPerimeter() {
        Point firstSide = points.get(0);
        Point secondSide = points.get(1);
        Point thirdSide = points.get(2);

        double AB = Math.sqrt(Math.pow(firstSide.getX() - secondSide.getX(), 2)
                + Math.pow(firstSide.getY() - secondSide.getY(), 2))
                + Math.pow(firstSide.getZ() - secondSide.getZ(), 2);
        double BC = Math.sqrt(Math.pow(secondSide.getX() - thirdSide.getX(), 2)
                + Math.pow(secondSide.getY() - thirdSide.getY(), 2)
                + Math.pow(secondSide.getZ() - thirdSide.getZ(), 2));

        return (AB + BC) * 2;
    }

    private static double distanceBetweenPoints(Point p, Point q) {
        return Math.sqrt(Math.pow(p.getX() - q.getX(), 2) + Math.pow(p.getY() - q.getY(), 2) + Math.pow(p.getZ() - q.getZ(), 2));
    }

    private static int countingVectorCoordinates(int point1, int point2) {
        return point2 - point1;
    }
}
