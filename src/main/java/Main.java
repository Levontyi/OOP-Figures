import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static String chosenFigure = null;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        enteringFigure(scanner);
        ArrayList<Point> points = enteringCoordinates(scanner);
        creatingFigure(chosenFigure, points);

        Figure.checkingIsFigureValid(chosenFigure);
        Figure.countingAreaOfFigure(chosenFigure);
        Figure.countingPerimeterOfFigure(chosenFigure);

    }

    public static void enteringFigure(Scanner scanner) {

        NameOfFigures nameOfFigures;

        String nameOfFigure = scanner.nextLine();
        nameOfFigures = NameOfFigures.valueOf(nameOfFigure);
        if (nameOfFigure.equals("END")) {
            System.exit(0);
        } else {
            switch (nameOfFigures) {
                case CONE:
                    chosenFigure = "CONE";
                    break;
                case CIRCLE:
                    chosenFigure = "CIRCLE";
                    break;
                case SPHERE:
                    chosenFigure = "SPHERE";
                    break;
                case SQUARE:
                    chosenFigure = "SQUARE";
                    break;
                case CYLINDER:
                    chosenFigure = "CYLINDER";
                    break;
                case TRIANGLE:
                    chosenFigure = "TRIANGLE";
                    break;
                case RECTANGLE:
                    chosenFigure = "RECTANGLE";
                    break;
                case FIGURE:
                    chosenFigure = "FIGURE";
                    break;
                case PARALLELOGRAM:
                    chosenFigure = "PARALLELOGRAM";
                    break;
                case TRUNCATED_SPHERE:
                    chosenFigure = "TRUNCATED_SPHERE";
                    break;
                case POLYGON:
                    chosenFigure = "POLYGON";
                    break;
            }

        }
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

            int coordinateX = Integer.parseInt(coordinates[0]);
            int coordinateY = Integer.parseInt(coordinates[1]);

            if (coordinates.length == 2) {
                point.add(new Point(coordinateX, coordinateY));
            } else if (coordinates.length == 3) {
                int coordinateZ = Integer.parseInt(coordinates[2]);
                point.add(new Point(coordinateX, coordinateY, coordinateZ));
            }

        }

        return point;
    }

    public static void creatingFigure(String nameOfFigure, ArrayList<Point> points) {
        NameOfFigures nameOfFigures = NameOfFigures.valueOf(nameOfFigure);
        for (int i = 0; i < points.size(); i++) {
            switch (nameOfFigures) {
                case CONE:
                    new Cone(points);
                    break;
                case CIRCLE:
                    new Circle(points);
                    break;
                case SPHERE:
                    new Sphere(points);
                    break;
                case SQUARE:
                    new Square(points);
                    break;
                case CYLINDER:
                    new Cylinder(points);
                    break;
                case TRIANGLE:
                    new Triangle(points);
                    break;
                case RECTANGLE:
                    new Rectangle(points);
                    break;
                case PARALLELOGRAM:
                    new Parallelogram(points);
                    break;
                case TRUNCATED_SPHERE:
                    new TruncatedSphere(points);
                    break;
            }
        }
    }
}