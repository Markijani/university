package us.kvitko.universityapp.entity;

public class Teacher implements Teach, PresenceUniversity {

    @Override
    public void giveExam() {
        System.out.println("I am a teacher and I give an exam.");
    }

    @Override
    public void goUniversity() {
        System.out.println("T am a teacher and I go to the university");
    }

}
