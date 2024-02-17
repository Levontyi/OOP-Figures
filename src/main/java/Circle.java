import constants.Constants;

import java.util.ArrayList;

public class Circle extends Figure {
    private final ArrayList<Point> points;

    private Point center;

    private Point pointOnCircle;

    public Circle(ArrayList<Point> points) {
        this.points = points;
    }

    @Override
    public boolean isFigureValid() {
        if (points.size() == Constants.TWO_COORDINATES) {
            getPoints();
            return !(center.getX() == pointOnCircle.getX()
                    && center.getY() == pointOnCircle.getY()
                    && center.getZ() == pointOnCircle.getZ());
        }
        return false;
    }

    @Override
    public double countingFigureArea() {
        getPoints();
        double radius = calculateLength(center, pointOnCircle);
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double countingFigurePerimeter() {
        getPoints();
        double radius = calculateLength(center, pointOnCircle);
        return Math.PI * 2 * radius;
    }

    private void getPoints() {
        center = points.get(Constants.FIRST_POINT_INDEX);
        pointOnCircle = points.get(Constants.SECOND_POINT_INDEX);
    }

    protected double calculateLength(Point pointA, Point pointB) {
        int x = pointB.getX() - pointA.getX();
        int y = pointB.getY() - pointA.getY();
        int z = pointB.getZ() - pointA.getZ();
        return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2) + Math.pow(z, 2));
    }
}
