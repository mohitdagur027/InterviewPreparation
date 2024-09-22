package BasicPrograms;

import java.util.HashMap;

public class LongestSubaaraywithsumequalsk {

    public static void main(String[] args) {
        int[] arr = {1, 2, -2, 4, -2, 5, 1, 3, 2};
        int k = 6;
        System.out.println("Length of the longest subarray: " + longestSubarrayWithSumK(arr, k));
    }

    public static int longestSubarrayWithSumK(int[] arr, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();  // Stores cumulative sum and its first occurrence index
        int sum = 0;  // Cumulative sum
        int maxLength = 0;  // To store the length of the longest subarray

        for (int r = 0; r < arr.length; r++) {
            sum += arr[r];  // Add current element to cumulative sum

            // If the cumulative sum equals k, update maxLength
            if (sum == k) {
                maxLength = r + 1;  // The subarray starts from index 0 to r
            }

            // If (sum - k) is found in the map, it means there exists a subarray
            // whose sum equals k. Update maxLength if needed.
            if (map.containsKey(sum - k)) {
                int start = map.get(sum - k);
                maxLength = Math.max(maxLength, r - start);
            }

            // Only store the sum if it's not already in the map
            // This ensures we capture the first occurrence of the sum because the size of that is smaal
            //and we have to subtract that from r
            if (!map.containsKey(sum)) {
                map.put(sum, r);
            }
        }

        return maxLength;
    }
}
