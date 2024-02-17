import constants.Constants;

import java.util.ArrayList;

public class Polygon extends Figure {
    private final ArrayList<Point> points;

    private final int amountOfPoints;

    public Polygon(ArrayList<Point> points) {
        this.points = points;
        amountOfPoints = points.size();
    }

    @Override
    public boolean isFigureValid() {
        if (amountOfPoints < Constants.THREE_COORDINATES) {
            return false;
        }

        for (int i = 0; i < amountOfPoints - 2; i++) {
            double crossProduct = (points.get(i + 1).getX() - points.get(i).getX())
                    * (points.get(i + 2).getY() - points.get(i + 1).getY())
                    - (points.get(i + 1).getY() - points.get(i).getY())
                    * (points.get(i + 2).getX() - points.get(i + 1).getX());

            if (crossProduct == 0) {
                return false;
            }
        }
        return true;
    }

    @Override
    public double countingFigureArea() {
        double area = 0;
        for (int i = 0; i < amountOfPoints; i++) {
            Point current = points.get(i);
            Point next = points.get((i + 1) % amountOfPoints);
            area += current.getX() * next.getY() - current.getY() * next.getX();
        }
        area = Math.abs(area) / 2.0;
        return area;
    }

    @Override
    public double countingFigurePerimeter() {
        double perimeter = 0;
        for (int i = 0; i < amountOfPoints - 1; i++) {
            perimeter += calculateLength(points.get(i), points.get(i + 1));
        }
        perimeter += calculateLength(points.get(amountOfPoints - 1), points.get(0));
        return perimeter;
    }

    protected double calculateLength(Point pointA, Point pointB) {
        int x = pointB.getX() - pointA.getX();
        int y = pointB.getY() - pointA.getY();
        int z = pointB.getZ() - pointA.getZ();
        return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2) + Math.pow(z, 2));
    }
}