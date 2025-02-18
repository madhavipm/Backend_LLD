package InventoryManagement;

public class Item implements Comparable<Item> {
    private String id;
    private String name;
    private double price;
    private int quantity;
   public Item(String id, String name, double price, int quantity) {
       this.id = id;
       this.name = name;
       this.price = price;
       this.quantity = quantity;
   }

    @Override
    public int compareTo(Item o){
    //this
    //other
    //this object to come before other => return -1
    //other object to come before this => return 1
        if(this.price < o.price){
            return -1;
        }
        else if(this.price > o.price){
            return 1;
        }
        return 0;
    }
    //default ordering rule : the item which has smaller price should come
    // first in the sorted data

    public Item(){

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
// should I make Item class abstract ?

// Item : Clothing , Book ,Electronics
// item which doesn't lie in the category


// default ordering is based on price-comparable
// someone wants to order the items according to the quantity - comparator

// Comparator