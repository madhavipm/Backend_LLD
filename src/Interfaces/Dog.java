package Interfaces;

public class Dog extends Animal implements Runner{
    private String cutenessLevel;
    public void bark(){
        System.out.println("Dog is barking");
    }
    public void run(){
        System.out.println("Dog is running");
    }
}
