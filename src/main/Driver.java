package main;

import main.Model.Item;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Driver {

    public static void main(String[] args) {
        List<Item> inventory = new ArrayList<>();

        inventory.add(new Item("Book", 10, 10));
        inventory.add(new Item("Phone", 10, 100));

        showItemSold(inventory,"Phone");
        buyItem(inventory, "Phone", 1, 200);
        showItemSold(inventory,"Phone");
    }


    public static void showItemSold(List<Item> inventory, String itemName){
        for(Item item : inventory){
            if (itemName == item.getItemName())
                System.out.println("Sold Quantity of " + itemName + " = " + item.getItemSold());
        }
    }

    //function to buy item
    //parameter : Item Name, Quantity, User Points
    public static void buyItem(List<Item> inventory, String itemName, int qty, int userPoints){
        for (Item item : inventory){
            if (itemName == item.getItemName()){
                if(item.getItemStock() > 0 && qty > 0 && qty <=item.getItemStock()){
                    if (userPoints >= qty * item.getItemPoints()){
                        item.setItemSold(qty);
                        item.setItemStock(item.getItemStock() - qty);
                        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
                        LocalDateTime now = LocalDateTime.now();
                        if (qty > 1)
                            System.out.println(qty + " " + item.getItemName() + "s have been purchased [" + dtf.format(now) + "]");
                        else
                            System.out.println(qty + " " + item.getItemName() +  " has been purchased [" + dtf.format(now) + "]");
                    } else {
                        System.out.println("Not enough points");
                    }
                } else {
                    System.out.println("Item is sold out");
                }
            }
        }
    }

    public static void updateItem(){}

    public static void manageItem(){}

    public static void showItemList(){
        System.out.println();
    }


}
