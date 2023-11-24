public class Sphere extends  Figure {
    private static Point[] points;
    public Sphere() {
        this.points = points;
    }

    public static boolean isSphereValid() {
        int x1 = points[0].getX();
        int y1 = points[0].getY();
        int z1 = points[0].getZ();
        int x2 = points[1].getX();
        int y2 = points[1].getY();
        int z2 = points[1].getZ();

        if (x1 == x2 && y1 == y2 && z1 == z2) {
            return false;
        } else {
            return true;
        }
    }

    public static double countingAreaOfSphere() {
        int x1 = points[0].getX();
        int y1 = points[0].getY();
        int z1 = points[0].getZ();
        int x2 = points[1].getX();
        int y2 = points[1].getY();
        int z2 = points[1].getZ();

        double S = 4 * Math.PI * Math.pow(Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2) + Math.pow(z2 - z1, 2)), 2);
        return S;
    }
}
