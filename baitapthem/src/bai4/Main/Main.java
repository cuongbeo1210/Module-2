package bai4.Main;

import bai4.manage.PersonManager;
import bai4.manage.TownManager;
import bai4.model.Person;
import bai4.model.hoDan;

public class Main {
    public static void main(String[] args) {
        PersonManager personManager = new PersonManager();
        TownManager townManager = new TownManager();
        townManager.createHoDan(personManager);
        personManager.displayPerson();
        townManager.displayHoDan();
    }
}
