package BasicPrograms;

import java.util.Scanner;

public class FinonacciSeries {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter the number");
        int num= scn.nextInt();
        int num1=0;
        System.out.println(num1);
        int num2=1;
        System.out.println(num2);
        for(int i=0;i<num-2;i++){
            int num3=num1+num2;
            System.out.println(num3);
            num1=num2;
            num2=num3;
        }
    }
}
