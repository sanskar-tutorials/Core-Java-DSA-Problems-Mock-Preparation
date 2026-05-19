package May19;

public class NestedPrintPattern {
    /*
    
    Que - 1 -> Print following pattern * ** *** **** 
    */

    public static void print1(int N){
        for(int i = 0 ; i < N ; i++){
            for(int j = 0 ; j < i ; j++){
                System.out.print("*");
            }
            System.out.print(" ");
        }
    }

    /*
    Que-2-> Print solid square
    */
    public static void solidSquare(int N){
        for(int i = 0 ; i < N ; i++){
            for(int j =  0 ; j < N ; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    /*
    Que-2 => Right triangle :
    */
    public static void rightTriangle(int N){
        for(int i = 1 ; i <= N ; i++){
            for(int j = 0 ; j < i ; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
      
    public static void rightTriangle2(int N){
        for(int i = 1 ; i <= N ; i++){
            for(int j = 1 ; j < i + 1 ; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
    
    public static void  binaryPattern(int N){

        boolean flag = true;
        boolean forLine = true;

        for(int i = 1; i < N ; i++){
            for(int j = 0 ; j < i ; j++){
                if(flag){
                    System.out.print("1 ");
                    flag = !flag;
                }else{
                    System.out.print("0 ");
                    flag = !flag;
                }
            }
             forLine = !forLine;
             flag = forLine;
            System.out.println();
        }

    }

    public static void pattern4(int N){
        for(int i = 1  ; i <= N; i++){
            for(int j = 0 ; j < i ; j++){
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    public static void pattern5(int N){
        for(int i = 1 ; i <= N ; i++){
            for(int j = 1 ; j <= N - i ; j++){
                 System.out.print("* ");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        pattern5(5);
    }



}
