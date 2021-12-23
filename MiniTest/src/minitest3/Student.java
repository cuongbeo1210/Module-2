package minitest3;

public class Student extends Person {
    private double mathPoint;
    private double physicPoint;
    private double chemistryPoint;
    private double averagePoint;

    public Student() {

    }

    public Student(double mathPoint, double physicPoint, double chemistryPoint, double averagePoint) {
        this.mathPoint = mathPoint;
        this.physicPoint = physicPoint;
        this.chemistryPoint = chemistryPoint;
        this.averagePoint = averagePoint;
    }

    public Student(int id, String name, int age, double mathPoint, double physicPoint, double chemistryPoint, double averagePoint) {
        super(id, name, age);
        this.mathPoint = mathPoint;
        this.physicPoint = physicPoint;
        this.chemistryPoint = chemistryPoint;
        this.averagePoint = averagePoint;
    }

    public double getAveragePoint() {
        return (getMathPoint() + getPhysicPoint() + getChemistryPoint())/3;
    }

    public void setAveragePoint(double averagePoint) {
        this.averagePoint = averagePoint;
    }

    public Student(double mathPoint, double physicPoint, double chemistryPoint) {
        this.mathPoint = mathPoint;
        this.physicPoint = physicPoint;
        this.chemistryPoint = chemistryPoint;
    }

    public Student(int id, String name, int age, double mathPoint, double physicPoint, double chemistryPoint) {
        super(id, name, age);
        this.mathPoint = mathPoint;
        this.physicPoint = physicPoint;
        this.chemistryPoint = chemistryPoint;
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

    @Override
    public String toString() {
        return "Student{" + super.toString()   +" "+
                "mathPoint=" + mathPoint +
                ", physicPoint=" + physicPoint +
                ", chemistryPoint=" + chemistryPoint +
                ", averagePoint=" + getAveragePoint() +
                '}';
    }
}
