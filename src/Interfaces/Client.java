package Interfaces;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Client {
    public static void main(String[] args) {
        Dog dog = new Dog();
        RoboticDog roboticDog = new RoboticDog();
        Cat cat = new Cat();

        //List of animals participating in running race
        ArrayList<Object> list = new ArrayList<Object>();
        list.add(dog);
        list.add(roboticDog);
        list.add(cat); //here this won't throw error(but it should throw since obj is cat)
        //In java while working with object. It allows every class .
        // It doesn't think whether it has that behaviour to participate in race

        ArrayList<Runner> participants = new ArrayList<>();
        participants.add(roboticDog);
        participants.add(dog);
        //participants.add(cat);This will throw error bcz datatype of ArrayList is an Interface
        //this list will only allow classes that implements the runner class.
        for (int i = 0; i < participants.size(); i++) {
            System.out.println(participants.get(i).toString());
        }
    }
}
