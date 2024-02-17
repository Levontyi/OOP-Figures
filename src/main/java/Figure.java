public class Figure {

    public boolean isFigureValid() {
        System.out.println("The figure is figure");
        return true;
    }

    public double countingFigureArea() {
        return 0;
    }

    public double countingFigurePerimeter() {
        return 0;
    }


    public void printArea(double area) {
        if (area == 0) {
            System.out.println("The figure has no area");
        } else {
            System.out.printf("The figure area %.2f%n", area);
        }
    }

    public void printPerimeter(double perimeter) {
        if (perimeter == 0) {
            System.out.println("The figure has no perimeter");
        } else {
            System.out.printf("The figure perimeter %.2f%n", perimeter);
        }
    }

    public double round(double number) {
        return Math.round(number * 100.0) / 100.0;
    }
}
