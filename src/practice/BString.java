package practice;

public class BString {
    public static void main(String[] args) {

        int money;
        money = 125;
        int money1 = 125;
        if (money1 == money) {
            System.out.println("true");
        }
        if (Integer.valueOf(money) == Integer.valueOf(money1)) {
            System.out.println("true1");
        }

        System.out.println(Integer.valueOf(money));
        System.out.println(Integer.valueOf(money1));

        int money3 = money1 - 1;
        int money4 = money3 + 1;

        System.out.println(money3);
        System.out.println(money4);

        System.out.println("________________________________");

        money1 = money4;


        if (money1 == money) {
            System.out.println("true");
        }

        if (Integer.valueOf(money) == Integer.valueOf(money1)) {
            System.out.println("true1");
        }


        String string1 = "This is the string variable.";

        if (string1 == "This is the string variable.") {
            System.out.println("true");
        }

        String string2 = "This is the string variable.";
        if (string1 == string2) {
            System.out.println("true");
        }

        String string3 = string1.replace('s', 'S');
        System.out.println(string3);

        String string4 = string3.replace('S', 's');
        System.out.println(string4);

        string1 = string4;

        if (string1 == string2) {
            System.out.println("TRUE");
        } else System.out.println("FALSE");

        if (string1.intern() == string2.intern()) {
            System.out.println("TRUE-");
        } else System.out.println("FALSE-");

        if (string1.equals(string2)) {
            System.out.println("TRUE=");
        } else {
            System.out.println("FALSE=");
        }
    }

}
