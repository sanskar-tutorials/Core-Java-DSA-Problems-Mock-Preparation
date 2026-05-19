package May15;

class IfElse {

    public static void output1() {
        int a = 6;
        if (a == 5);
        {
            System.out.println("Java");
        }
    }

    public static void output2() {
        int a = 3;
        if (a * 2 > 5 || a / 0 > 1)
            System.out.println("Safe");
    }

    public static void output3() {
        int a = 7;

        if (a > 5)
            System.out.println("A");
        if (a < 6)
            System.out.println("B");
        else
            System.out.println("C");
    }

    public static void output4() {
        int a = 10;

        if (a < 5)
            System.out.println("Hi");
        else if (a < 10)
            System.out.println("Hello");
        else
            System.out.println("Bye");
    }

    public static void output5() {
        int x = 5;

        if (x < 2)
            System.out.println(x < 10 ? "A" : "B");
        else 
          System.out.println("Outside else");
            System.out.println("Inside else");
    }

    public static void main(String[] args) {
        // Predict 1
        output1();
output2();
        
    }
}