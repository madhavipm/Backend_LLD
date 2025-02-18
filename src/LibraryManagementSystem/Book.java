package LibraryManagementSystem;

public abstract class Book implements Lendable{
    private String isbn;
    private String title;
    private String author;
    boolean isAvailable;
    Book(String isbn, String title, String author, boolean isAvailable) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.isAvailable = true;
    }

    @Override
    public boolean lend(User user) {
        if(isAvailable == true && user.canBorrowBooks()){
            isAvailable = false;
            return true;
        }
        return false;
    }

    @Override
    public void returnBook(User user) {
        isAvailable = true;
        user.returnBook();

    }

    @Override
    public boolean isAvailable(User user) {
        return isAvailable;
    }
}
