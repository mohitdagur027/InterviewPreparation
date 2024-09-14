package BasicPrograms;

import java.util.Arrays;

public class SelectionSort {
    /*Selection sort is a simple and efficient sorting algorithm that works
     by repeatedly selecting the smallest (or largest) element from the unsorted
     portion of the list and moving it to the sorted portion of the list.
     */
    public static void main(String[] args) {
        int[] arr={4,1,6,34,65,78,23};
        for(int i=0; i< arr.length-1;i++){
            int smallest=i;
            for(int j=i+1;j< arr.length;j++){
                if(arr[smallest]>arr[j]){
                    smallest=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[smallest];
            arr[smallest]=temp;
        }
        System.out.println(Arrays.toString(arr));

    }
}
