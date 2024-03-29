import constants.Constants;
import enums.NameOfFigures;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = inputCommand(scanner);
        if (command.equals("END")) {
            System.out.println("Input is finished");
        } else {
            ArrayList<Point> points = inputCoordinates(scanner);
            Figure figure = createFigure(command, points);

            if (figure.isFigureValid()) {
                figure.printArea(figure.countingFigureArea());
                figure.printPerimeter(figure.countingFigurePerimeter());
            } else {
                System.out.println("Invalid figure");
            }
        }
    }

    public static boolean isValidFigure(String command) {
        for (NameOfFigures type : NameOfFigures.values()) {
            if (type.name().equals(command)) {
                return true;
            }
        }
        return false;
    }

    public static String inputCommand(Scanner scanner) {
        System.out.println("Enter figure type: ");
        String inputLine = scanner.nextLine();
        if (inputLine.equals("END")) {
            return inputLine;
        }
        while (!isValidFigure(inputLine)) {
            System.out.println("Please, retype");
            inputLine = scanner.nextLine();
        }
        return inputLine;
    }

    public static Figure createFigure(String command, ArrayList<Point> points) {
        NameOfFigures typeOfFigure = NameOfFigures.valueOf(command);
        return switch (typeOfFigure) {
            case CIRCLE -> new Circle(points);
            case SQUARE -> new Square(points);
            case RECTANGLE -> new Rectangle(points);
            case PARALLELOGRAM -> new Parallelogram(points);
            case TRIANGLE -> new Triangle(points);
            case POLYGON -> new Polygon(points);
            case SPHERE -> new Sphere(points);
            case TRUNCATED_SPHERE -> new TruncatedSphere(points);
            case CYLINDER -> new Cylinder(points);
            case CONE -> new Cone(points);
            default -> new Figure();
        };
    }

    public static ArrayList<Point> inputCoordinates(Scanner scanner) {
        ArrayList<Point> points = new ArrayList<>();
        System.out.println("Enter points for figure: ");

        while (true) {
            try {
                String[] coordinates = scanner.nextLine().split(" ");
                if (coordinates.length == Constants.TWO_COORDINATES) {
                    int x = Integer.parseInt(coordinates[0]);
                    int y = Integer.parseInt(coordinates[1]);
                    points.add(new Point(x, y));
                } else if (coordinates.length == Constants.THREE_COORDINATES) {
                    int x = Integer.parseInt(coordinates[0]);
                    int y = Integer.parseInt(coordinates[1]);
                    int z = Integer.parseInt(coordinates[2]);
                    points.add(new Point(x, y, z));
                } else if (coordinates[0].equals("STOP_INPUT")) {
                    break;
                } else {
                    throw new NumberFormatException();
                }
            } catch (NumberFormatException e) {
                System.out.println("Please, retype");
            }
        }
        return points;
    }
}