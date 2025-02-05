package constructors;

public class Exam {
    int examid;
    int score;
    ReattemptExam attemptExam;
    Exam(int examid, int score) {
        this.examid = examid;
        this.score = score;
        this.attemptExam = new ReattemptExam(examid);
    }
    Exam(Exam exam) {
        this.examid = exam.examid;
        this.score = exam.score;
        //shallow copy:copying refernce
        //this.attemptExam = exam.attemptExam;
        this.attemptExam = new ReattemptExam(exam.attemptExam);
    }
}
