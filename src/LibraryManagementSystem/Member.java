package LibraryManagementSystem;

import java.awt.*;

public class Member extends User {
    int borrowedBooksCount;
    public static final int maxLimit = 5;
    Member(){
        super();
        borrowedBooksCount = 0;
    }
    Member(String userName, String contactInfo) {
        super(userName, contactInfo);
        borrowedBooksCount = 0;
    }

    public void displayDashboard() {
        System.out.println("Member Dashboard and Book Borrowed is " + borrowedBooksCount);
    }

    @Override
    public boolean canBorrowBooks() {
        return false;
    }

    public boolean canBorrowBook() {
        if (borrowedBooksCount < maxLimit) {
            return true;
        }
        return false;
    }
    public void returnBook() {
        borrowedBooksCount--;
    }

}
