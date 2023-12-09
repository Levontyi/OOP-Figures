import java.util.ArrayList;

public class Triangle extends Figure {

    private static ArrayList<Point> points;
    private static double lengthFirstSideOfTriangle;
    private static double lengthSecondSideOfTriangle;
    private static double lengthThirdSideOfTriangle;
    public Triangle(ArrayList<Point> points) {
        this.points = points;
    }

    public static boolean isTriangleValid() {
        Point firstPoint = points.get(0);
        Point secondPoint = points.get(1);
        Point thirdPoint = points.get(2);

        lengthFirstSideOfTriangle = Math.sqrt(Math.pow(secondPoint.getX() - firstPoint.getX(), 2)
                + Math.pow(secondPoint.getY() - firstPoint.getY(), 2) + Math.pow(secondPoint.getZ() - firstPoint.getZ(), 2));
        lengthSecondSideOfTriangle = Math.sqrt(Math.pow(thirdPoint.getX() - firstPoint.getX(), 2)
                + Math.pow(thirdPoint.getY() - firstPoint.getY(), 2) + Math.pow(thirdPoint.getZ() - firstPoint.getZ(), 2));
        lengthThirdSideOfTriangle = Math.sqrt(Math.pow(thirdPoint.getX() - secondPoint.getX(), 2)
                + Math.pow(thirdPoint.getY() - secondPoint.getY(), 2) + Math.pow(thirdPoint.getZ() - secondPoint.getZ(), 2));

        int firstVectorX = secondPoint.getX() - firstPoint.getX();
        int firstVectorY = secondPoint.getY() - firstPoint.getY();
        int firstVectorZ = secondPoint.getZ() - firstPoint.getZ();

        int secondVectorX = thirdPoint.getX() - firstPoint.getX();
        int secondVectorY = thirdPoint.getY() - firstPoint.getY();
        int secondVectorZ = thirdPoint.getZ() - firstPoint.getZ();

        boolean vectorsNotCollinear = (firstVectorY * secondVectorZ - firstVectorZ * secondVectorY)
                - (firstVectorX * secondVectorZ - firstVectorZ * secondVectorX)
                - (firstVectorX * secondVectorY - firstVectorY * secondVectorX) != 0;

        return  (lengthFirstSideOfTriangle + lengthSecondSideOfTriangle > lengthThirdSideOfTriangle)
                && (lengthFirstSideOfTriangle + lengthThirdSideOfTriangle > lengthSecondSideOfTriangle)
                && (lengthSecondSideOfTriangle + lengthThirdSideOfTriangle > lengthFirstSideOfTriangle)
                && vectorsNotCollinear;
    }

    public static double countingAreaOfTriangle() {
        double halfOfPerimeter = (lengthFirstSideOfTriangle + lengthSecondSideOfTriangle + lengthThirdSideOfTriangle) / 2;

        return Math.sqrt(halfOfPerimeter * (halfOfPerimeter - lengthFirstSideOfTriangle)
                * (halfOfPerimeter - lengthSecondSideOfTriangle)
                * (halfOfPerimeter - lengthThirdSideOfTriangle));
    }

    public static double countingPerimeterOfTriangle() {
        return lengthFirstSideOfTriangle + lengthSecondSideOfTriangle + lengthThirdSideOfTriangle;
    }
}
