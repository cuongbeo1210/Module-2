public class Triangle extends geometric{
    private double edge1;
    private double edge2;
    private double edge3;

    public Triangle(double edge1, double edge2, double edge3){
        this.edge1 = edge1;
        this.edge2 = edge2;
        this.edge3 = edge3;
    }

    public Triangle(double edge1, double edge2, double edge3,boolean filled, String color){
        this.edge1 = edge1;
        this.edge2 = edge2;
        this.edge3 = edge3;
        setFilled(filled);
        setColor(color);
    }

    public double getEdge1() {
        return edge1;
    }

    public void setEdge1(double edge1) {
        this.edge1 = edge1;
    }

    public double getEdge2() {
        return edge2;
    }

    public void setEdge2(double edge2) {
        this.edge2 = edge2;
    }

    public double getEdge3() {
        return edge3;
    }

    public void setEdge3(double edge3) {
        this.edge3 = edge3;
    }

    public double getPerimeter(){
        return edge1+ edge2+ edge3;
    }

    public double heightEdge1(){
        return (2*Math.sqrt((getPerimeter()/2)*((getPerimeter()/2)-this.edge1)*((getPerimeter()/2)-this.edge2)*((getPerimeter()/2)-this.edge3))/this.edge1);
    }

    public double getArea(){
        return 0.5*(heightEdge1()*this.edge1);
    }
}