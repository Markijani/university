package us.kvitko.universityapp.entity;

public class University implements PresenceUniversity {

    String name = "UCLA";
    String teacher = "Igasaki";
    String student = "Bernice Smith";

   @Override
   public void goUniversity() {
       System.out.println("Student" + " " + student + " " + "and teacher" + " " + teacher + " " + "are at the" + " " + name);
   }
}
