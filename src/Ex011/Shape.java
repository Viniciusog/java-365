package Ex011;

public abstract class Shape {

    private Color color;

    public Shape() {

    }

    public Shape(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    // quem herdar a classe Shape será obrigado a implementar a função area()
    protected abstract double area();
}
