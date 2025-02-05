package constructors;

public class ReattemptExam {
    int examId;

    public ReattemptExam(int examId) {
        this.examId = examId;
    }
    ReattemptExam(ReattemptExam reattemptExam) {
        this.examId = reattemptExam.examId;
    }
}
