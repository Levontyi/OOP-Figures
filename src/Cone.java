public class Cone extends  Figure {
    private static Point[] points;
    static double radiusOfBaseOfCone;
    static double height;
    public Cone(Point[] points) {
        this.points = points;
    }

    public static boolean isConeValid() {
        int x1 = points[0].getX();
        int y1 = points[0].getY();
        int z1 = points[0].getZ();
        int x2 = points[1].getX();
        int y2 = points[1].getY();
        int z2 = points[1].getZ();
        int x3 = points[2].getX();
        int y3 = points[2].getY();
        int z3 = points[2].getZ();

        radiusOfBaseOfCone = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2) + Math.pow(z2 - z1, 2));
        height = Math.sqrt(Math.pow(x3 - x1, 2) + Math.pow(y3 - y1, 2) + Math.pow(z3 - z1, 2));

        int angleBetweenVectors = (x2 - x1) * (x3 - x2) + (y2 - y1) * (y3 - y2) + (z2 - z1) * (z3 - z2);

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
