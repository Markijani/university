package us.kvitko.universityapp._main;

import us.kvitko.universityapp.entity.Student;
import us.kvitko.universityapp.entity.Teacher;
import us.kvitko.universityapp.entity.University;
import us.kvitko.universityapp.util.UniversityService;

public class _Main {
    public static void main(String[] args) {
        University university = new University();
        Student student = new Student();
        Teacher teacher = new Teacher();
        UniversityService.presence(university);
        UniversityService.learn(student);
        UniversityService.study(teacher);

    }
}


