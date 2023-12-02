public class Figure {

    public static boolean checkingIsFigureValid(String typeOfFigure) {
        NameOfFigures nameOfFigures = NameOfFigures.valueOf(typeOfFigure);
        switch (nameOfFigures) {
            case RECTANGLE:
                if (Rectangle.isRectangleValid()) {
                    System.out.println("The figure is valid");
                    return true;
                } else {
                    System.out.println("The figure is invalid");
                }
                break;
            case PARALLELOGRAM:
                if (Parallelogram.isParallelogramValid()) {
                    System.out.println("The figure is valid");
                    return true;
                } else {
                    System.out.println("The figure is invalid");
                }
                break;
            case TRIANGLE:
                if (Triangle.isTriangleValid()) {
                    System.out.println("The figure is valid");
                    return true;
                } else {
                    System.out.println("The figure is invalid");
                }
                break;
            case SQUARE:
                if (Square.isSquareValid()) {
                    System.out.println("The figure is valid");
                    return true;
                } else {
                    System.out.println("The figure is invalid");
                }
                break;
            case CIRCLE:
                if (Circle.isCircleValid()) {
                    System.out.println("The figure is valid");
                    return true;
                } else {
                    System.out.println("The figure is invalid");
                }
                break;
            case SPHERE:
                if (Sphere.isSphereValid()) {
                    System.out.println("The figure is valid");
                    return true;
                } else {
                    System.out.println("The figure is invalid");
                }
                break;
            case CONE:
                if (Cone.isConeValid()) {
                    System.out.println("The figure is valid");
                    return true;
                } else {
                    System.out.println("The figure is invalid");
                }
                break;
            case FIGURE:
                System.out.println("The figure is figure");
                return true;
            case CYLINDER:
                if (Cylinder.isCylinderValid()) {
                    System.out.println("The figure is valid");
                    return true;
                } else {
                    System.out.println("The figure is invalid");
                }
                break;
            case TRUNCATED_SPHERE:
                if (TruncatedSphere.isTruncatedSphereValid()) {
                    System.out.println("The figure is valid");
                    return true;
                } else {
                    System.out.println("The figure is invalid");
                }
                break;
        }
        return false;
    }

    public static void countingAreaOfFigure(String typeOfFigure) {
        NameOfFigures nameOfFigures = NameOfFigures.valueOf(typeOfFigure);
        switch (nameOfFigures) {
            case RECTANGLE:
                System.out.printf("The figure area %.2f", Rectangle.countingOfRectangleArea());
                break;
            case PARALLELOGRAM:
                System.out.printf("The figure area %.2f", Parallelogram.countingParallelogramArea());
                break;
            case TRIANGLE:
                System.out.printf("The figure area %.2f", Triangle.countingAreaOfTriangle());
                break;
            case SQUARE:
                System.out.printf("The figure area %.2f", Square.countingAreaOfSquare());
                break;
            case CIRCLE:
                System.out.printf("The figure area %.2f", Circle.countingCircleArea());
                break;
            case SPHERE:
                System.out.printf("The figure area %.2f", Sphere.countingAreaOfSphere());
                break;
            case CONE:
                System.out.printf("The figure area %.2f", Cone.countingAreaOfCone());
                break;
            case FIGURE:
                System.out.println("The figure has no area");
                break;
            case TRUNCATED_SPHERE:
                System.out.printf("The figure area %.2f", TruncatedSphere.countingTruncatedSphereArea());
                break;
            case CYLINDER:
                System.out.printf("The figure area %.2f", Cylinder.countingCylinderArea());
                break;
            case POLYGON:
                System.out.printf("The figure area %.2f", Polygon.countingAreaOfPolygon());
                break;
        }
        System.out.println("");
    }

    public static void countingPerimeterOfFigure(String typeOfFigure) {
        NameOfFigures nameOfFigures = NameOfFigures.valueOf(typeOfFigure);
        switch (nameOfFigures) {
            case RECTANGLE:
                System.out.printf("The figure perimeter %.2f", Rectangle.countingOfRectanglePerimeter());
                break;
            case CIRCLE:
                System.out.printf("The figure perimeter %.2f", Circle.countingCirclePerimeter());
                break;
            case PARALLELOGRAM:
                System.out.printf("The figure perimeter %.2f", Parallelogram.countingParallelogramPerimeter());
                break;
            case SQUARE:
                System.out.printf("The figure perimeter %.2f", Square.countingPerimeterOfSquare());
                break;
            case TRIANGLE:
                System.out.printf("The figure perimeter %.2f", Triangle.countingPerimeterOfTriangle());
                break;
            case FIGURE:
                System.out.printf("The figure has no perimeter");
                break;
        }
    }
}
