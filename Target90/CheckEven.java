// 1. Java program to Find Odd or Even number
import java.util.Scanner;
class CheckEven {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        if(num%2==0) 
            System.out.println("Even Number: "+num);
        else 
            System.out.println("Odd Number: "+num);
        sc.close();
    }
}
