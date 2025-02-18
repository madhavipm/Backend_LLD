package InventoryManagement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Inventory<T extends Item> extends Item{
    //we need to store the items
    //we can store in basic list but we are not storing
    //bcz in task it is mentioned for fast lookup hence using hashmap -fastlook ups - o(1)
    private HashMap<String,T>  items;
    public Inventory(){
            items = new HashMap<>();
    }
    //core methods : add , remove , retrieve , list all the items
    public void add(T item){
        items.put(item.getId() , item);
    }
    public void remove(T item){
        items.remove(item.getId() , item);
    }
    //method overloading..Param diff
    public void remove(String itemId){
        items.remove(itemId);
    }
    public T get(String itemId) {
        items.get(itemId);
        return items.get(itemId);
    }
    public List<T> getAll(){
        return new ArrayList<>(items.values());
    }

}
// new Inventory<Animal>();
// we don't want this

// we should be creating inventory for only Item or anything under Item
//so we should write typeparamter like this t extends Item.
//all the items who are extending can allow else will throw compilation error
