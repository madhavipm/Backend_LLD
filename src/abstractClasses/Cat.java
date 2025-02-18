package abstractClasses;

public class Cat extends Animal {
    private String catName;

    public void meow(){
        System.out.println("Cat is meowing");
    }
    public void eat(){
        System.out.println("Cat is eating");
    }

    @Override
    public void sleep() {

    }
}
