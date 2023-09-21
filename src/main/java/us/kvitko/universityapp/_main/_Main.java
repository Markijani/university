package us.kvitko.universityapp._main;

import us.kvitko.universityapp.entity.PresenceUniversity;
import us.kvitko.universityapp.entity.Student;
import us.kvitko.universityapp.entity.Teacher;
import us.kvitko.universityapp.entity.University;
import us.kvitko.universityapp.util.UniversityService;

public class _Main {
    public static void main(String[] args) {
        Student student = new Student();
        Teacher teacher = new Teacher();
        UniversityService.presence(student);
        UniversityService.presence(teacher);
        UniversityService.learn(student);
        UniversityService.study(teacher);

    }
}


