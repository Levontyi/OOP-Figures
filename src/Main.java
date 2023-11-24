import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        enteringFigure(scanner);
        enteringCoordinates(scanner);
    }

    public static Object enteringFigure(Scanner scanner) {

        String[] availableFigures = new String[11];
        availableFigures[0] = "FIGURE";
        availableFigures[1] = "CIRCLE";
        availableFigures[2] = "SQUARE";
        availableFigures[3] = "RECTANGLE";
        availableFigures[4] = "PARALLELOGRAM";
        availableFigures[5] = "TRIANGLE";
        availableFigures[6] = "POLYGON";
        availableFigures[7] = "SPHERE";
        availableFigures[8] = "TRUNCATED_SPHERE";
        availableFigures[9] = "CYLINDER";
        availableFigures[10] = "CONE";

        String nameOFFigure = scanner.nextLine();

        String figure = null;
        if (nameOFFigure.equals("END")) {
            System.exit(0);
        } else {
            for (int i = 0; i < 11; i++) {
                if (nameOFFigure.equals(availableFigures[i])) {
                    figure = availableFigures[i];
                    break;
                }
            }
        }
        return new Figure();
    }

    public static ArrayList<Point> enteringCoordinates(Scanner scanner) {
        ArrayList<Point> point = new ArrayList<>();

        while (true) {
            String coordinatesOfFigure = scanner.nextLine();
            if (coordinatesOfFigure.equals("STOP_INPUT")) {
                break;
            }

            String[] coordinates = coordinatesOfFigure.split(" ");
            try {
                Integer.parseInt(coordinates[0]);
                Integer.parseInt(coordinates[1]);
                if (coordinates.length == 3) {
                    Integer.parseInt(coordinates[2]);
                }
            } catch (NumberFormatException e) {
                System.out.println("Please, retype");
                continue;
            }

            if (coordinates.length == 2) {
                int coordinateX = Integer.parseInt(coordinates[0]);
                int coordinateY = Integer.parseInt(coordinates[1]);
                point.add(new Point(coordinateX, coordinateY));
            } else if (coordinates.length == 3) {
                int coordinateX = Integer.parseInt(coordinates[0]);
                int coordinateY = Integer.parseInt(coordinates[1]);
                int coordinateZ = Integer.parseInt(coordinates[2]);
                point.add(new Point(coordinateX, coordinateY, coordinateZ));
            }

        }
        return point;
    }

}