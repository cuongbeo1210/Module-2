package circleCylinder;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Input(new Circle());
        System.out.println(new Circle());
    }
    public static void Input(Circle circle){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Color : ");
        circle.setColor(scanner.nextLine());
        System.out.print("Enter Radius : ");
        circle.setRadius(scanner.nextDouble());

    }
}

