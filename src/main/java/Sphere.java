import constants.Constants;

import java.util.ArrayList;

public class Sphere extends Figure {
    private final ArrayList<Point> points;

    private Point center;

    private Point pointOnSurface;

    public Sphere(ArrayList<Point> points) {
        this.points = points;
    }

    @Override
    public boolean isFigureValid() {
        if (points.size() != Constants.TWO_COORDINATES) {
            return false;
        }

        getPoints();
        double radiusSquared = calculateLength(pointOnSurface, center);
        return radiusSquared > 0;
    }

    @Override
    public double countingFigureArea() {
        getPoints();
        double radius = calculateLength(pointOnSurface, center);
        return  4 * Math.PI * Math.pow(radius, 2);
    }

    private void getPoints() {
        center = points.get(Constants.FIRST_POINT_INDEX);
        pointOnSurface = points.get(Constants.SECOND_POINT_INDEX);
    }

    protected double calculateLength(Point pointA, Point pointB) {
        int x = pointB.getX() - pointA.getX();
        int y = pointB.getY() - pointA.getY();
        int z = pointB.getZ() - pointA.getZ();
        return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2) + Math.pow(z, 2));
    }
}
