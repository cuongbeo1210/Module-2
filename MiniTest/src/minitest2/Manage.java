package minitest2;

import java.util.ArrayList;

public interface Manage {
    ArrayList<Person> person = new ArrayList<>();
    void addPerson(ArrayList<Person> people);
    void displayPerson(ArrayList<Person> people);
    void findIndexPerson(ArrayList<Person> people);
    void deletePerson(ArrayList<Person> people);
    void editPerson(ArrayList<Person> people);
    void sortAveragePoints();
    double sumAveragePoints();
}
