package ClassAndObject;

public class Circle {
    private double radius;
    private String color;
    public Circle() {
        this.radius = 1.0;
        this.color = "red";
    }

    public Circle(double radius) {
        this.radius = radius;
        this.color = "red";
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }
    // get param radius
    public void setRadius(int radius) {
        this.radius = radius;
    }
    //set param radius


    public String getColor() {
        return color;
    }
    //get param color


    public void setColor(String color) {
        this.color = color;
    }
    //set param color

    public double getArea(double radius) {
        double area = Math.pow(radius,2)*Math.PI;
        return area;
    }

    public String toString() {
        return "Radius: " + getRadius() + " " + "Color: " + getColor();

    }

//    public static void main(String []args) {
//        Circle c = new Circle(2, "green");
//        double area = c.getArea(c.radius);
//        System.out.println(area);
//    }

}
