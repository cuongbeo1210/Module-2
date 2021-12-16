package minitest2;

public class Person {
    private int id;
    private String name;
    private int age;
    private static int ID = 1;

    public Person(String name, int age) {
        this.id = ID++;
        this.name = name;
        this.age = age;
    }

    public Person() {
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static int getID() {
        return ID;
    }

    public static void setID(int ID) {
        Person.ID = ID;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
