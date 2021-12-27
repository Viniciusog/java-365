package Ex011;

public class Rectangle extends Shape {

    private Double height;
    private Double width;

    public Rectangle() {
        super();
    }

    public Rectangle(Color color, Double height, Double width) {
        super(color);
        this.height = height;
        this.width = width;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public Double getWidth() {
        return width;
    }

    public void setWidth(Double width) {
        this.width = width;
    }

    @Override
    protected double area() {
        return this.height * this.width;
    }
}