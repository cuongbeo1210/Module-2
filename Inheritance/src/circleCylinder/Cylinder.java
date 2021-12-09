package circleCylinder;

public class Cylinder extends Circle {
    private double height;

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume() {
        return super.getArea()*getHeight();
    }

    public double getArea() {
        return 2*Math.PI*getRadius()*getHeight()+ 2*super.getArea();
    }

    @Override
    public String toString() {
        return "Cylinder{"+super.toString()  + "  "+
                "height=" + height +
                '}';
    }
}
