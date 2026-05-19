package May15;

class Variables {
    public static boolean num;
    
    public void add(){
        System.out.println(num == true);
    }

    public static void main(String[] args) {

        //Local variables Concept       
        System.out.println(num);
        int hi;
        //System.out.println(hi);

        // Which of these are valid
        int _a = 10;
        int $num = 20;
        int number1 = 30;

        char ch = 'a';
        System.out.println(ch++);
        System.out.println(ch++);
        System.out.println(ch + 2);
    }

}