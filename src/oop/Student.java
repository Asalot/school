package oop;

public class Student extends Person {

    private int grade;

    Student(boolean isStudent, String firstName, String lastName, int age, int grade) {
        super(isStudent, firstName, lastName, age);
        this.grade = grade;
    }
}