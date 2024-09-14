package BasicPrograms;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Make_first_num_lagest_by_swapping_number_from_second {

    /*Write a function that makes the first number as large as possible by swapping out
    its digits for digits in the second number.Each digit in the second number can only
    be used once.
    (523,76)->763
    (9132,5564)->9655
    (8732,91255)->9755
     */
    public long large(long a, long b){
        long num1=a;
        long num2=b;
        String str1=String.valueOf(num1);
        String str2=String.valueOf(num2);
        char[] arr1=str1.toCharArray();
        char[] arr2= str2.toCharArray();
        Arrays.sort(arr2);
        int k=arr2.length-1;
        for(int i=0;i<arr1.length;i++){
            for(int j=k;j>=0;j--){
                if (arr1[i]<arr2[j]){
                    arr1[i]=arr2[j];
                    k--;
                    break;
                }

            }

        }
        StringBuffer str=new StringBuffer();
        for(int i=0; i<arr1.length;i++) {
            str.append(arr1[i]);
        }

        return Long.parseLong(str.toString());


    }

    public static void main(String[] args) {
        Scanner scn =new Scanner(System.in);
        System.out.println("Enter num1: ");
        long a= scn.nextLong();
        System.out.println("Enter num2: ");
        long b= scn.nextLong();
        Make_first_num_lagest_by_swapping_number_from_second obj1= new Make_first_num_lagest_by_swapping_number_from_second();
        System.out.println(obj1.large(a,b));

    }

}
