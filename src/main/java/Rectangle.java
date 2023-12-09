import java.util.ArrayList;

public class Rectangle extends Figure {

    private static ArrayList<Point> points;


    public Rectangle(ArrayList<Point> points) {
        this.points = points;
    }

    public static boolean isRectangleValid() {
        Point firstPoint = points.get(Constants.FIRST_POINT_INDEX);
        Point secondPoint = points.get(Constants.SECOND_POINT_INDEX);
        Point thirdPoint = points.get(Constants.THIRD_POINT_INDEX);
        Point fourthPoint = points.get(Constants.FOURTH_POINT_INDEX);

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
                    * countingVectorCoordinates(secondPoint.getZ(), thirdPoint.getZ()) == Constants.SCALAR_PRODUCT;
        } else {
            return false;
        }
    }

    public static double countingOfRectangleArea() {
        Point firstSide = points.get(Constants.FIRST_POINT_INDEX);
        Point secondSide = points.get(Constants.SECOND_POINT_INDEX);
        Point thirdSide = points.get(Constants.THIRD_POINT_INDEX);

        double sizeOfLeftSideOfRectangle = Math.sqrt(Math.pow(firstSide.getX() - secondSide.getX(), 2)
                + Math.pow(firstSide.getY() - secondSide.getY(), 2)
                + Math.pow(firstSide.getZ() - secondSide.getZ(), 2));

        double sizeOfUpperSideOfRectangle = Math.sqrt(Math.pow(secondSide.getX() - thirdSide.getX(), 2)
                + Math.pow(secondSide.getY() - thirdSide.getY(), 2)
                + Math.pow(secondSide.getZ() - thirdSide.getZ(), 2));

        return sizeOfLeftSideOfRectangle * sizeOfUpperSideOfRectangle;
    }

    public static double countingOfRectanglePerimeter() {
        Point firstSide = points.get(Constants.FIRST_POINT_INDEX);
        Point secondSide = points.get(Constants.SECOND_POINT_INDEX);
        Point thirdSide = points.get(Constants.THIRD_POINT_INDEX);

        double sizeOfLeftSideOfRectangle = Math.sqrt(Math.pow(firstSide.getX() - secondSide.getX(), 2)
                + Math.pow(firstSide.getY() - secondSide.getY(), 2)
                + Math.pow(firstSide.getZ() - secondSide.getZ(), 2));

        double sizeOfUpperSideOfRectangle = Math.sqrt(Math.pow(secondSide.getX() - thirdSide.getX(), 2)
                + Math.pow(secondSide.getY() - thirdSide.getY(), 2)
                + Math.pow(secondSide.getZ() - thirdSide.getZ(), 2));

        return (sizeOfLeftSideOfRectangle + sizeOfUpperSideOfRectangle) * Constants.TWO_PAIRED_SIDES;
    }

    private static double distanceBetweenPoints(Point p, Point q) {
        return Math.sqrt(Math.pow(p.getX() - q.getX(), 2) + Math.pow(p.getY() - q.getY(), 2) + Math.pow(p.getZ() - q.getZ(), 2));
    }

    private static int countingVectorCoordinates(int point1, int point2) {
        return point2 - point1;
    }
}