package LibraryManagementSystem;

public class Client {
    public static void main(String[] args) {
        Member m1 = new Member("Madhavi", "12345");
        Member m2 = new Member("m2", "12345");
        Member m3 = new Member("m3", "12345");
        Member m4 = new Member("m4", "12345");
        System.out.println("Total users is " + User.getUserCount());


    }
}
