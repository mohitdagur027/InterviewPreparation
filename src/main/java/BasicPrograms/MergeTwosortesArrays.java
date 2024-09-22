package BasicPrograms;

import java.util.Arrays;

public class MergeTwosortesArrays {
    public static void main(String[] args) {
        int[] arr1={2,4,7,8,11,34,67};
        int[] arr2={1,4,6,12,45,64};
        int len1= arr1.length;
        int len2=arr2.length;
        int[] mergedarray=new int[len1+len2];

        int i=0,j=0,k=0;
        while(i<len1 && j<len2){
            if(arr1[i]<arr2[j]){
                mergedarray[k]=arr1[i];
                i++;
            }else{
                mergedarray[k]=arr2[j];
                j++;
            }
            k++;
        }

        while(i<len1){
            mergedarray[k]=arr1[i];
            i++;
            k++;
        }

        while(j<len2){
            mergedarray[k]=arr1[j];
            j++;
            k++;
        }

        System.out.println(Arrays.toString(mergedarray));
    }
}
