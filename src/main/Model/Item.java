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
        return  "================================\n" +
                "Item\t\t" + "Stock\t\t" + "Points" + "\n" +
                "================================\n" +
                String.format("%s%10d%10d", itemName, itemStock, itemPoints);
    }
}
