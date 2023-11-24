public class Rectangle extends Figure {

    private static Point[] points;

    public Rectangle(Point[] points) {
        this.points = points;
    }

    public static boolean isRectangleValid() {
        int xSizeOfFirstSide = Math.abs(points[0].getX() - points[1].getX());
        int ySizeOfFirstSide = Math.abs(points[0].getY() - points[1].getY());
        int xSizeOfSecondSide = Math.abs(points[2].getX() - points[3].getX());
        int ySizeOfSecondSide = Math.abs(points[2].getY() - points[3].getY());

        if (points.length == 2) {
            return (xSizeOfFirstSide == xSizeOfSecondSide) && (ySizeOfFirstSide == ySizeOfSecondSide)
                    && ((xSizeOfFirstSide * ySizeOfFirstSide) != 0);
        } else {
            int zSizeOfFirstSide = Math.abs(points[0].getZ() - points[1].getZ());
            int zSizeOfSecondSide = Math.abs(points[2].getZ() - points[3].getZ());
            return (xSizeOfFirstSide == xSizeOfSecondSide) && (ySizeOfFirstSide == ySizeOfSecondSide)
                    && (zSizeOfFirstSide == zSizeOfSecondSide)
                    && ((xSizeOfFirstSide * ySizeOfFirstSide * zSizeOfFirstSide) != 0);
        }
    }

    public static double countingOfRectangleArea() {
        double sizeOfLeftSideOfRectangle = 0;
        double sizeOfUpperSideOfRectangle = 0;
        if (points.length == 2) {
            sizeOfLeftSideOfRectangle = Math.sqrt(Math.pow(points[0].getX() - points[1].getX(), 2)
                    + Math.pow(points[0].getY() - points[1].getY(), 2));

            sizeOfUpperSideOfRectangle = Math.sqrt(Math.pow(points[1].getX() - points[2].getX(), 2)
                    + Math.pow(points[1].getY() - points[2].getY(), 2));


        } else if (points.length == 3) {
            sizeOfLeftSideOfRectangle = Math.sqrt(Math.pow(points[0].getX() - points[1].getX(), 2)
                    + Math.pow(points[0].getY() - points[1].getY(), 2)
                    + Math.pow(points[0].getZ() - points[1].getZ(), 2));

            sizeOfUpperSideOfRectangle = Math.sqrt(Math.pow(points[1].getX() - points[2].getX(), 2)
                    + Math.pow(points[1].getY() - points[2].getY(), 2)
                    + Math.pow(points[1].getZ() - points[2].getZ(), 2));

        }

        return sizeOfLeftSideOfRectangle * sizeOfUpperSideOfRectangle;
    }

    public static double countingOfRectanglePerimeter() {
        double sizeOfLeftSideOfRectangle = 0;
        double sizeOfUpperSideOfRectangle = 0;
        if (points.length == 2) {
            sizeOfLeftSideOfRectangle = Math.sqrt(Math.pow(points[0].getX() - points[1].getX(), 2)
                    + Math.pow(points[0].getY() - points[1].getY(), 2));

            sizeOfUpperSideOfRectangle = Math.sqrt(Math.pow(points[1].getX() - points[2].getX(), 2)
                    + Math.pow(points[1].getY() - points[2].getY(), 2));


        } else if (points.length == 3) {
            sizeOfLeftSideOfRectangle = Math.sqrt(Math.pow(points[0].getX() - points[1].getX(), 2)
                    + Math.pow(points[0].getY() - points[1].getY(), 2)
                    + Math.pow(points[0].getZ() - points[1].getZ(), 2));

            sizeOfUpperSideOfRectangle = Math.sqrt(Math.pow(points[1].getX() - points[2].getX(), 2)
                    + Math.pow(points[1].getY() - points[2].getY(), 2)
                    + Math.pow(points[1].getZ() - points[2].getZ(), 2));

        }

        return (sizeOfLeftSideOfRectangle + sizeOfUpperSideOfRectangle) * 2;
    }
}