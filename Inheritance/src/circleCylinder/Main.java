package circleCylinder;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle();
        Input(circle);
        System.out.println(circle);
        Cylinder cylinder = new Cylinder(3,"Red", 4);
        System.out.println(cylinder);
    }
    public static void Input(Circle circle){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Color : ");
        circle.setColor(scanner.nextLine());
        System.out.print("Enter Radius : ");
        circle.setRadius(scanner.nextDouble());
    }
}

