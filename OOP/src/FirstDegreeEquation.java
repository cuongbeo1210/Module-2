public class FirstDegreeEquation {
    double B, C;
    public FirstDegreeEquation(double num1, double num2){
        this.B = num1;
        this.C = num2;
    }

    public double getRoot() {
        return -this.C/ this.B;
    }
}
