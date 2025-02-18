package InventoryManagement;

import java.util.Comparator;

public class ItemQualityComparator implements Comparator<Item> {
    @Override
    public int compare(Item o1, Item o2) {
        if(o1.getQuantity() < o2.getQuantity()){
            return -1;
        }
        else if(o1.getQuantity() > o2.getQuantity()){
            return 1;
        }
        return 0;
    }
}
