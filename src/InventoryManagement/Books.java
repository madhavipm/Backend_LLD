package InventoryManagement;

public class Books extends Item{
    private String author;
    public Books(String id, String  name, double price, int quantity, String author) {
        super(id, name, price, quantity);
        this.author = author;
    }
    public Books(){

    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
