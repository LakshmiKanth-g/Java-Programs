//3.) Java program to find Fibonacci series upto a given number range

import java.util.Scanner;

class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int n1=0,n2=1,temp=0;
        
        for(int i=0;i<=num;i++){
            System.out.print(temp+" ");
            temp=n1+n2;
            n1=n2;
            n2=temp;
        }
    }
}