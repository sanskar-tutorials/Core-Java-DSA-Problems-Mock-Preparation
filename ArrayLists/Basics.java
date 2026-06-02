package ArrayLists;
import java.util.ArrayList;
import java.util.Scanner;
public class Basics {

    public static void addElements(ArrayList<Integer> list1 , int n){
         Scanner sc = new Scanner(System.in);
        
        for(int i = 0 ; i < n ; i++){
            System.out.print("Elements to add at " +  (list1.size() + i) + " ");
            int ele = sc.nextInt();
            list1.add(ele);
        }
        
        System.out.println(list1);
    }

    public static int getElement(ArrayList<Integer> list1 , int idx){
        return list1.get(idx);
    }

    public static void setElements(ArrayList<Integer> list1){
        Scanner sc = new Scanner(System.in);
          for(int i = 0 ; i < list1.size() ; i++){
             if(list1.get(i)%2 != 0){
                System.out.print("Enter value you want to set on " + i + "th index = "  );
                list1.set(i , sc.nextInt());
             }
          }
          System.out.println("List after making odd numbers as  Even " + list1);
    }
    public static void addLists(ArrayList<Integer>lis1 ,ArrayList<Integer>lis2 , ArrayList<Integer>lis3 ){
        lis1.addAll(lis2);
        lis1.addAll(lis3);
    }

    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        for(int i = 0 ; i < 5 ; i++){
            System.out.print("Enter the valid value for list1 : ");
            list1.add(sc.nextInt());
        }
        System.out.println(list1);
        addElements(list1, 5);

    }
}
