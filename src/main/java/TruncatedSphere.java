import java.util.ArrayList;

public class TruncatedSphere extends Figure {

    private static ArrayList<Point> points;

    public TruncatedSphere(ArrayList<Point> points) {
        this.points = points;
    }

    public static boolean isTruncatedSphereValid() {
        Point center = points.get(0);
        Point pointOnSphere = points.get(1);
        Point pointOnSlice = points.get(2);

        double radius = Math.sqrt(Math.pow(pointOnSphere.getX() - center.getX(), 2)
                + Math.pow(pointOnSphere.getY() - center.getY(), 2)
                + Math.pow(pointOnSphere.getZ() - center.getZ(), 2));

        return Math.abs(Math.sqrt(Math.pow(pointOnSlice.getX() - center.getX(), 2)
                + Math.pow(pointOnSlice.getY() - center.getY(), 2)
                + Math.pow(pointOnSlice.getZ() - center.getZ(), 2)) - radius) <= radius;
    }

    public static double countingTruncatedSphereArea() {
        Point center = points.get(0);
        Point pointOnSphere = points.get(1);
        Point pointOnSlice = points.get(2);
        double radius = Math.sqrt(Math.pow(pointOnSphere.getX() - center.getX(), 2)
                + Math.pow(pointOnSphere.getY() - center.getY(), 2)
                + Math.pow(pointOnSphere.getZ() - center.getZ(), 2));

        double sliceRadius = Math.sqrt(Math.pow(pointOnSlice.getX() - center.getX(), 2)
                + Math.pow(pointOnSlice.getY() - center.getY(), 2)
                + Math.pow(pointOnSlice.getZ() - center.getZ(), 2));

        return 4 * Math.PI * Math.pow(radius, 2) - 2 * Math.PI * Math.pow(sliceRadius, 2);
    }
}
