package bai4.model;

import java.time.LocalDate;

public class Person {
    private String name;
    private LocalDate birthDate;
    private String job;

    public Person(String name, LocalDate birthDate, String job) {
        this.name = name;
        this.birthDate = birthDate;
        this.job = job;
    }

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", birthDate=" + birthDate +
                ", job='" + job + '\'' +
                '}';
    }
}
