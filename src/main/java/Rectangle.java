import java.util.ArrayList;

public class Rectangle extends Figure {

    private static ArrayList<Point> points;

    public Rectangle(ArrayList<Point> points) {
        this.points = points;
    }

    public static boolean isRectangleValid() {
        Point firstSide = points.get(0);
        Point secondSide = points.get(1);
        Point thirdSide = points.get(2);
        Point fourthSide = points.get(3);

        int xSizeOfFirstSide = Math.abs(firstSide.getX() - secondSide.getX());
        int ySizeOfFirstSide = Math.abs(firstSide.getY() - secondSide.getY());
        int xSizeOfSecondSide = Math.abs(thirdSide.getX() - fourthSide.getX());
        int ySizeOfSecondSide = Math.abs(thirdSide.getY() - fourthSide.getY());

        boolean isValid = (xSizeOfFirstSide == xSizeOfSecondSide) && (ySizeOfFirstSide == ySizeOfSecondSide)
                    && ((xSizeOfFirstSide * ySizeOfFirstSide) != 0);
        try {
            firstSide.getZ();
        } finally {
            int zSizeOfFirstSide = Math.abs(firstSide.getZ() - secondSide.getZ());
            int zSizeOfSecondSide = Math.abs(thirdSide.getZ() - fourthSide.getZ());
            isValid = (xSizeOfFirstSide == xSizeOfSecondSide) && (ySizeOfFirstSide == ySizeOfSecondSide)
                    && (zSizeOfFirstSide == zSizeOfSecondSide)
                    && ((xSizeOfFirstSide * ySizeOfFirstSide * zSizeOfFirstSide) != 0);
        }
        return isValid;
    }

    public static double countingOfRectangleArea() {
        Point firstSide = points.get(0);
        Point secondSide = points.get(1);
        Point thirdSide = points.get(2);
        Point fourthSide = points.get(3);

        double sizeOfLeftSideOfRectangle = Math.sqrt(Math.pow(firstSide.getX() - secondSide.getX(), 2)
                + Math.pow(firstSide.getY() - secondSide.getY(), 2));

        double sizeOfUpperSideOfRectangle = Math.sqrt(Math.pow(secondSide.getX() - thirdSide.getX(), 2)
                + Math.pow(secondSide.getY() - thirdSide.getY(), 2));
        try {
            firstSide.getZ();
        } finally {
            sizeOfLeftSideOfRectangle = Math.sqrt(Math.pow(firstSide.getX() - secondSide.getX(), 2)
                    + Math.pow(firstSide.getY() - secondSide.getY(), 2)
                    + Math.pow(firstSide.getZ() - secondSide.getZ(), 2));

            sizeOfUpperSideOfRectangle = Math.sqrt(Math.pow(secondSide.getX() - thirdSide.getX(), 2)
                    + Math.pow(secondSide.getY() - thirdSide.getY(), 2)
                    + Math.pow(secondSide.getZ() - thirdSide.getZ(), 2));

        }

        return sizeOfLeftSideOfRectangle * sizeOfUpperSideOfRectangle;
    }

    public static double countingOfRectanglePerimeter() {
        Point firstSide = points.get(0);
        Point secondSide = points.get(1);
        Point thirdSide = points.get(2);
        Point fourthSide = points.get(3);

        double sizeOfLeftSideOfRectangle = Math.sqrt(Math.pow(firstSide.getX() - secondSide.getX(), 2)
                + Math.pow(firstSide.getY() - secondSide.getY(), 2));

        double sizeOfUpperSideOfRectangle = Math.sqrt(Math.pow(secondSide.getX() - thirdSide.getX(), 2)
                + Math.pow(secondSide.getY() - thirdSide.getY(), 2));
        try {
            firstSide.getZ();
        } finally {
            sizeOfLeftSideOfRectangle = Math.sqrt(Math.pow(firstSide.getX() - secondSide.getX(), 2)
                    + Math.pow(firstSide.getY() - secondSide.getY(), 2)
                    + Math.pow(firstSide.getZ() - secondSide.getZ(), 2));

            sizeOfUpperSideOfRectangle = Math.sqrt(Math.pow(secondSide.getX() - thirdSide.getX(), 2)
                    + Math.pow(secondSide.getY() - thirdSide.getY(), 2)
                    + Math.pow(secondSide.getZ() - thirdSide.getZ(), 2));
        }

        return (sizeOfLeftSideOfRectangle + sizeOfUpperSideOfRectangle) * 2;
    }
}