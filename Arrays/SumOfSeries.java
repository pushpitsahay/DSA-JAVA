// Write a program to find the sum of the given series 1+2+3+ . . . . . .(N terms) 
import java.util.Scanner;
public class SumOfSeries{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=sc.nextInt();
        int sum=0;
        for(int i=0; i<=n; i++){
            sum=sum+i;
        }
        System.out.println(sum);
    }
}