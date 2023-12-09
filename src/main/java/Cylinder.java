import java.util.ArrayList;

public class Cylinder extends  Figure {

    private static ArrayList<Point> points;
    private static double radiusOfBase;
    private static double cylinderHeight;
    public Cylinder(ArrayList<Point> points) {
        this.points = points;
    }

    public static boolean isCylinderValid() {
        Point centerOfBase = points.get(0);
        Point firstPointOnCircle = points.get(1);
        Point secondPointOnCircle = points.get(2);

        int angleBetweenVectorsInUpperPlane = (firstPointOnCircle.getX() - centerOfBase.getX())
                * (secondPointOnCircle.getX() - firstPointOnCircle.getX())
                + (firstPointOnCircle.getY() - centerOfBase.getY())
                * (secondPointOnCircle.getY() - firstPointOnCircle.getY())
                + (firstPointOnCircle.getZ() - centerOfBase.getZ())
                * (secondPointOnCircle.getZ() - firstPointOnCircle.getZ());

        int angleBetweenVectorsInLowerPlane = (centerOfBase.getX() - firstPointOnCircle.getX())
                * (secondPointOnCircle.getX() - centerOfBase.getX()) + (centerOfBase.getY() - firstPointOnCircle.getY())
                * (secondPointOnCircle.getY() - centerOfBase.getY()) + (centerOfBase.getZ() - firstPointOnCircle.getZ())
                * (secondPointOnCircle.getZ() - centerOfBase.getZ());

        double height = Math.sqrt(Math.pow(firstPointOnCircle.getX() - centerOfBase.getX(), 2)
                + Math.pow(firstPointOnCircle.getY() - centerOfBase.getY(), 2)
                + Math.pow(firstPointOnCircle.getZ() - centerOfBase.getZ(), 2));

        cylinderHeight = height;
        double radius;

        if (angleBetweenVectorsInUpperPlane == 0) {
            radius = Math.sqrt(Math.pow(firstPointOnCircle.getX() - secondPointOnCircle.getX(), 2)
                    + Math.pow(firstPointOnCircle.getY() - secondPointOnCircle.getY(), 2)
                    + Math.pow(firstPointOnCircle.getZ() - secondPointOnCircle.getZ(), 2));
            radiusOfBase = radius;

            if (radius > 0 && height > 0) {
                return true;
            } else {
                return false;
            }
        } else if (angleBetweenVectorsInLowerPlane == 0) {
            radius = Math.sqrt(Math.pow(centerOfBase.getX() - secondPointOnCircle.getX(), 2) + Math.pow(centerOfBase.getY() - secondPointOnCircle.getY(), 2) + Math.pow(centerOfBase.getZ() - secondPointOnCircle.getZ(), 2));
            radiusOfBase = radius;

            if (radius > 0 && height > 0) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    public static double countingCylinderArea() {
        double S = 2 * Math.PI * radiusOfBase * (cylinderHeight + radiusOfBase);
        return S;
    }
}
