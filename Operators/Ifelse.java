package Operators;

public class Ifelse {
    public static void main(String[] args) {
        int n = 159;
        if (n % 2 != 0) { 
          System.out.println("Odd");
        }else{
            System.out.println("Even");
        }
        int x = 10;

        if(x > 5 || x++ > 100){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
        System.out.println(x);

        if(x > 5 | x++ > 100){
            System.out.println("True");
        }else{
            System.out.println("False");
        }

        System.out.println(x);
    }
}
