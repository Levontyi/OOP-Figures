public class Parallelogram extends Figure {

    private static Point[] points;

    public Parallelogram(Point[] points) {
        this.points = points;
    }

    public static boolean isParallelogramValid() {
        int x1 = points[0].getX();
        int y1 = points[0].getY();
        int x2 = points[1].getX();
        int y2 = points[1].getY();
        int x3 = points[3].getX();
        int y3 = points[3].getY();
        if (points.length == 2) {

            int vectorOfFirstSideOnX = x2 - x1;
            int vectorOfFirstSideOnY = y2 - y1;

            int vectorOfSecondSideOnX = x3 - x1;
            int vectorOfSecondSideOnY = y3 - y1;

            return (vectorOfFirstSideOnX / vectorOfSecondSideOnX) != (vectorOfFirstSideOnY / vectorOfSecondSideOnY);

        } else if (points.length == 3) {
            int z1 = points[0].getY();
            int z2 = points[1].getY();
            int z3 = points[3].getY();

            int vectorOfFirstSideOnX = x2 - x1;
            int vectorOfFirstSideOnY = y2 - y1;
            int vectorOfFirstSideOnZ = z2 - z1;

            int vectorOfSecondSideOnX = x3 - x1;
            int vectorOfSecondSideOnY = y3 - y1;
            int vectorOfSecondSideOnZ = z3 - z1;

            if (vectorOfFirstSideOnX / vectorOfSecondSideOnX == vectorOfFirstSideOnY / vectorOfSecondSideOnY && vectorOfFirstSideOnY / vectorOfSecondSideOnY == vectorOfFirstSideOnZ / vectorOfSecondSideOnZ && vectorOfFirstSideOnX / vectorOfSecondSideOnX == vectorOfFirstSideOnZ / vectorOfSecondSideOnZ) {
                return false;
            } else {
                return true;
            }
        } else {
            return false;
        }
    }

    public static double countingParallelogramArea() {
        return 0;
    }

    public static double countingParallelogramPerimeter() {
        return 0;
    }
}
