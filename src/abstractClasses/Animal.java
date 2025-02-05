package abstractClasses;

public abstract class Animal {
    private String name;
    private int age;

    public void walk(){
        System.out.println("Animal is walking");
    }
    //Everyone under me should know how to eat
    public abstract void eat();

}
