package constructorchaining;

public class B extends A {
    B(){
        super(1);
        System.out.println("Constructor B is executing");
    }
}
