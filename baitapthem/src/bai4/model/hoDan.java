package bai4.model;

import bai4.manage.PersonManager;

public class hoDan {
    private int number;
    private int idHouse;
    private Person person;

    public hoDan(int number, int idHouse, Person person) {
        this.number = number;
        this.idHouse = idHouse;
        this.person = person;
    }

    public hoDan() {
    }

    public hoDan(int number, int idHouse, PersonManager person) {
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getIdHouse() {
        return idHouse;
    }

    public void setIdHouse(int idHouse) {
        this.idHouse = idHouse;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    @Override
    public String toString() {
        return "hoDan{" +
                "number=" + number +
                ", idHouse=" + idHouse +
                ", person=" + person +
                '}';
    }
}
