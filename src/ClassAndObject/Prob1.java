package ClassAndObject;

public class Prob1 {
    private double radius;
    private String color;
    public Prob1 () {
        this.radius = 1.0;
        this.color = "red";
    }

    public Prob1(double radius) {
        this.radius = radius;
    }

    public Prob1(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }
}
