package BasicPrograms;

import java.util.Arrays;

public class BubbleSort {

    /*In bubble sort algorithm, array is traversed from first element to
    last element. Here, current element is compared with the next element.
    If current element is greater than the next element, it is swapped.
     */
    public static void main(String[] args) {
        int[] arr={10,11,3,5,76,45,87,23};
        int temp;
        for (int i=0; i< arr.length;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
