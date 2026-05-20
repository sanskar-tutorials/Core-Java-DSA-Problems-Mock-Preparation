package May20;

public class LowerPyramid {
    public static void main(String[] args) {
        int N = 4;

        for(int i = 1 ; i <= N ; i++){
            //print spaces (how many spaces ? )
            for(int j = 1 ; j <= i - 1 ; j++){
                System.out.print(" ");
            }
            //print star
            for(int j = 1 ; j <= 2 * (N - i) + 1; j++){
                System.out.print("$");
            }

            System.out.println();
        }
    }
}
