package us.kvitko.universityapp.entity;

public abstract class Teacher implements Teach {
    private University university;

    public Teacher () {
        this.university = new University();
        university.setStudent("Bernice");
        university.setTeacher("Igasaki");
    }

    public String getStudent() {
        return university.getStudent();
    }

    public String getTeacher() {
        return university.getTeacher();
    }


    @Override
    public void giveExam() {
        System.out.println(getStudent() + getTeacher());
    }


}
