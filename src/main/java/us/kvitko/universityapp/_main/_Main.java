package us.kvitko.universityapp._main;

import us.kvitko.universityapp.entity.Student;
import us.kvitko.universityapp.entity.Teacher;
import us.kvitko.universityapp.entity.University;
import us.kvitko.universityapp.util.UniversityService;

public class _Main {

    public static void main(String[] args) {
        Teacher teacher = new Teacher("Igasaki", "Bernice Smith", "UCLA");
        Student student = new Student("Bernice Smith", "Igasaki", "UCLA");
        University university = new University("USLA", "Igasaki", "Bernice Smith");
        UniversityService.study(teacher);
        UniversityService.learn(student);
        UniversityService.presence(university);
    }
}
