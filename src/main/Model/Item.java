package main.Model;

public class Item {
    String itemName;
    int itemStock;
    int itemPoints;

    public Item(String itemName, int itemStock, int itemPoints) {
        this.itemName = itemName;
        this.itemStock = itemStock;
        this.itemPoints = itemPoints;
    }

    //function to buy item
    //parameter : Date, Item Name, Quantity
    public void buyItem(int date, String itemName, int qty){
        if(this.itemStock > 0 && qty > 0 && qty <=this.itemStock){
            setItemStock(this.itemStock - qty);
            //record somewhere
        } else {
            System.out.println("Item sold out");
        }
        //reduce item stock by quantity
        //record the date, item name, and quantity
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

    @Override
    public String toString() {
        return "main.Model.Carrot{" +
                "itemName='" + itemName + '\'' +
                ", itemStock=" + itemStock +
                ", itemPoints=" + itemPoints +
                '}';
    }
}
