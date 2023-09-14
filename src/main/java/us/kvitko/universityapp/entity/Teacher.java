package us.kvitko.universityapp.entity;

public class Teacher implements Teach {

    String teacher;
    String student;
    String university;

    public Teacher(String teacher, String student, String university) {
        this.teacher = teacher;
        this.student = student;
        this.university = university;
    }

    @Override
    public void giveExam() {
        System.out.println("Teacher" + " " + teacher + " " + "is giving the exam paper to" + " " + student);
    }
}
