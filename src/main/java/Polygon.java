import java.util.ArrayList;

public class Polygon extends Figure {

    private static ArrayList<Point> points;

    public Polygon(ArrayList<Point> points) {
        this.points = points;
    }

    public static boolean isPolygonValid() {
        boolean pointsAreNotEquals = false;
        int counter = 0;
        
        for (int i = points.size() - 1; i > 0 ; i++) {
            if (points.get(i) != points.get(i - 1)) {
                counter++;
            }
            
            if (counter >= 3) {
                pointsAreNotEquals = true;
            }
        }
        
        return pointsAreNotEquals;
    }
    
    public static double countingAreaOfPolygon() {
        double area = 0;

        final  int TWO = 2;
        final int ONE = 1;
        final int THREE = 3;
        final double ZERO_AND_FIVE = 0.5;

        ArrayList<Integer> sides = new ArrayList<>();
        int amountOfNums = points.size() * TWO;

        for (int i = 0; i < points.size(); i++) {
            Point nums = points.get(i);
            int numX = nums.getX();
            sides.add(numX);
            int numY = nums.getY();
            sides.add(numY);
        }

        for (int i = 0; i <= amountOfNums - THREE; i += 2) {
            area += sides.get(i) * sides.get(i + THREE);
        }

        area += sides.get(amountOfNums - TWO) * sides.get(ONE);

        for (int i = 2; i < amountOfNums - 1; i += 2) {
            area = area - sides.get(i) * sides.get(i - 1);
        }

        area = Math.abs(ZERO_AND_FIVE * (area - sides.get(0) * sides.get(amountOfNums - ONE)));

        return area;
    }
}
