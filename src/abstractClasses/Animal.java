package abstractClasses;

public abstract class Animal {
    private String name;
    private int age;

    public void walk(){
        System.out.println("Animal is walking");
    }
    public abstract void sleep();
    //Everyone under me should know how to eat
    public abstract void eat();


}
/*When Should You Use an Abstract Class?
Use an abstract class when:
1.You want to provide common functionality
to multiple subclasses.
2.you want to prevent direct instantiation of a base class.
3.You want to enforce a structure through abstract methods.

If your User class does not need abstract methods and
does not require preventing instantiation,
then making it abstract might not be necessary.
You can use a normal superclass instead.
*/