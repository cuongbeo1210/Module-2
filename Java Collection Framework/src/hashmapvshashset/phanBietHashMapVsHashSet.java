package hashmapvshashset;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class phanBietHashMapVsHashSet {
    public static void main(String[] args) {
        Student student1 = new Student("Cuong", 23, "Hà Nội");
        Student student2 = new Student("Be000o", 25, "Hà Nội");
        Student student3 = new Student("Dz", 24, "Hà Nội");
        Student student4 = new Student("Hell", 23, "Hà Nội");
        Student student5 = new Student("Hell", 23, "Hà Nội");
        Map<Integer, Student> studentMap = new HashMap<>();
        studentMap.put(1, student1);
        studentMap.put(2, student2);
        studentMap.put(3, student3);
        studentMap.put(4, student1);

        for (Map.Entry<Integer, Student> student : studentMap.entrySet()){
            System.out.println(student);
        }

        System.out.println("...........Set");
        Set<Student> students = new HashSet<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);

        for (Student student : students){
            System.out.println(student);
        }
    }
}
