import java.util.ArrayList;

public class Cone extends  Figure {
    private static ArrayList<Point> points;
    private static double radiusOfBaseOfCone;
    private static double height;

    public Cone(ArrayList<Point> points) {
        this.points = points;
    }

    public static boolean isConeValid() {
        Point center = points.get(0);
        Point pointOnBase = points.get(1);
        Point topOfCone = points.get(2);

        radiusOfBaseOfCone = Math.sqrt(Math.pow(pointOnBase.getX() - center.getX(), 2)
                + Math.pow(pointOnBase.getY() - pointOnBase.getY(), 2) + Math.pow(pointOnBase.getZ() - center.getZ(), 2));
        height = Math.sqrt(Math.pow(topOfCone.getX() - center.getX(), 2)
                + Math.pow(topOfCone.getY() - center.getY(), 2) + Math.pow(topOfCone.getZ() - center.getZ(), 2));

        int angleBetweenVectors = (pointOnBase.getX() - center.getX()) * (topOfCone.getX() - center.getX())
                + (pointOnBase.getY() - pointOnBase.getY()) * (topOfCone.getY() - center.getY())
                + (pointOnBase.getZ() - center.getZ()) * (topOfCone.getZ() - center.getZ());

        if (angleBetweenVectors == 0 && radiusOfBaseOfCone > 0 && height > 0) {
            return true;
        } else {
            return false;
        }
    }

    public static double countingAreaOfCone() {
        double lineOnSideOfCone = Math.sqrt(Math.pow(radiusOfBaseOfCone, 2) + Math.pow(height, 2));
        double S = Math.PI * radiusOfBaseOfCone * (radiusOfBaseOfCone + lineOnSideOfCone);

        return S;
    }
}
