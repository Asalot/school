package practice;

public class LStudent {
    public static void main(String[] args) {

        String comaSpace = ", ";
        String space = " ";
        String line = "_____________________________";

        String firstName1 = "Маша";
        String lastName1 = "Сидорова";
        int age1 = 10;
        String grade1 = "5 класс";
        boolean isTeacher1 = false;
        boolean isStudent1 = true;

        String firstName2 = "Вова";
        String lastName2 = "Наумов";
        int age2 = 7;
        String grade2 = "1 класс";
        boolean isTeacher2 = false;
        boolean isStudent2 = true;

        System.out.println(
                firstName1 + space + lastName1 + comaSpace + age1 + comaSpace + grade1);
        System.out.println(
                firstName2 + space + lastName2 + comaSpace + age2 + comaSpace + grade2);


    }
}
