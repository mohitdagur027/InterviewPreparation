package BasicPrograms;

import java.util.Arrays;

public class InsertionSort {
    /*
    Insertion sort is a simple sorting algorithm that works by building a
    sorted array one element at a time. It is considered an ” in-place ” sorting
     algorithm, meaning it doesn’t require any additional memory space beyond the
      original array.

To achieve insertion sort, follow these steps:

We start with second element of the array as first element in the array is assumed
to be sorted.
Compare second element with the first element and check if the second element is
smaller then swap them.
Move to the third element and compare it with the second element, then the first
element and swap as necessary to put it in the correct position among the first three
elements.
Continue this process, comparing each element with the ones before it and swapping as
needed to place it in the correct position among the sorted elements.
Repeat until the entire array is sorted
     */

    public static void main(String[] args) {
        int[] arr={34,54,26,78,64,96,35,22};
        int temp;
        for(int i=0;i<arr.length-1;i++){
            while(i>=0 && arr[i]>arr[i+1]){
                temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
                i--;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
