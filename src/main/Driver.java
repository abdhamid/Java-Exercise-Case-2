package main;

import main.Model.Item;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Driver {
    static void menu() {
        System.out.println("1 - Add Item");
        System.out.println("2 - Update Item");
        System.out.println("3 - Display Items");
        System.out.println("0 - Exit Program");
    }

    public static void main(String[] args) {
        List<Item> inventory = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int pointer; //For navigating the menu

        do {
            menu();
            pointer = scanner.nextInt();
            switch (pointer) {
                case 1 -> {
                    System.out.println("Enter item Name :");
                    String name = scanner.next();
                    System.out.println("Enter item stock :");
                    int itemStock  = scanner.nextInt();
                    System.out.println("Enter item points");
                    int itemPoint = scanner.nextInt();
                    addItem(inventory, name, itemStock,itemPoint);
//                    addItem(inventory, "Phone", 100,10);
                    System.out.println("Item Added");
                }
                case 2 -> {
                    System.out.println("Enter item name :");
                    String name = scanner.next();
                    System.out.println("Enter new item stock :");
                    int itemStock  = scanner.nextInt();
                    System.out.println("Enter new item points");
                    int itemPoint = scanner.nextInt();
                    updateItem(inventory, name, itemStock,itemPoint);
//                    updateItem(inventory, "Phone", 50,30);
//                    System.out.println("Item Added");
                }
                case 3 -> displayItems(inventory);

            }
        } while (pointer != 0);

    }

    public static void addItem(List<Item> inventory, String itemName, int itemStock, int itemPoint){
        inventory.add(new Item(itemName, itemStock, itemPoint));
    }

    public static void displayItems(List<Item> inventory){
        for (Item item: inventory) {
            System.out.println(item);
        }
    }

    public static void updateItem(List<Item> inventory, String itemName, int itemStock, int itemPoint){
        for(Item item : inventory){
            if(itemName.equals(item.getItemName())){
                System.out.println("Item name   : " + item.getItemName());
//                item.setItemName(itemName);
                System.out.println("Stock Changed   : " + item.getItemStock() +"    =>  " + itemStock);
                item.setItemStock(itemStock);
                System.out.println("Points Changed  : " + item.getItemPoints() +"   =>  " + itemPoint);
                item.setItemPoints(itemPoint);
//                System.out.println(item);
            } else {
                System.out.println("Item not found");
            }
        }
    }

//    public static void manageItem(String itemName){
//
//    }

    public static void showItemList(){}

    public static void showItemSold(){}


}
