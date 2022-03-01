package main.Model;

public class Item {
    private String itemName;
    private int itemPoints;

    public Item(String itemName,  int itemPoints) {
        this.itemName = itemName;
        this.itemPoints = itemPoints;
    }

    //function to buy item
    //parameter : Date, Item Name, Quantity
    public void buyItem(int date, String itemName, int qty){
        //reduce item stock by quantity
        //record the date, item name, and quantity
    }

    //function to update item info
    //parameter : Item Name, Stock, Points
    public void updateItem(String itemName, int itemPoints){
        setItemName(itemName);
        setItemPoints(itemPoints);
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public int getItemPoints() {
        return itemPoints;
    }

    public void setItemPoints(int itemPoints) {
        this.itemPoints = itemPoints;
    }

    @Override
    public String toString() {
        return "main.Model.Carrot{" +
                "itemName='" + itemName + '\'' +
                ", itemPoints=" + itemPoints +
                '}';
    }
}
