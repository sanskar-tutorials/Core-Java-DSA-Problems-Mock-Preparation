package May15;

public class TypeCasting {

    /*
    Real life use case of TypeCasting
    1.Gaming (Pixel calculation of a player comes out in decimal but pixel calculation is taken in integer);
    2.Sensor data in IOT (For example a digital thermometer might record your temperature in decimal but come out in integer.)
    3. Prediciton in Machine Learning like a accuracy or precision score is given in decimal it is converted into the percentage of int.
    */

    private static void implicit() {
        int a = 10;
        double b = a;

        System.out.println(a);
        System.out.println(b);
    }

    /*
     * 
     * Why do we need explicit casting ?
     * because Java Doesn’t Allow Automatic Narrowing but why?
     * 
     * To prevent:
     *
     * data loss
     * overflow
     * wrong values
     * 
     */
    private static void explicit() {
        double d1 = 99.9999943;
        int d2 = (int) d1;
        System.out.println(d1);
        System.out.println(d2);

        // int-> ch
        int a = 66; 

        char ch = (char) a;

        System.out.println(ch);
    }

    public static void main(String[] args) {
        implicit();
        explicit();
    }
}
