package Functions;

public class CallStack {
    public static int add1( int a , int b){
        System.out.println("Add 1 Called");
        int result2 = add2(2 , 3 , 5);
        System.out.println(result2 + "-------------------");
        return a + b;
    }

    public static int add2(int a , int b , int c){
        System.out.println("Add 2 Called");
        return (a + b + c);
    }

    public static void main(String[] args) {
        System.out.println("Main Called hua");

        add1(2,4);

        System.out.println("Main ended");
    }


}
