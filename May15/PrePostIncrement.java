package May15;

public class PrePostIncrement {


    /*
    Preincrement : CHANGE → USE
    PostIncrement : USE → CHANGE
    */

    public static void main(String[] args) {
        int a = 1;
        int b = a++ + ++a + a++ + a;
        System.out.println(b);


        int x = 5;
        System.out.println(x++ + ++x * x++);

        int z = 1;
        System.out.println(++z + z++ + --z + z--);

        int y = 5;
        --y;
        System.out.println(y);
        System.out.println(y-- + ++y);
    }
}
