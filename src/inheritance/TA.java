package inheritance;
public class TA extends User{
    int countHR;
    TA(String email,String pass){
        this.setEmail(email);
        this.setPassword(pass);
    }
    void acceptHR(){
        System.out.println("TA is accepting HR");
    }

}
