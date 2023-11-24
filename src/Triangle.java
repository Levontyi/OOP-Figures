public class Triangle extends  Figure {

    private static Point[] points;
    private static double firstSideOfTriangle;
    private static double secondSideOfTriangle;
    private static double thirdSideOfTriangle;
    public Triangle(Point[] points) {
        this.points = points;
    }

    public static boolean isTriangleValid() {
        int x1 = points[0].getX();
        int y1 = points[0].getY();
        int x2 = points[1].getX();
        int y2 = points[1].getY();
        int x3 = points[2].getX();
        int y3 = points[2].getY();

        if (points.length == 2) {
            firstSideOfTriangle = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
            secondSideOfTriangle = Math.sqrt(Math.pow(x3 - x1, 2) + Math.pow(y3 - y1, 2));
            thirdSideOfTriangle = Math.sqrt(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2));

            return (firstSideOfTriangle + secondSideOfTriangle > thirdSideOfTriangle)
                    && (firstSideOfTriangle + thirdSideOfTriangle > secondSideOfTriangle)
                    && (secondSideOfTriangle + thirdSideOfTriangle > firstSideOfTriangle);
        } else if (points.length == 3) {
            int z1 = points[0].getZ();
            int z2 = points[1].getZ();
            int z3 = points[2].getZ();

            firstSideOfTriangle = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2) + Math.pow(z2 - z1, 2));
            secondSideOfTriangle = Math.sqrt(Math.pow(x3 - x1, 2) + Math.pow(y3 - y1, 2) + Math.pow(z3 - z1, 2));
            thirdSideOfTriangle = Math.sqrt(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2) + Math.pow(z3 - z2, 2));

            return (firstSideOfTriangle + secondSideOfTriangle > thirdSideOfTriangle)
                    && (firstSideOfTriangle + thirdSideOfTriangle > secondSideOfTriangle)
                    && (secondSideOfTriangle + thirdSideOfTriangle > firstSideOfTriangle);
        } else {
            return false;
        }
    }

    public static double countingAreaOfTriangle() {
        double S;
        double halfOfPerimeter = (firstSideOfTriangle + secondSideOfTriangle + thirdSideOfTriangle) / 2;

        S = Math.sqrt(halfOfPerimeter * (halfOfPerimeter - firstSideOfTriangle)
                * (halfOfPerimeter - secondSideOfTriangle)
                * (halfOfPerimeter - thirdSideOfTriangle));
        return S;
    }

    public static double countingPerimeterOfTriangle() {
        return firstSideOfTriangle + secondSideOfTriangle + thirdSideOfTriangle;
    }
}
