package InventoryManagement;

import java.util.*;

public class Client {
    public static void main(String[] args) {
        List<Item> items = new ArrayList<Item>();
        items.add(new Electronics("E1", "Laptop", 999.99,5 , 24));
        items.add(new Clothing("C1", "T-Shirt",19.99,  100 ,"M"));
        items.add(new Books("B1", "Java Programming", 59.99,50,  "John Doe"));
        System.out.println("Items List : ");
        for (Item item : items) {
            System.out.println(item.getName());
        }
        //There is no default ordering for custom classes
        //Is it possible to give default ordering : Yes ! How ? Comparable
        //items.get(0).compareTo(items.get(1));{class obj is comparing to passed obj
        Collections.sort(items);// it will natural ordering : comparbale
        Collections.sort(items,new ItemQualityComparator());//comparator sorts based on quality in different class
        System.out.println("Sorted Items List : ");
        for (Item item : items) {
            System.out.println(item.getName());
        }
        //Inventory : Multiple Items
        //General Inventory
        //Clothing Inventory
        //Book Inventory
        Inventory<Electronics> electronicsInventory = new Inventory<>();
        electronicsInventory.add(new Electronics("E1", "Laptop", 68000.55,5 , 24));
        electronicsInventory.add(new Electronics("E2", "ipad", 99900,2 , 24));
        electronicsInventory.add(new Electronics("E3" , "buds" , 2500.56, 5,36));
        Inventory<Clothing> clothingsInventory = new Inventory<>();
        Inventory<Books> booksInventory = new Inventory<>();
        Inventory<Item> itemsInventory = new Inventory<>();

        Item item1 = new Item("1" , "phone", 26000.45,2 );
        Item item2 = new Item("2" , "laptop", 76000.45,2 );
        Item item3 = new Item("3" , "charger", 6000.45,2 );
        Item item4 = new Item("4" , "buds", 2600.45,2 );
        Item item5 = new Item("5" , "books", 260.45,10 );
        Item item6 = new Item("6" , "pens", 100.45,10 );


        RecentlyViewedItems recentItems = new RecentlyViewedItems();
        recentItems.addRecentlyViewedItem(item1);
        recentItems.addRecentlyViewedItem(item3);
        recentItems.addRecentlyViewedItem(item5);

        ArrayList<Item> recentItemsList = new ArrayList<>(recentItems.getAllRecentlyViewedItems());
        System.out.println("Recent Items List : ");
        for (Item item : recentItemsList) {
            System.out.println(item.getName());
        }

    }
}


// 4 1 2 5 3 7 8
// Sort this : 1 2 3 4 5 7 8 : Natural Order

// In which order : count of factors :  1 2 3 5 7 4 8


// Use case : 10 most Recently Viewed Items
// what collection you will prefer ?
// size = 3
// airJordans iphone lego

// delete from one end
// insert at another
// search & delete from between

// LinkedList + Hashmap
// LRU cache : LL + hashmap => LinkedHashMap