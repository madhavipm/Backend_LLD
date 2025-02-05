package inheritance;

public class Student extends User{
    int psp;
    Student (String name, String email, String password ){
        this.setName(name);
        this.setEmail(email);
        this.setPassword(password);
        psp = 100;

    }
    void solveAssignment(){
        System.out.println("solving assignment");
    }
}
