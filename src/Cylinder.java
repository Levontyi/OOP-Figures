public class Cylinder extends  Figure {

    private static Point[] points;
    private static double radiusOfBase;
    private static double cylinderHeight;
    public Cylinder(Point[] points) {
        this.points = points;
    }

    public static boolean isCylinderValid() {
        int x1 = points[0].getX();
        int y1 = points[0].getY();
        int z1 = points[0].getZ();
        int x2 = points[1].getX();
        int y2 = points[1].getY();
        int z2 = points[1].getZ();
        int x3 = points[2].getX();
        int y3 = points[2].getY();
        int z3 = points[2].getZ();

        int angleBetweenVectorsInUpperPlane = (x2 - x1) * (x3 - x2) + (y2 - y1) * (y3 - y2) + (z2 - z1) * (z3 - z2); //Верхняя плоскость
        int angleBetweenVectorsInLowerPlane = (x1 - x2) * (x3 - x1) + (y1 - y2) * (y3 - y1) + (z1 - z2) * (z3 - z1); //Нижняя плоскость
        double height = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2) + Math.pow(z2 - z1, 2));
        cylinderHeight = height;
        double radius;

        if (angleBetweenVectorsInUpperPlane == 0) {
            radius = Math.sqrt(Math.pow(x2 - x3, 2) + Math.pow(y2 - y3, 2) + Math.pow(z2 - z3, 2));
            radiusOfBase = radius;

            if (radius > 0 && height > 0) {
                return true;
            } else {
                return false;
            }
        } else if (angleBetweenVectorsInLowerPlane == 0) {
            radius = Math.sqrt(Math.pow(x1 - x3, 2) + Math.pow(y1 - y3, 2) + Math.pow(z1 - z3, 2));
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
        int x1 = points[0].getX();
        int y1 = points[0].getY();
        int z1 = points[0].getZ();
        int x2 = points[1].getX();
        int y2 = points[1].getY();
        int z2 = points[1].getZ();
        int x3 = points[2].getX();
        int y3 = points[2].getY();
        int z3 = points[2].getZ();

        double S = 2 * Math.PI * radiusOfBase * (cylinderHeight + radiusOfBase);
        return S;
    }
}
