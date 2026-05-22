package May20;

public class StairCasePattern {

    public static void pattern2(int n) {
        int stars = 2;

        for (int i = 1; i <= n; i++) {

            // Print stars
            for (int j = 1; j <= stars; j++) {
                System.out.print("* ");
            }

            System.out.println();

            // Increase stars after every 2 rows
            if (i % 2 == 0) {
                stars += 2;
            }
        }
    }

    public static void pattern1(int n) {
        for (int i = 1; i <= n; i++) {
            // repeat same row twice
            for (int k = 1; k <= 2; k++) {

                // Print stars
                for (int j = 1; j <= 2 * i; j++) {
                    System.out.print("* ");
                }

                System.out.println();
            }

            // Empty line between blocks
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 5;
        pattern1(5);
        pattern2(5);

    }
}
