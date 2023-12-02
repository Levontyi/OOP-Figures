import java.util.ArrayList;

public class Square extends Figure {

    private static ArrayList<Point> points;

    public Square(ArrayList<Point> points) {
        this.points = points;
    }

    public static boolean isSquareValid() {
        Point firstSide = points.get(0);
        Point secondSide = points.get(1);
        Point thirdSide = points.get(2);
        Point fourthSide = points.get(2);

        double AB = distSq(firstSide, secondSide);
        double AD = distSq(firstSide, fourthSide);
        double BC = distSq(secondSide, thirdSide);
        double CD = distSq(thirdSide, fourthSide);

        boolean isPerpendicular = ((firstSide.getX() * secondSide.getX() + firstSide.getY() * secondSide.getY()) == 0)
                && ((secondSide.getX() * thirdSide.getX() + secondSide.getY() * thirdSide.getY()) == 0)
                && ((thirdSide.getX() * fourthSide.getX() + thirdSide.getY() * fourthSide.getY()) == 0);

        /*try {
            firstSide.getZ();
        } finally {
            AB = distSqWithThreePoints(firstSide, secondSide);
            AD = distSqWithThreePoints(firstSide, fourthSide);
            BC = distSqWithThreePoints(secondSide, thirdSide);
            CD = distSqWithThreePoints(thirdSide, fourthSide);
            isPerpendicular = ((firstSide.getX() * secondSide.getX() + firstSide.getY() * secondSide.getY()
                    + firstSide.getZ() * secondSide.getZ()) == 0) && ((secondSide.getX() * thirdSide.getX()
                    + secondSide.getY() * thirdSide.getY() + secondSide.getZ() * thirdSide.getZ()) == 0)
                    && ((thirdSide.getX() * fourthSide.getX() + thirdSide.getY() * fourthSide.getY()
                    + thirdSide.getZ() * fourthSide.getZ()) == 0);
        }*/


        return isPerpendicular && (AB == AD) && (AD == BC) && (BC == CD);
    }

    public static double countingAreaOfSquare() {
        Point firstSide = points.get(0);
        Point secondSide = points.get(1);
        Point thirdSide = points.get(2);
        double S = Math.sqrt(Math.pow(firstSide.getX() - secondSide.getX(), 2)
                    + Math.pow(firstSide.getY() - secondSide.getY(), 2));
        try {
            firstSide.getZ();
        } finally {
            S = Math.sqrt(Math.pow(firstSide.getX() - secondSide.getX(), 2)
                    + Math.pow(firstSide.getY() - secondSide.getY(), 2)
                    + Math.pow(firstSide.getZ() - secondSide.getZ(), 2));
        }

        return Math.pow(S, 2);
    }

    public static double countingPerimeterOfSquare() {
        Point firstSide = points.get(0);
        Point secondSide = points.get(1);
        Point thirdSide = points.get(2);
        double isValid = Math.sqrt(Math.pow(firstSide.getX() - secondSide.getX(), 2)
                + Math.pow(firstSide.getY() - secondSide.getY(), 2)) * 4;
        try {
            firstSide.getZ();
        } finally {
            isValid = Math.sqrt(Math.pow(firstSide.getX() - secondSide.getX(), 2)
                    + Math.pow(firstSide.getY() - secondSide.getY(), 2)
                    + Math.pow(firstSide.getZ() - secondSide.getZ(), 2)) * 4;
        }
        return isValid;
    }

    static double distSq(Point p, Point q)
    {
        return Math.pow(p.getX() - q.getX(), 2) + Math.pow(p.getY() - q.getY(), 2);
    }

    static double distSqWithThreePoints(Point p, Point q)
    {
        return Math.pow(p.getX() - q.getX(), 2) + Math.pow(p.getY() - q.getY(), 2) + Math.pow(p.getZ() - q.getZ(), 2);
    }
}