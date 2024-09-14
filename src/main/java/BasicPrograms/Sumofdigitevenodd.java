package BasicPrograms;

import java.util.Scanner;

public class Sumofdigitevenodd {

    public static String sum(long num){
        long sum=0;
        while(num>0){
            sum=sum+num%10;
            num=num/10;
        }
        if(sum%2==0){
            return "Even";
        }else{
            return "Odd";
        }
    }



    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter a number");
        long num=scn.nextLong();
        System.out.println(sum(num));
    }
}
