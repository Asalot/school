package oop;

public class School {

    public static void main(String[] args) {

        Teacher teacher1 = new Teacher(false, "Ivan Petrovich", "Inanov",
                55, "Math");

        teacher1.printTeacherCard();
    }
}