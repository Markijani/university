package us.kvitko.universityapp.entity;

public class Teacher implements Teach {

    String name = "Igasaki";
    String student = "Bernice Smith";
    String university = "UCLA";


    @Override
    public void giveExam() {
        System.out.println("Teacher" + " " + name + " " + "is giving the exam paper to" + " " + student);
    }
}
