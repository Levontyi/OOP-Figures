import java.util.ArrayList;

public class Parallelogram extends Figure {

    private static ArrayList<Point> points;

    private static final double ZERO_POINT_FIVE = 0.5;

    public Parallelogram(ArrayList<Point> points) {
        this.points = points;
    }

    public static boolean isParallelogramValid() {
        Point firstSide = points.get(0);
        Point secondSide = points.get(1);
        Point thirdSide = points.get(2);

        int vectorOfFirstSideOnX = secondSide.getX() - firstSide.getX();
        int vectorOfFirstSideOnY = secondSide.getY() - firstSide.getY();

        int vectorOfSecondSideOnX = thirdSide.getX() - firstSide.getX();
        int vectorOfSecondSideOnY = thirdSide.getY() - firstSide.getY();

        boolean isValid = (vectorOfFirstSideOnX / vectorOfSecondSideOnX)
                    != (vectorOfFirstSideOnY / vectorOfSecondSideOnY);


        return isValid;
    }

    public static double countingParallelogramArea() {
        Point firstSide = points.get(0);
        Point secondSide = points.get(1);
        Point thirdSide = points.get(2);
        Point fourthSide = points.get(3);

        double AC = Math.sqrt(Math.pow(firstSide.getX() - thirdSide.getX(), 2)
                + Math.pow(firstSide.getY() - thirdSide.getY(), 2))
                + Math.pow(firstSide.getZ() - thirdSide.getZ(), 2);
        double BD = Math.sqrt(Math.pow(secondSide.getX() - fourthSide.getX(), 2)
                + Math.pow(secondSide.getY() - fourthSide.getY(), 2)
                + Math.pow(secondSide.getZ() - fourthSide.getZ(), 2));
        return ZERO_POINT_FIVE * AC * BD;
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
}
