package InventoryManagement;

import java.util.LinkedList;
import java.util.List;

public class RecentlyViewedItems {
    private  LinkedList<Item> recentlyViewedItems;
    private final int max_size = 3;
    public RecentlyViewedItems() {
      recentlyViewedItems = new LinkedList<>();
    }
    public void addRecentlyViewedItem(Item item) {
        recentlyViewedItems.remove(item);
        recentlyViewedItems.add(item);
        if(recentlyViewedItems.size() > max_size) {
            recentlyViewedItems.removeFirst();
        }
    }
    public List<Item> getAllRecentlyViewedItems() {
        return recentlyViewedItems;
    }


}




