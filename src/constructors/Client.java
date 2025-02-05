package constructors;

public class Client {
    public static void main(String[] args) {
        Student student = new Student(1,23, "Madhavi" , 90);
        Student s1 = new Student(student);

        Student s2 = new Student(s1);
        // st and s1 might belong to same Batch
        //if I have a Batch class everyone
        //in such cases shallow copy is used..
        // group of something is connecting there we need a same refernce as a connecting point.
    }
}
