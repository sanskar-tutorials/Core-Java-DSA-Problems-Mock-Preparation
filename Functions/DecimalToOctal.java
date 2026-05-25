package Functions;

public class DecimalToOctal {

    public static void decimalToOctal(int N){
        int base = 8;
        int place = 1;    //So we dont need to reverse it again and again 

        int result = 0;

        while(N > 0){
            int remainder = N % base;
            result = result + place * remainder;
            place = place * 10;
            N = N / 8;
        }


        System.out.println("Octal conversion of " + 100 + "is = " + result );

    }


    public static void OctalToDecimal(int N){
        int place = 1;
        int result = 0;

        int base = 10;

        while(N > 0){
            int remainder = N % base;
            result = result + place * remainder;
            place = place * 8;
            N = N/10;
        }

        System.out.println("Octal conversion  of " + N + "is  = "  + result );
    }


    public static void main(String[] args) {
        decimalToOctal(100);
        OctalToDecimal(144);
        
    }
    
}
