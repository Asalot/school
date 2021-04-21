package practice;

public class FIfElse {

//    if (condition) {
//        code;
//    }
//
//    exit;
//----------------------------------
//    if (condition) {
//        code1;
//    } else {
//        code2;
//    }
//
//    exit;
//----------------------------------
//    if (condition) {
//        code1;
//    } else if (condition) {
//        code2;
//    } else {
//        code3;
//    }
//
//    exit;
//-----------------------------------
//    if (condition) {
//        if (condition) {
//            code1;
//        } else if (condition) {
//            code2;
//        } else {
//            code3;
//        }
//        code4;
//    } else if (condition) {
//        code5;
//    } else if (condition) {
//        code6;
//    } else {
//        code7;
//    }
//
//    exit;
//--------------------------------------
//    int i = 5;
//
//        if(i > 0) {
//        System.out.println("i > 0");
//    }
//--------------------------------------

    public static void main(String[] args) {
        //0 <= number <= 10

        int number = 10;

        if (number > 0) {
            // 1-10

            if (number % 2 == 0) {
                //2, 4, 6, 8, 10

                if (number % 4 == 0) {
                    //4, 8
                    if (number > 5) {
                        //8
                        System.out.println("Ваше число 8");

                    } else {
                        System.out.println("Ваше число 4");
                    }
                    //2, 6, 10
                } else if (number * 3 == 6) {
                    System.out.println("Ваше число 2");
                    //6, 10
                } else if (number < 8) {
                    System.out.println("Ваше число 6");
                } else {
                    System.out.println("Ваше число 10");
                }
                // 1, 3, 5, 7, 9
            } else if (number % 3 == 0) {
                //3, 9
                if (number / 3 == 1) {
                    System.out.println("Ваше число 3");
                } else {
                    System.out.println("Ваше число 9");
                }
                //1, 5, 7
            } else if (number != 7) {
                //1, 5
                if (number == 1) {
                    System.out.println("Ваше число 1");
                } else {
                    System.out.println("Ваше число 5");
                }
            } else {
                System.out.println("Ваше число 7");
            }
        } else {
            System.out.println("Ваше число 0");
        }
    }
}



