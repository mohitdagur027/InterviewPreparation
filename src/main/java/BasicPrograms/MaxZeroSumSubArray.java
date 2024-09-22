package BasicPrograms;

import java.util.HashMap;

public class MaxZeroSumSubArray {

    // Function to find the largest subarray with sum 0
    public static void findMaxZeroSumSubarray(int[] arr) {
        // HashMap to store the cumulative sum and the corresponding index
        HashMap<Integer, Integer> sumMap = new HashMap<>();

        int maxLength = 0;  // To store the length of the maximum subarray
        int start = -1;     // To store the start index of the maximum subarray
        int end = -1;       // To store the end index of the maximum subarray
        int cumulativeSum = 0;  // Initialize cumulative sum

        // Traverse through the array
        for (int i = 0; i < arr.length; i++) {
            cumulativeSum += arr[i];

            // If cumulativeSum is 0, we found a subarray from 0 to i
            if (cumulativeSum == 0) {
                maxLength = i + 1;
                start = 0;
                end = i;
            }

            // If cumulativeSum has been seen before, it means the subarray between
            // the previous index and current index has a sum of 0
            if (sumMap.containsKey(cumulativeSum)) {
                int prevIndex = sumMap.get(cumulativeSum);

                if (i - prevIndex > maxLength) {
                    maxLength = i - prevIndex;
                    start = prevIndex + 1;
                    end = i;
                }
            } else {
                // Store the cumulative sum and index in the map
                sumMap.put(cumulativeSum, i);
            }
        }

        // Print the result
        if (start != -1 && end != -1) {
            System.out.println("Maximum subarray with sum 0 is found between indices " + start + " and " + end);
            System.out.print("Subarray: ");
            for (int i = start; i <= end; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        } else {
            System.out.println("No subarray with sum 0 found.");
        }
    }

    public static void main(String[] args) {
        int[] arr = {3, 4, -7, 1, 3, 3, 1, -4, -2, -2};
        findMaxZeroSumSubarray(arr);
    }
}
