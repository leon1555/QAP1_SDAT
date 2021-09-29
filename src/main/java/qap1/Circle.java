package qap1;
// The Circle class models a circle with a radius and color.

public class Circle {
    // private instance variable, not accessible from outside this class
    private double radius;
    private String colour;
    private static final double pi = 3.14;

    // The default constructor with no argument.
    // It sets the radius and colour to their default value.
    public Circle() {
        radius = 1.0;
        colour = "red";
    }

    // 2nd constructor with given radius, but colour default
    public Circle(double radius) {
        this.radius = radius;
        colour = "red";
    }

    // 3rd constructor with given radius and given colour
    public Circle(double radius, String colour) {
        this.radius = radius;
        this.colour = colour;
    }

    // A public method for retrieving the radius
    public double getRadius() {
        return radius;
    }

    // A public method for computing the area of circle
    public double getArea() {
        return radius * radius * pi;
    }

    // A public method for retrieving the colour
    public String getColour() {
        return colour;
    }

    // A public method for changing the radius
    public void setRadius(double radius) {
        this.radius = radius;
    }

    // A public method for changing the colour
    public void setColour(String colour) {
        this.colour = colour;
    }

    // Return a description of this instance in the form of Circle[radius=r,color=c]
    public String toString() {
        return "Circle[radius=" + radius + " colour=" + colour + "]";
    }
}
