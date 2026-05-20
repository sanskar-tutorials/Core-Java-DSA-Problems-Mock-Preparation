package May20;

public class DiamondPattern {

    /*
            $
          $   $
        $   $   $
        $   $   $
          $   $ 
            $
    
    */

    public static void main(String[] args) {
        /*
        
        We can breakdown problem into two subproblem 
        upper pyramid print
        lower pyramid print
        */
        int N = 4;

        //upper pyramid
        for(int i= 1 ; i <= N ;i++){
            for(int j = 1 ; j < N - i ; j++){
                System.out.print(" ");
            }

            for(int j = 1 ; j <= 2*i - 1 ; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        //downward pyramid

       for(int i = 1 ; i <= N ; i++){
            //print spaces (how many spaces ? )
            for(int j = 1 ; j <= i - 1 ; j++){
                System.out.print(" ");
            }
            //print star
            for(int j = 1 ; j <= 2 * (N - i) + 1; j++){
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
