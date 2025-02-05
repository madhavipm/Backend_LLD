package constructorchaining;

public class D extends C{
    D(){
        super(5);
        System.out.println("Constructor D is executing");
        //java: call to super must be first statement in constructor
        //super(5);

    }
}
