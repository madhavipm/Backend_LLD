package LibraryManagementSystem;

public class Librarian extends User {
    private String employeeNumber;

    Librarian(String userName, String contactInfo ,String employeeNumber){
        super(userName, contactInfo);
        this.employeeNumber = employeeNumber;
    }
    public void displayDashboard(){
        System.out.println("Librarian Dashboard "+employeeNumber);

    }
    @Override
    public boolean canBorrowBooks(){
        return  true;
    }

    @Override
    public void returnBook() {
        //
    }

    public void addNewBook(Book book){
    //
    }
    public void removeBook(Book book){
    //
    }
    public void returnBook(Book book){
    //
    }
}
