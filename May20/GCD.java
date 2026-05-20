package May20;


//WAP to return gcd of a number using Eucledian algorithm
public class GCD {

    public static void main(String[] args) {
        int min = 50;
        int max = 100;

        while(min!= 0){
            int rem = max % min;
            max = min;
            min = rem;
        }

        int gcd = max;


        System.out.println("GCD of two number is " + gcd);
    }
    
}
