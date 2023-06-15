import java.util.*;
public class First {
    public static void main(String[] args){
        System.out.println("Write any number :");
        Scanner sc = new Scanner(System.in);
        // this function is for inputting strings only: Int num1 = sc.nextLine();
        int num1 = sc.nextInt();
        System.out.println("This is the number : " + num1);
        if (num1 % 2 == 0){
            System.out.println("The number is even");
        }
        else {
            System.out.println("The number is odd");
        }
         
    }
}