package inheritance;

public class Client {
    public static void main(String[] args) {
        Student student = new Student("Madhavi","madhavi@gmail.com" , "pass");
        student.login("madhavi@gmail.com" , "pass");
        student.solveAssignment();
        Instructor instructor = new Instructor("sai@gmai.com" , "pass");
        instructor.login("sai@gmai.com" , "pass");
        instructor.takeClass();
        TA ta = new TA("mounica@gmail.com" , "pass");
        ta.login("mounica@gmail.com" , "pass");
        ta.acceptHR();
    }
}
