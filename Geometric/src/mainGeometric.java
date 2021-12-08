public class mainGeometric {
    public static void main(String[] args) {
        Circle circle = new Circle(3,"xanh",false);
        circle.setFilled(true);
        System.out.println("A circle " + circle);
        System.out.println("The radius is " + circle.getRadius());
        System.out.println("The area is " + circle.getArea());
        System.out.println("The diameter is " + circle.getDiameter());
        System.out.println();
        Rectangle rectangle = new Rectangle(2, 4);
        System.out.println("A rectangle " + rectangle);
        System.out.println("The area is " + rectangle.getArea());
        System.out.println("The perimeter is " + rectangle.getPerimeter());
        System.out.println();
        Triangle triangle =new Triangle(7,8,5,true,"Đỏ");
        System.out.println("A triangle " + triangle);
        System.out.println("The area is " + triangle.getArea());
        System.out.println("The perimeter is " + triangle.getPerimeter());
        System.out.println();
    }
}
