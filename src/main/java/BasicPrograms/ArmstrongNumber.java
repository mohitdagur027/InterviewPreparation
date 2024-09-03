package BasicPrograms;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter a number");
        int num=scn.nextInt();
        String str=String.valueOf(num);
        int len=str.length();
        int sum=0;
        for(int i=0;i<len;i++){
            int a=0;
            int num1=1;
            if(a<len){
                num1=num1*str.charAt(i);
                a++;
            }
            sum=sum+num1;
        }
        System.out.println(sum);
        if(sum==num){
            System.out.println("Number is armstrong "+num);
        }
    }
}
