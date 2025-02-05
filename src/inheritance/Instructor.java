package inheritance;

public class Instructor extends User {
    private   String subject;
    Instructor(String email,String pass) {
        this.setEmail(email);
        this.setPassword(pass);
    }
    void takeClass() {
        System.out.println("Instructor is taking class");
    }
}
