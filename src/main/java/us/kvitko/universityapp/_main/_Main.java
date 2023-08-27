package us.kvitko.universityapp._main;

import us.kvitko.universityapp.entity.Student;
import us.kvitko.universityapp.entity.Teacher;
import us.kvitko.universityapp.entity.University;

public class _Main {

    public static void main (String[] args) {
        Student student = new Student();
        Teacher teacher = new Teacher();
        University university = new University();
        university.goLearn(student);
        university.goLearn(teacher);
        university.takeExam(student);
        university.giveExam(teacher);

    }
}
