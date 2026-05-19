package May16;

public class SwitchCase {
    /**
     * Que to practices
     * 1.Build a calculator , take a operator as char print the arithmetic response
     * as per the operator
     * 2.Print month name , take input as integer like 3 for march
     * 3.Grade system : Grade System
     * Input grade character: 
     * A → Excellent
     * B → Good
     * C → Average
     * D → Poor
     * F → Fail
     * 4. Simple Login Role System
     * 
     * Input:
     * 
     * admin
     * student
     * teacher
     * guest
     * 
     * Print different permissions.
     * 
     * Use String switch.
     **/

    void fun1() {
        char ch = 'B';

        switch (ch) {

            case 'A':
                System.out.println("Apple");
                break;

            case 'B':
                System.out.println("Ball");
                break;

            default:
                System.out.println("Unknown");
        }
    }

    void fun2() {
        int num = 2;
        switch (num) {

            case 1:
            case 2:
            case 3:
                System.out.println("Small Number");
            default:
                System.out.println("Large Number");
        }
    }

    void fun3() {
        int x = 2;

        switch (x) {

            default:
                System.out.print("D");
                break;

            case 1:
                System.out.print("A");

            case 3:
                System.out.print("C");

            case 4:
                System.out.print("B");
            
            
        }
    }

    public static void main(String[] args) {
       SwitchCase swc = new SwitchCase();
       swc.fun3();
    }
}