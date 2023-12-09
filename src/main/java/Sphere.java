import java.util.ArrayList;

public class Sphere extends Figure {

    private static ArrayList<Point> points;
    public Sphere(ArrayList<Point> points) {
        this.points = points;
    }

    public static boolean isSphereValid() {
        Point center = points.get(Constants.FIRST_POINT_INDEX);
        Point pointOnSphere = points.get(Constants.SECOND_POINT_INDEX);

        if (center.getX() == pointOnSphere.getX() && center.getY() == pointOnSphere.getY()
                && center.getZ() == pointOnSphere.getZ()) {
            return false;
        } else {
            return true;
        }
    }

    public static double countingAreaOfSphere() {
        Point center = points.get(Constants.FIRST_POINT_INDEX);
        Point pointOnSphere = points.get(Constants.SECOND_POINT_INDEX);
        return Constants.CONSTANT_FOUR_IN_SPHERE_AREA * Math.PI
                * Math.pow(Math.sqrt(Math.pow(pointOnSphere.getX() - center.getX(), 2)
                + Math.pow(pointOnSphere.getY() - center.getY(), 2)
                + Math.pow(pointOnSphere.getZ() - center.getZ(), 2)), 2);
    }
}
