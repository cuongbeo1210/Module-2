package minitest4;

public class Student extends Person {
    private double mathPoint;
    private double physicPoint;
    private double chemistryPoint;
    private double averagePoint;

    public void setAveragePoint(double a, double b, double c) {
        this.averagePoint = (a + b + c) / 3;
    }

    public Student(String name, int age, double mathPoint, double physicPoint, double chemistryPoint) {
        super(name, age);
        this.mathPoint = mathPoint;
        this.physicPoint = physicPoint;
        this.chemistryPoint = chemistryPoint;
        this.averagePoint = (mathPoint + physicPoint + chemistryPoint) / 3;
    }

    public Student(double mathPoint, double physicPoint, double chemistryPoint) {
        this.mathPoint = mathPoint;
        this.physicPoint = physicPoint;
        this.chemistryPoint = chemistryPoint;
        this.averagePoint = (mathPoint + physicPoint + chemistryPoint) / 3;
    }

    public double getMathPoint() {
        return mathPoint;
    }

    public void setMathPoint(double mathPoint) {
        this.mathPoint = mathPoint;
    }

    public double getPhysicPoint() {
        return physicPoint;
    }

    public void setPhysicPoint(double physicPoint) {
        this.physicPoint = physicPoint;
    }

    public double getChemistryPoint() {
        return chemistryPoint;
    }

    public void setChemistryPoint(double chemistryPoint) {
        this.chemistryPoint = chemistryPoint;
    }

    public double getAveragePoint() {
        return (getMathPoint() + getPhysicPoint() + getChemistryPoint()) / 3;
    }


    @Override
    public String toString() {
        return "Student{ " + super.toString() + " " +
                "mathPoint=" + mathPoint +
                ", physicPoint=" + physicPoint +
                ", chemistryPoint=" + chemistryPoint +
                ", averagePoint=" + averagePoint +
                '}';
    }
}
