package BasicPrograms;

import java.util.Scanner;

public class NumberOFSquares {

    /*Write a function that determines the number of square integer within
    a given range, inclusive of the end points
    (3,9)->2
    (1,100000000)->31622
    (17,24)->0
     */

    public int squarecount(int num1, int num2){
        int count=0;
        for(int i=num1;i<=num2;i++){
            if(i>0){
                int root=(int) Math.sqrt(i);
                if(root*root==i){
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner scn=new Scanner((System.in));
        System.out.println("Enter first number");
        int num1=scn.nextInt();
        System.out.println("Enter second number");
        int num2=scn.nextInt();
        NumberOFSquares obj1=new NumberOFSquares();
        System.out.println(obj1.squarecount(num1,num2));

    }
}
