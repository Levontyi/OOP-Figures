import constants.Constants;

import java.util.ArrayList;

public class Triangle extends Figure {
    private final ArrayList<Point> points;
    private double sideAB;

    private double sideBC;

    private  double sideAC;

    private Point pointA;

    private Point pointB;

    private Point pointC;

    public Triangle(ArrayList<Point> points) {
        this.points = points;
    }

    @Override
    public boolean isFigureValid() {
        if (points.size() == Constants.THREE_COORDINATES) {
            getPoints();
            return (pointB.getX() - pointA.getX())
                    * (pointC.getY() - pointA.getY())
                    - (pointC.getX() - pointA.getX())
                    * (pointB.getY() - pointA.getY()) != 0;
        }
        return false;
    }

    @Override
    public double countingFigureArea() {
        getPoints();
        calculateSides();
        double halfPer = countingFigurePerimeter() / 2;
        return Math.sqrt(halfPer * (halfPer - sideAB) * (halfPer - sideBC) * (halfPer - sideAC));
    }

    @Override
    public double countingFigurePerimeter() {
        getPoints();
        calculateSides();
        return sideAB + sideBC + sideAC;
    }

    private void calculateSides() {
        sideAB = calculateLength(pointA, pointB);
        sideBC = calculateLength(pointB, pointC);
        sideAC = calculateLength(pointA, pointC);
    }

    private void getPoints() {
        pointA = points.get(Constants.FIRST_POINT_INDEX);
        pointB = points.get(Constants.SECOND_POINT_INDEX);
        pointC = points.get(Constants.THIRD_POINT_INDEX);
    }

    protected double calculateLength(Point pointA, Point pointB) {
        int x = pointB.getX() - pointA.getX();
        int y = pointB.getY() - pointA.getY();
        int z = pointB.getZ() - pointA.getZ();
        return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2) + Math.pow(z, 2));
    }
}
