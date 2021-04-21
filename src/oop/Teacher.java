package oop;

import static oop.Utils.*;

public class Teacher extends Person {

    private String subject;

    public Teacher(boolean isStudent, String firstName, String lastName, int age, String subject) {
        super(isStudent, firstName, lastName, age);
        this.setSubject(subject);
    }

    public void setSubject(String subject) {
        if (getPerson().equals("Teacher")) {
            this.subject = subject;
        } else {
            this.subject = null;
        }
    }

    public void printTeacherCard() {
        printCard();
        System.out.println(subject);
        printLine();
    }
}