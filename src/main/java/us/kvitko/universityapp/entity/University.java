package us.kvitko.universityapp.entity;

public class University implements PresenceUniversity {

    private String name;
    private String teacher;
    private String student;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    public String getStudent() {
        return student;
    }

    public void setStudent(String student) {
        this.student = student;
    }

    @Override
    public void goUniversity() {
        System.out.println();
    }
}

