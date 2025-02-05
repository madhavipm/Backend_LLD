package abstractClasses;

public abstract class Dog extends Animal {
    String cutenessLevel;

    public void bark(){
        System.out.println("Dog is barking");
    }
    //public abstract void eat(); don't even need this line if class is an abstract class
    //If Subclass don't have any implementation of parent class abstract method then
    //the child/subclass can make that class as abstract then it won't throw any error
}
