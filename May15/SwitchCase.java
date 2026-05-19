package May15;

public class SwitchCase {
    /**
     * What and why ?
     * What - > A switch statement is used to select one block of code from multiple
     * options.
     * Why-> Instead of writing many if-else conditions, we use switch.
     * 
     * --------------------------------------------------------
     * REAL LIFE ANALOGY
     * 
     * Imagine ATM menu:
     * 
     * 1 -> Check Balance
     * 2 -> Withdraw
     * 3 -> Deposit
     * 4 -> Exit
     * ---------------------------------------------------------------
     * SYNTAX
     * switch(variable)
     * {
     * case value1:
     * // code
     * break;
     * 
     * case value2:
     * // code
     * break;
     * 
     * default:
     * // default code
     * }
     * ------------------------------------------------------------------------
     * DATA TYPE ALLOWED = byte
     * [short ,int char String , enum , byte ]
     * 
     * Why floats are not allowed ?? Mismatch 0.1 + 0.2 != 0.3
     */

    public static void weekDay() {
        int day = 2;

        switch (day) {
            case 1:
                System.out.println("Monday");
                break;

            case 2:
                System.out.println("Tuesday");
                break;

            case 3:
                System.out.println("Wednesday");
                break;

            default:
                System.out.println("Invalid");
        }
    }

    public static void importanceOfBreak() {
        int a = 2;
        switch (a) {
            case 1:
                System.out.println("One");
            case 2:
                System.out.println("Two");
            case 3:
                System.out.println("Three");
        }
    }

    public static void main(String[] args) {

    }
}
