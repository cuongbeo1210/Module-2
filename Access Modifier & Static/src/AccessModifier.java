public class AccessModifier {
    private double Radius = 1.0;
    private final String Color = "Red";

    public AccessModifier() {
    }

    public AccessModifier(double radius) {
        this.Radius = radius;
    }

    public double getRadius() {
        return this.Radius;
    }

    public double getArea(){
     return (Math.PI*Math.pow(getRadius(), 2));
    }

    @Override
    public String toString() {
        return "AccessModifier{" +
                "Radius=" + Radius +
                ", Color='" + Color + '\'' + "Area : "+getArea()+
                '}';
    }
    public static void main(String[] args) {

        System.out.println(new  AccessModifier());
    }
}

