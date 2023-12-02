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
        Point firstSide = points.get(0);
        Point secondSide = points.get(1);
        Point thirdSide = points.get(2);


        lengthFirstSideOfTriangle = Math.sqrt(Math.pow(secondSide.getX() - firstSide.getX(), 2)
                + Math.pow(secondSide.getY() - firstSide.getY(), 2));
        lengthSecondSideOfTriangle = Math.sqrt(Math.pow(thirdSide.getX() - firstSide.getX(), 2)
                + Math.pow(thirdSide.getY() - firstSide.getY(), 2));
        lengthThirdSideOfTriangle = Math.sqrt(Math.pow(thirdSide.getX() - secondSide.getX(), 2)
                + Math.pow(thirdSide.getY() - secondSide.getY(), 2));

        boolean isValid = (lengthFirstSideOfTriangle + lengthSecondSideOfTriangle > lengthThirdSideOfTriangle)
                && (lengthFirstSideOfTriangle + lengthThirdSideOfTriangle > lengthSecondSideOfTriangle)
                && (lengthSecondSideOfTriangle + lengthThirdSideOfTriangle > lengthFirstSideOfTriangle);
        try {
             firstSide.getZ();
        } finally {
            lengthFirstSideOfTriangle = Math.sqrt(Math.pow(secondSide.getX() - firstSide.getX(), 2)
                    + Math.pow(secondSide.getY() - firstSide.getY(), 2) + Math.pow(secondSide.getZ() - firstSide.getZ(), 2));
            lengthSecondSideOfTriangle = Math.sqrt(Math.pow(thirdSide.getX() - firstSide.getX(), 2)
                    + Math.pow(thirdSide.getY() - firstSide.getY(), 2) + Math.pow(thirdSide.getZ() - firstSide.getZ(), 2));
            lengthThirdSideOfTriangle = Math.sqrt(Math.pow(thirdSide.getX() - secondSide.getX(), 2)
                    + Math.pow(thirdSide.getY() - secondSide.getY(), 2) + Math.pow(thirdSide.getZ() - secondSide.getZ(), 2));

            isValid = (lengthFirstSideOfTriangle + lengthSecondSideOfTriangle > lengthThirdSideOfTriangle)
                    && (lengthFirstSideOfTriangle + lengthThirdSideOfTriangle > lengthSecondSideOfTriangle)
                    && (lengthSecondSideOfTriangle + lengthThirdSideOfTriangle > lengthFirstSideOfTriangle);
        }

        return isValid;
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
