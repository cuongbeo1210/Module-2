public class Circle extends geometric {
    private double radius;

    public Circle(double radius, String color, boolean filled){
        this.radius = radius;
        setColor(color);
        setFilled(filled);
    }

    public double getRadius(){
        return radius;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }

    public double getArea(){
        return radius * radius * Math.PI;
    }

    public double getDiameter(){
        return 2 * radius;
    }

    public double Perimeter(){
        return 2 * radius * Math.PI;
    }

    public void printCircle(){
        System.out.println("The circle is created " +
                " and the radius is " + radius );
    }
}