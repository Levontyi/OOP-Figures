public class Figure {

    public void checkingIsFigureValid(String typeOfFigure) {
        switch (typeOfFigure) {
            case "Rectangle":
                if (Rectangle.isRectangleValid()) {
                    System.out.println("The figure is valid");
                } else {
                    System.out.println("The figure is invalid");
                }
                break;
            case "Parallelogram":
                if (Parallelogram.isParallelogramValid()) {
                    System.out.println("The figure is valid");
                } else {
                    System.out.println("The figure is invalid");
                }
                break;
            case "Triangle":
                if (Triangle.isTriangleValid()) {
                    System.out.println("The figure is valid");
                } else {
                    System.out.println("The figure is invalid");
                }
                break;
            case "Square":
                if (Square.isSquareValid()) {
                    System.out.println("The figure is valid");
                } else {
                    System.out.println("The figure is invalid");
                }
                break;
            case "Circle":
                if (Circle.isCircleValid()) {
                    System.out.println("The figure is valid");
                } else {
                    System.out.println("The figure is invalid");
                }
                break;
            case "Sphere":
                if (Sphere.isSphereValid()) {
                    System.out.println("The figure is valid");
                } else {
                    System.out.println("The figure is invalid");
                }
                break;
            case "Cone":
                if (Cone.isConeValid()) {
                    System.out.println("The figure is valid");
                } else {
                    System.out.println("The figure is invalid");
                }
                break;
            case "Figure":
                System.out.println("The figure is figure");
                break;
            case "Cylinder":
                if (Cylinder.isCylinderValid()) {
                    System.out.println("The figure is valid");
                } else {
                    System.out.println("The figure is invalid");
                }
                break;
        }
    }

    public void countingAreaOfFigure(String typeOfFigure) {
        switch (typeOfFigure) {
            case "Rectangle":
                System.out.printf("The figure area %.2f", Rectangle.countingOfRectangleArea());
                break;
            case "Parallelogram":
                System.out.printf("The figure area %.2f",Parallelogram.countingParallelogramArea());
                break;
            case "Triangle":
                System.out.printf("The figure area %.2f",Triangle.countingAreaOfTriangle());
                break;
            case "Square":
                System.out.printf("The figure area %.2f",Square.countingAreaOfSquare());
                break;
            case "Circle":
                System.out.printf("The figure area %.2f", Circle.countingCircleArea());
                break;
            case "Sphere":
                System.out.printf("The figure area %.2f", Sphere.countingAreaOfSphere());
                break;
            case "Cone":
                System.out.printf("The figure area %.2f", Cone.countingAreaOfCone());
                break;
            case "Figure":
                System.out.println("The figure has no area");
                break;
        }
    }

    public void countingPerimeterOfFigure(String typeOfFigure) {
        switch (typeOfFigure) {
            case "Rectangle":
                System.out.printf("The figure perimeter %.2f", Rectangle.countingOfRectanglePerimeter());
                break;
            case "Circle":
                System.out.printf("The figure perimeter %.2f", Circle.countingCirclePerimeter());
                break;
            case "Parallelogram":
                System.out.printf("The figure perimeter %.2f", Parallelogram.countingParallelogramPerimeter());
                break;
            case "Square":
                System.out.printf("The figure perimeter %.2f", Square.countingPerimeterOfSquare());
                break;
            case "Triangle":
                System.out.printf("The figure perimeter %.2f", Triangle.countingPerimeterOfTriangle());
                break;
            case "Figure":
                System.out.printf("The figure has no perimeter");
                break;
        }
    }
}
