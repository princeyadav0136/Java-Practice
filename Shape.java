public abstract class Shape {
    String shapeType;

    Shape(String shapeType) {
        this.shapeType = shapeType;
    }

    public void displayShapeType() {
        System.out.println("Shape Type: " + shapeType);
    }

    // Abstract method (no body)
    public abstract double area();
}
