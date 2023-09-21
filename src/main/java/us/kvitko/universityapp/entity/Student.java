package us.kvitko.universityapp.entity;

public abstract class Student implements Teachable {

    private University university;

    public Student() {
        this.university = new University();
        university.setName("UCLA");
        university.setStudent("Bernice");
    }

    public String getName() {
        return university.getName();
    }

    public String getStudent() {
        return university.getStudent();
    }


    @Override
    public void takeExam() {
        System.out.println(getStudent() +  getName() );
    }


}