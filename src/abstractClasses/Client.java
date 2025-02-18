package abstractClasses;

public class Client {
    public static void main(String[] args) {
        Animal animal = new Dog();
        animal.sleep();
        //usually it will throw compilation error
        //public abstract void sleep();if i don't write abstract method in animal class
        //so by using abstract methods we are achieving runtime polymorphism
    }
}
