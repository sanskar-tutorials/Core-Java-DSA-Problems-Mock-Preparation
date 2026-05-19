package Operators;

public class Relational {
    public static void main(String[] args) {
        double d1 = 0.1 + 0.2;
        System.out.println("Part A: " + (d1 == 0.3));
       
        // Part B: Chained logic (Common beginner mistake)
        int x = 5, y = 10, z = 15;
        //System.out.println(x < y < z); // Will this compile?

        char c1 = 'B';
        int i1 = 66;
        System.out.println("Part C: " + (c1 <= i1));

        // Part D: Precedence
        System.out.println("Part D: " + (5 + 5 == 10 != false));

        System.out.println("Part E : " + ('a' > 98) );

    }
}
