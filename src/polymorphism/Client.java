package polymorphism;

import java.util.Scanner;

public class Client {
    private static Scanner scn = new Scanner(System.in);
    public static void main(String[] args) {
        Animal animal = new Animal();
        System.out.println("Tell me which animal you want? [Cat/Dog] ");
        String animalType = scn.nextLine();
        Animal animal1 = null;
        if(animalType.equalsIgnoreCase("Cat")){
            animal1 = new Cat();
        }
        else if(animalType.equalsIgnoreCase("Dog")){
            animal1 = new Dog();
        }
        AnimalUtility.doSomething(animal1);
        // You can't do the vice-versa
        //Dog d = new Animal();

    }
}
