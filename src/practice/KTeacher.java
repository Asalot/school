package practice;

public class KTeacher {


    public static void main(String[] args) {

        String comaSpace = ", ";
        String space = " ";
        String line = "______________________________";

        String firstName1;
        String lastName1;
        int age1;
        String subject1;
        boolean isTeacher1 = true;
        boolean isStudent1 = false;

        String firstName2;
        String lastName2;
        int age2;
        String subject2;
        boolean isTeacher2 = true;
        boolean isStudent2 = true;

        firstName1 = "Мария Ивановна";
        lastName1 = "Петрова";
        age1 = 35;
        subject1 = "Russian Literature";

        firstName2 = "Иван Петрович";
        lastName2 = "Иванов";
        age2 = 55;
        subject2 = "Math";



//Simple
//
//        System.out.println(line);
//        System.out.println("Выход из программы");
//
//        String[] teacher1 = new String[4];
//        String[] teacher2 = new String[4];
//
//        String a = "";
//        String ageTeacher1 = String.valueOf(age1);
//        String ageTeacher2 = Integer.toString(age2);
//
//        System.out.println(teacher1);
//        System.out.println(teacher2);
//        System.out.println(a.getClass());
//        System.out.println(ageTeacher1);
//        System.out.println(ageTeacher1.getClass());
//        System.out.println(ageTeacher2.getClass());



        String[] nameOfTeachers = {"Мария Ивановна", "Иван Петрович"};
        String[] surname = {"Петрова", "Иванов"};

        int[] age = {35, 55};
        String[] ageString = new String[2];
        for (int i = 0; i < age.length; i++) {
            ageString[i] = String.valueOf(age[i]);

            String[] subjects = {"Russian Literature", "Math"};

            String[][] vizitka = new String[4][2];

            for (int row = 0; row < 4; row++) {
                for (int cell = 0; cell < 2; cell++) {
                    if (row == 0) {
                        vizitka[row][cell] = nameOfTeachers[cell];
                    } else if (row == 1) {
                        vizitka[row][cell] = surname[cell];
                    } else if (row == 2) {
                        vizitka[row][cell] = subjects[cell];
                    } else {
                        vizitka[row][cell] = ageString[cell];
                    }
                }
            }
            System.out.println("____________________________________");

            for (int cell = 0; cell < 2; cell++) {
                for (int row = 0; row < 4; row++) {
                    System.out.println(vizitka[row][cell]);
                }
                System.out.println("____________________________________");
            }
        }


            String[] teacherName = new String[2];
            teacherName[0] = "Мария Ивановна";
            teacherName[1] = "Иван Петрович";

            String[] subject = new String[2];
            subject[0] = "Russian Literature";
            subject[1] = "Math";

            int[] teachersAges = {35, 40};

            String[] teachersAgesString = new String[2];

            for (int ages = 0; ages < teachersAges.length; ages++) {
                teachersAgesString[ages] = String.valueOf(teachersAges[ages]);
                // System.out.println(teachersAgesString[ages]);
            }

            String[][] teachers = new String[3][2];
            for (int row = 0; row < 3; row++){
                for (int cell = 0; cell < 2; cell++){
                    if (row == 0) {
                        teachers[row][cell] = teacherName[cell];
                    } else if (row == 1) {
                        teachers[row][cell] = subject[cell];
                    } else if (row == 2){
                        teachers[row][cell] = teachersAgesString[cell];
                    }
                    System.out.println(teachers[row][cell]);
                }

            }


    }
}


//// Advanced
//
////      DB
//        String firstNameDB = "Мария Ивановна";
//        String lastNameDB = "Петрова";
//        int ageDB = 35;
//        String subjectDB = "Russian Literature";
//
////        String firstNameDB = "Иван Петрович";
////        String lastNameDB = "Иванов";
////        int ageDB = 55;
////        String subjectDB = "Math";
//
//
//        boolean isTeacher = true;
//
//        if (isTeacher) {
//
//            System.out.println();
//            System.out.println("*** Hi, oop.Teacher! Please enter your first name:");
//            System.out.println("Мария Ивановна");
//
//            String firstNameUser = "Мария Ивановна";
//
//            if (firstNameUser.equals(firstNameDB)) {
//
//                System.out.println();
//                System.out.println("*** Please enter your last name:");
//                System.out.println("Петрова");
//
//                String lastNameUser = "Петрова";
//
//                if (lastNameUser.equals(lastNameDB)) {
//
//                    System.out.println();
//                    System.out.println("*** Hello, " + firstNameUser + space + lastNameUser + "!");
//                    System.out.println();
//
//                    System.out.println("*** Please confirm your age: ");
//                    System.out.println(35);
//
//                    Integer ageUser = 35;
//
//                    if (ageUser.equals(ageDB)) {
//
//                        System.out.println();
//                        System.out.println("*** Please enter the subject: ");
//                        System.out.println("Russian Literature");
//
//                        String subjectUser = "Russian Literature";
//
//                        if (subjectUser.equals(subjectDB)) {
//
//                            System.out.println();
//                            System.out.println("------------------Card:----------------------- ");
//                            System.out.println(firstNameDB + space + lastNameDB + comaSpace + ageDB + comaSpace + subjectDB);
//                            System.out.println("---------------------------------------------- ");
//                        } else {
//
//                            System.out.println("*** Wrong Subject Name. Please contact school administration.");
//                        }
//
//                    } else {
//
//                        System.out.println();
//                        System.out.println("*** Please visit HR. Some personal data in your profile has to be updated");
//                    }
//
//                    System.out.println();
//                    System.out.println("*** Thank you, " + firstNameDB + "! Have a good day!");
//                } else {
//
//                    System.out.println();
//                    System.out.println("*** Please, check your last name.");
//                }
//            } else {
//
//                System.out.println();
//                System.out.println("*** Sorry, teacher, we don't know you.");
//            }
//        } else {
//
//            System.out.println();
//            System.out.println("*** Hi, student! You have to use another entrance.");
//        }
//


////      User
//        String firstName1 = "Мария Ивановна";
//        String lastName1 = "Петрова";
//        int age1 = 35;
//        String subject1 = "Russian Literature";
//        boolean isTeacher1 = true;
//
//
//        String firstName2 = "Иван Петрович";
//        String lastName2 = "Иванов";
//        int age2 = 55;
//        String subject2 = "Math";
//        boolean isTeacher2 = true;

