package bai4.manage;

import bai4.model.hoDan;

import java.util.ArrayList;
import java.util.Scanner;

public class TownManager {
    ArrayList<hoDan> people1 = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public ArrayList<hoDan> createHoDan(PersonManager person) {
        System.out.print("Nhập số người trong gia đình : ");
        int number = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập mã hộ dân : ");
        int idHouse = Integer.parseInt(scanner.nextLine());
        person.createPerson(number);
        hoDan hodan = new hoDan(number, idHouse, person);
        people1.add(hodan);
        return people1;
    }
    public void displayHoDan(){
        for(hoDan hodan : people1){
            System.out.println("Hộ dân "+hodan.getIdHouse()+" có "+hodan.getNumber()+" thành viên");
        }
    }

}
