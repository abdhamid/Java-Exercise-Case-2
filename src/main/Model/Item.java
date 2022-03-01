package main.Model;

public class Item {
    String itemName;
    int itemStock;
    int itemPoints;
    int itemSold;

    public Item(String itemName, int itemStock, int itemPoints) {
        this.itemName = itemName;
        this.itemStock = itemStock;
        this.itemPoints = itemPoints;
    }

    //function to update item info
    //parameter : Item Name, Stock, Points
    public void updateItem(String itemName, int itemStock, int itemPoints){
        setItemName(itemName);
        setItemStock(itemStock);
        setItemPoints(itemPoints);
    }

    //function to show history of item sales
    //
    public void showItemSalesHistory(){}

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public int getItemStock() {
        return itemStock;
    }

    public void setItemStock(int itemStock) {
        this.itemStock = itemStock;
    }

    public int getItemPoints() {
        return itemPoints;
    }

    public void setItemPoints(int itemPoints) {
        this.itemPoints = itemPoints;
    }

    public int getItemSold() {
        return itemSold;
    }

    public void setItemSold(int itemSold) {
        this.itemSold = itemSold;
    }


    @Override
    public String toString() {
        return "main.Model.Carrot{" +
                "itemName='" + itemName + '\'' +
                ", itemStock=" + itemStock +
                ", itemPoints=" + itemPoints +
                '}';
    }
}
