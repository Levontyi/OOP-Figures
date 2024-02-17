import constants.Constants;

import java.util.ArrayList;

public class Cylinder extends Figure {
    private final ArrayList<Point> points;

    private Point baseCenter;

    private Point pointOnBaseCircle;

    private Point topCenter;

    public Cylinder(ArrayList<Point> points) {
        this.points = points;
    }

    @Override
    public boolean isFigureValid() {
        if (points.size() != Constants.THREE_COORDINATES) {
            return false;
        }

        getPoints();
        double radius = calculateLength(pointOnBaseCircle, baseCenter);
        if (radius <= 0) {
            return false;
        }
        double height = Math.abs(topCenter.getZ() - baseCenter.getZ());
        return height > 0;
    }
    @Override
    public double countingFigureArea() {
        getPoints();
        double radius = calculateLength(pointOnBaseCircle, baseCenter);
        double height = calculateLength(topCenter, baseCenter);
        return  2 * Math.PI * radius * (radius + height);
    }

    private void getPoints() {
        baseCenter = points.get(Constants.FIRST_POINT_INDEX);
        topCenter = points.get(Constants.SECOND_POINT_INDEX);
        pointOnBaseCircle = points.get(Constants.THIRD_POINT_INDEX);
    }

    protected double calculateLength(Point pointA, Point pointB) {
        int x = pointB.getX() - pointA.getX();
        int y = pointB.getY() - pointA.getY();
        int z = pointB.getZ() - pointA.getZ();
        return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2) + Math.pow(z, 2));
    }
}
