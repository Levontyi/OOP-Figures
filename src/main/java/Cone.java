import constants.Constants;

import java.util.ArrayList;

public class Cone extends Figure {
    private final ArrayList<Point> points;

    private Point center;

    private Point pointOnCircle;

    private Point coneTop;

    public Cone(ArrayList<Point> points) {
        this.points = points;
    }

    @Override
    public boolean isFigureValid() {
        if (points.size() != Constants.THREE_COORDINATES) {
            return false;
        }
        getPoints();
        double radius = calculateLength(center, pointOnCircle);
        double height = calculateLength(center, coneTop);

        return radius > 0 && height > 0;
    }

    @Override
    public double countingFigureArea() {
        getPoints();
        double radius = calculateLength(pointOnCircle, center);
        double height = calculateLength(coneTop, center);
        double l = Math.sqrt(Math.pow(height, 2) + Math.pow(radius, 2));
        return Math.PI * radius * (radius + l);
    }

    private void getPoints() {
        center = points.get(Constants.FIRST_POINT_INDEX);
        pointOnCircle = points.get(Constants.SECOND_POINT_INDEX);
        coneTop = points.get(Constants.THIRD_POINT_INDEX);
    }

    protected double calculateLength(Point pointA, Point pointB) {
        int x = pointB.getX() - pointA.getX();
        int y = pointB.getY() - pointA.getY();
        int z = pointB.getZ() - pointA.getZ();
        return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2) + Math.pow(z, 2));
    }
}
