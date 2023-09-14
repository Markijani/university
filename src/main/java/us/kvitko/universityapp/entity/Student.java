package us.kvitko.universityapp.entity;

public class Student implements Teachable {
    String student;
    String teacher;
    String university;
    public Student (String student, String teacher, String university) {
        this.student = student;
        this.teacher = teacher;
        this.university = university;
    }

    @Override
    public void takeExam() {
        System.out.println(student + " " + " is taking an exam to teacher" + " " + teacher);
    }
}