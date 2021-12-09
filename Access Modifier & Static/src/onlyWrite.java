import java.util.Scanner;

public class onlyWrite {
    private String name = "Cuong";
    private String Class = "C1021H1";

    public onlyWrite() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setClass(String aClass) {
        this.Class = aClass;
    }

    @Override
    public String toString() {
        return "onlyWrite{" +
                "name='" + name + '\'' +
                ", Class='" + Class + '\'' +
                '}';
    }

    public static void main(String[] args) {
        onlyWrite ow = new onlyWrite();
        onlyWrite ow1 = new onlyWrite();
        System.out.println(ow);
        ow.setName("Beo");
        ow.setClass("CO2");
        System.out.println(ow);
        Input(ow1);
        System.out.println(ow1);
    }
    public static void Input(onlyWrite ow){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name : ");
        ow.setName(scanner.nextLine());
        System.out.print("Enter your class : ");
        ow.setClass(scanner.nextLine());
    }
}
