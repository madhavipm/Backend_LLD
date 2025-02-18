package LibraryManagementSystem;

public abstract class User {
    private String userId;
    private String userName;
    private String contactInfo;
    private static int totalUsers = 0;
    public static int getUserCount(){
        return totalUsers;
    }
    public abstract void displayDashboard();
    public abstract boolean canBorrowBooks();
    public abstract void returnBook();

    User(){
        userId = generateUniqueId();
    }
    private final String generateUniqueId(){
        totalUsers++;

        return "User -"+ totalUsers;

    }
    User(String userName, String contactInfo){
        userId = generateUniqueId();
        this.userName = userName;
        this.contactInfo = contactInfo;
    }
    User(User user){
        userId = generateUniqueId();
        this.userName = user.userName;
        this.contactInfo = user.contactInfo;
    }
    public String getUserId() {
        return userId;
    }
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }
}
