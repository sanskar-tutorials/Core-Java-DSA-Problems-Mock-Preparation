package Functions;


/*


Function and their local variable are created in stack memory.
Function creates their own stack frame and are executed in LIFO manner.
There are two method , object , variable which are static and non static 

Static and non static both are stored in heap

Static are stored in static area.
Non static like object are also created in heap 

*/


public class CallStack {

    //Which type of Variable ? Static || non static ? Where they'll be stored 
     String name = "Ramlal";
     int age = 88;

    public static int add1( int a , int b){
        System.out.println("-------------------------------");
        System.out.println("Add 1 Called");
        int result2 = add2(2 , 3 , 5);
        System.out.println(result2);
        System.out.println("Add1 Finished -----------------");
        return a + b;
    }

    //can we declare static variable in nonstatic function
    public boolean staticAllowed(){
       // static int num =10; //Allowed 
       return true;       
    }

    public static int add2(int a , int b , int c){
        System.out.println("Add 2 Called");
        System.out.println("-------------------------------");
        System.out.println("Add 2 Finished  ---------------");
        return (a + b + c);
        //System.out.println("Add 2 khatam");
    }

    public static void staticKiStudy(){
        final int num = 19;
    }

    public static void main(String[] args) {
        System.out.println("Main Called hua");

        add1(2,4);

        System.out.println("Main ended");
    }
}

//GC is called in the end to free the unused memory when the main function completes its execution