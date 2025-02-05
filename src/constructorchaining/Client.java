package constructorchaining;

public class Client {
    public static void main(String[] args) {
        D d = new D();
    }
}

// super : helps you to refer to parent class constructor
// this : helps you to refer to the current class constructor


// java says that "Hey parent class private attributes are not going to be inherited"
//not accessible in child class via child Attributes
//BUT CHILD CLASSES DO HAVE THESE ATTRIBUTES,THEY NEED TO ACCESSED VIA PARENT ONLY.

