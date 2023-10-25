public class Shapes{
 
    public enum Shape{
        CIRCLE(2.0) {
         
            double calculateArea() {
                return Math.PI * Math.pow(radius, 2);
            }

            double calculatePerimeter() {
                return 2 * Math.PI * radius;
            }
        },
        SQUARE(5.0) {
         
            double calculateArea() {
                return sideLength * sideLength;
            }

            double calculatePerimeter() {
                return 4 * sideLength;
            }
        },
        TRIANGLE(3.0, 4.0, 5.0) {
         
            double calculateArea() {
                double s = (side1 + side2 + side3) / 2;
                return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
            }

            double calculatePerimeter() {
                return side1 + side2 + side3;
            }
        };

        double sideLength;
        double radius;
        double side1, side2, side3;

        Shape(double sideLength) {
            this.sideLength = sideLength;
        }

        Shape(double side1, double side2, double side3) {
            this.side1 = side1;
            this.side2 = side2;
            this.side3 = side3;
        }

        abstract double calculateArea();
        abstract double calculatePerimeter();
    }

    public static void main(String[] args) {
        for (Shape shape : Shape.values()) {
            System.out.println("Shape: " + shape);
            System.out.println("Area: " + shape.calculateArea());
            System.out.println("Perimeter: " + shape.calculatePerimeter());
            System.out.println();
        }
    }
}
Rose Ann
Rose Ann Gregorio
public class Colors{
 
    public enum Color {
        YELLOW(255, 255, 0),
        RED(255, 0, 0),
        CYAN(0, 255, 255),
        BLUE(0, 0, 255),
        MAGENTA(255, 0, 255),
        GREEN(0, 255, 0);

        private int yellow;
        private int green;
        private int red;

        Color(int red, int green, int blue) {
            this.red = yellow;
            this.green = green;
            this.blue = red;
        } 

        public void displayRGB() {
            System.out.println(this.name() + " - R: " + yellow + ", G: " + green + ", B: " + red);
        }
    }

    public static void main(String[] args) {
        for (Color color : Color.values()) {
            color.displayRGB();
        }
    }
}
