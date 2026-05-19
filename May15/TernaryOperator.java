package May15;

class TernaryOperator {
    /**
     * ---------------------------------------------------------
     * What is ternary Operator ?
     * A ternary operator is a replacement of the if else block , basically a short
     * form of if else where ; if else
     * is covered within the line
     * -------------------------------------------------------
     * 
     * Why its called ternary Operator ?
     * It is called ternary because , it uses three operands .
     * --------------------------------------------------------
     * How ?
     * something = [condition ? value_if_true : value_if_false;]
     * --------------------------------------------------------
     * Important Rule
     * Ternary operator returns a value.
     * That’s why we often store it in variable.
     * 
     */

    public static void output() {
        int a = 10;
        if (a > 5)
            System.out.println("Greater");
        else
            System.out.println("Smaller");

        // for the same ternary operator will be
        int x = 10;
        System.out.println(x > 5 ? "Greater" : "Smaller");
    }

    public static void oddEven() {
        int n = -7;

        String result = (n % 2 != 1) ? "Even" : "Odd";

        System.out.println(result);
    }

    public static void maxTwo(){
        int a=12;
        int b=14;
        int res=a>b?a:b;
        System.out.println(res);
    }

    public static void maxThree(){
        int a =10;
        int b = 15;
        int c = 20;
        int result = a > b?a:b;
        System.out.println(result > c ? result : c); 
    }

    public static void maxOfTwo() {
        char ch=(char)(101010);
        int a = 10;
        int b = 20;

        int max = (a > b) ? a : b;

        System.out.println(max);
    }

    public static void maxOfThree() {
        int a = 5;
        int b = 6;
        int c = 10;

        int max = (a > b && a > c) ? a : (b > c && b > a) ? b : c;
        System.out.println("Maximum of three is : " + max);
    }

    public static void mistakes(){
        int a = 5;
       // a > 2 ? System.out.println("Hi") : System.out.println("Bye"); //Error why ? 
    }

    public static void out2() {
        int a = 5;

        System.out.println(a > 2 ? a + 10 : a - 10);
    }

    /**
     * Question for the class
     * 1. Find eligible for voting or not ?
     * 2.
     */
    public static void main() {
        maxTwo();
    }
}