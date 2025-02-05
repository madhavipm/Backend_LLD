package constructors;

public class Student {
    int id;
    int age;
    String name;
    double psp;
    Exam exam;
    Student(int id, int age, String name, double psp) {
        this.id = id;
        this.age = age;
        this.name = name;
        this.psp = psp;
        this.exam = new Exam(1,0);

    }


    public Student(Student student) {
        this.id = student.id;
        this.age = student.age;
        this.name = student.name;
        this.psp = student.psp;
        //shallow copy student.exam is just copying the refernece not creating obj
        //  this.exam = student.exam;

        this.exam = new Exam(student.exam);

    }
}
