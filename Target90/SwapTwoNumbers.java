//4.) Java program to swap two numbers without using third variable
import java.util.Scanner;

public class SwapTwoNumbers {
    public static void main (String[] args){

        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        System.out.println("Before swap: "+num1);
        System.out.println("Before swap: "+num2);
        
        num1=num1+num2;
        num2=num1-num2;
        num1=num1-num2;
        
        System.out.println("After swap: "+num1);
        System.out.println("After swap: "+num2);
    }
}
