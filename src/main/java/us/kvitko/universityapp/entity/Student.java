package us.kvitko.universityapp.entity;

public class Student implements Teachable, PresenceUniversity {

    @Override
    public void takeExam() {
        System.out.println("I am a student and I take an exam.");
    }

    @Override
    public void goUniversity() {
        System.out.println("I am a student and I go to the university");
    }

}
