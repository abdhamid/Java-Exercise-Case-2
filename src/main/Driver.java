package main;

import main.Model.Item;

import java.util.ArrayList;
import java.util.List;

public class Driver {

    public static void main(String[] args) {
        List<Item> inventory = new ArrayList<>();

        inventory.add(new Item("Book", 10, 10));
        inventory.add(new Item("Phone", 10, 100));

    }
    public static void buyItem(){}

    public static void updateItem(){}

    public static void manageItem(){}

    public static void showItemList(){
        System.out.println();
    }


}
