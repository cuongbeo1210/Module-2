import java.text.DecimalFormat;
import java.util.Arrays;

public class Students {
    private String name = "Béo";
    private int age = 19;
    private String sex = "male";
    private String address = "KS-NB";
    private double pointMath = 8.85;
    private double pointLiterature = 7.5;
    private double pointEnglish = 10;

    public Students() {
    }

    public Students(String name, int age, String sex, String address, double pointMath, double pointLiterature, double pointEnglish) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.address = address;
        this.pointMath = pointMath;
        this.pointLiterature = pointLiterature;
        this.pointEnglish = pointEnglish;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPointMath(double pointMath) {
        this.pointMath = pointMath;
    }

    public void setPointLiterature(double pointLiterature) {
        this.pointLiterature = pointLiterature;
    }

    public void setPointEnglish(double pointEnglish) {
        this.pointEnglish = pointEnglish;
    }

    public double Avg() {
        return Math.round((this.pointMath + this.pointLiterature + this.pointEnglish) / 3);
    }


    @Override
    public String toString() {
        return "Students{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", address='" + address + '\'' +
                ", pointMath=" + pointMath +
                ", pointLiterature=" + pointLiterature +
                ", Avg=" + Avg() +
                '}';
    }

    public static void main(String[] args) {
        Students[] obj = new Students[3];
        Students sdu1 = new Students();
        Students sdu2 = new Students("Cuong", 18, "male", "HN", 10, 10, 11);
        Students sdu3 = new Students("Em Yeu", 17, "female", "NA", 11, 11, 11);
//        Students[] students;
        obj[0] = sdu1;
        obj[1] = sdu2;
        obj[2] = sdu3;

//        for (Students x : obj) {
//            System.out.println("Name : " + x.name + "\n" + "Điểm trung bình : " + x.Avg() + "\n");
//        }
        for (int i = 0; i < obj.length - 1; i++) {
            if (obj[i].Avg() > obj[i+1].Avg()){
                for (int j = i + 1; j < obj.length; j++) {
                    Students temp = obj[i];
                    obj[i] = obj[j];
                    obj[j] = temp;
                }

            }
        }
        for (Students x : obj) {
            System.out.println("Name : " + x.name + "\n" + "Điểm trung bình : " + x.Avg() + "\n");
        }
    }


}

