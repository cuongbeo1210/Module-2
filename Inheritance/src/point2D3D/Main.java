package point2D3D;

public class Main {
    public static void main(String[] args) {
        point2D p2a = new point2D(1, 2);
        System.out.println(p2a);
        point2D p2b = new point2D();
        System.out.println(p2b);
        p2a.setX(3);
        p2a.setY(4);
        System.out.println(p2a);
        System.out.println("x is : "+p2a.getX());
        System.out.println("y is : "+p2a.getY());

        point3D p3a = new point3D(11, 12 ,13);
        System.out.println(p3a);
        point3D p3b = new point3D();
        System.out.println(p3b);
        p3a.setX(21);
        p3a.setY(22);
        p3a.setZ(23);
        System.out.println(p3a);
        System.out.println("x is : "+p3a.getX());
        System.out.println("y is : "+p3a.getY());
        System.out.println("z is : "+p3a.getZ());
    }
}
