package main.Model;

import java.util.ArrayList;
import java.util.List;

public class Inventory {
    private List<Item> inventory = new ArrayList<>();

    public Inventory(List<Item> inventory) {
        this.inventory = inventory;
    }
}
