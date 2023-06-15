import java.util.*;
public class First {
    public static void main(String[] args){
        System.out.println("Write any number :");
        Scanner sc = new Scanner(System.in);
        // this function is for inputting strings only: Int num1 = sc.nextLine();
        float num1 = sc.nextFloat();
        System.out.println("This is the number : " + num1);
        float  sum  = num1 % 3;
        
        if (sum == 0){
            System.out.println("The number is divisible by 3");
        }
        else {
            System.out.println("The number is not divisible by 3");
        }
         
    }
}