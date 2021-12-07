public class FirstDegreeEquation {
    double b, c;

    public FirstDegreeEquation(double num1, double num2) {
        this.b = num1;
        this.c = num2;
    }

    public double getRoot() {
        return - this.c / this.b;
    }
}
