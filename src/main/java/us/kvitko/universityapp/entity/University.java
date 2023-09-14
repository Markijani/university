package us.kvitko.universityapp.entity;

public class University implements PresenceUniversity {


    String university;
    String teacher;
    String student;

    public University(String university, String teacher, String student) {
        this.university = university;
        this.teacher = teacher;
        this.student = student;
    }

    @Override
    public void goUniversity() {
        System.out.println("Student" + " " + student + " " + "and teacher" + " " + teacher + " " + "are at the" + " " + university);
    }
}
