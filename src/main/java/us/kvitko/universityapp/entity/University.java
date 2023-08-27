package us.kvitko.universityapp.entity;

public class University {
    public void goLearn(PresenceUniversity presenceUniversity) {
        presenceUniversity.goUniversity();
    }

    public void takeExam(Student student) {
        student.takeExam();
    }

    public void giveExam(Teacher teacher) {
        teacher.giveExam();
    }

}
