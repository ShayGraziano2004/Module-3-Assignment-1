public class Circle extends GeometricObject implements Comparable<Circle> {
    private double radius;

    public Circle() {
        // Default constructor
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        this.radius = radius;
        setColor(color);
        setFilled(filled);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public int compareTo(Circle otherCircle) {
        // Compare circles based on their radii
        if (this.radius < otherCircle.getRadius()) {
            return -1;
        } else if (this.radius > otherCircle.getRadius()) {
            return 1;
        } else {
            return 0;
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Circle otherCircle = (Circle) obj;
        return Double.compare(otherCircle.radius, radius) == 0;
    }

    // Draw UML diagram:
    // Circle <|-- GeometricObject : inheritance
    // Circle <|-- Comparable : implementation
}
