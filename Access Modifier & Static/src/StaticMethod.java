public class StaticMethod {
    public static void main(String[] args) {
        Student.change();

        Student s1 = new Student(111, "Cuong");
        Student s2 = new Student(222, "Dep");
        Student s3 = new Student(333, "Trai");

        s1.display();
        s2.display();
        s3.display();
    }
}