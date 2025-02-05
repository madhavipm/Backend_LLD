package constructorchaining;

public class A {
    A(){
        System.out.println("Constructor A is executing");
    }
    A(int x){
        this();//to  call another constructor in same class
        System.out.println("Parameterized Constructor A is executed");
        // java: call to this must be first statement in constructor
        // this();
    }
}
