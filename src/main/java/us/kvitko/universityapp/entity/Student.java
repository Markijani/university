package us.kvitko.universityapp.entity;

public class Student implements Teachable {

    String name = "Bernice Smith";
    String teacher = "Igasaki";
    String university = "UCLA";


    @Override
    public void takeExam() {
        System.out.println(name + " " + " is taking an exam to teacher" + " " + teacher);
    }
}