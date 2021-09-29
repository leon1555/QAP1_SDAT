package qap1;

public class Rectangle {
    private float length;
    private float width;

    public Rectangle() {
        length = 4;
        width = 3;
    }

    public Rectangle(float length, float width) {
        this.length = length;
        this.width = width;
    }

    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public float getArea() {
        float area = length * width;
        return area;
    }

    public float getPerimeter() {
        float perimeter = (length * 2) + (width * 2);
        return perimeter;
    }

    public String toString() {
        return "Rectangle[length=" + length + " width=" + width + "]";
    }
}
