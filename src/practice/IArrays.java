package practice;


public class IArrays {

    public static void main(String[] args) {

//  1. Declaration
//      Primitive
//
//        int[] array1;
//        double[] array2;
//        boolean[] array3;
//        char[] array4;
//
//      Objects/Reference
//
//        String[] array5;
//        Integer[] array6;
//        Teacher_HW[] array7;
//        Cats[] array8;
//
//  2. Memory allocation
//        array1 = new int[6];
//        array2 = new double[10];
//        array3 = new boolean[5];
//        array4 = new char[3];
//        array5 = new String[8];
//
//  3. Array Initializers

//        array1[0] = 10;
//        array1[1] = 20;
//        array1[2] = 30;
//        array1[3] = 40;
//        array1[4] = 50;
//        array1[5] = 60;
//
//        String[] catsNames = {"Мурка", "Мурзик", "Рыжик"};
//
//        array2 = new double[]{1.5, 1.8, 2.777, 4.09578};
//
//        boolean[] isCatBlack = new boolean[]{false, true, false, false};
//
//        array4[0] = 'a';
//        array4[1] = 'b';
//        array4[2] = 'c';
//
//        Cats[] cats = new Cats[] {cat1, cat2, cat3};

        String[] catsNames = new String[8];

//        System.out.println(catsNames);

        catsNames[0] = "Мурзик";
        catsNames[1] = "Черныш";
        catsNames[2] = "Мурка";
        catsNames[3] = "Барсик";
        catsNames[4] = "Рыжик";
        catsNames[5] = "Эшли";
        catsNames[6] = "Джина";
        catsNames[7] = "Машка";

        for (int boxNumber = 0; boxNumber <= 7; boxNumber ++) {
            System.out.println(catsNames[boxNumber]);
        }

        for (int boxNumber = 0; boxNumber <= 7; boxNumber ++) {
            System.out.println(boxNumber);
        }

        System.out.println(catsNames.length);

        for (int boxNumber = 0; boxNumber <= catsNames.length - 1; boxNumber ++) {
            System.out.println(catsNames[boxNumber]);
        }

        for (int boxNumber = 0; boxNumber < catsNames.length; boxNumber ++) {
            System.out.println(catsNames[boxNumber]);
        }

        for (int boxNumber = catsNames.length - 1; boxNumber >= 0; boxNumber --) {
            System.out.println(catsNames[boxNumber]);
        }
    }
}

