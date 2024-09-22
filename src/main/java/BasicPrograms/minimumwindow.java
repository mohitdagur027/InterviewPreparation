package BasicPrograms;

import java.util.HashMap;

public class minimumwindow {
    public static void main(String[] args) {
        String s = "ddaaabbca";
        String t = "abc";
        int l = 0, r = 0, minlen = Integer.MAX_VALUE, count = 0;
        int firstindex = 0;
        HashMap<Character, Integer> map = new HashMap<>();

        // Build frequency map for characters in string t
        for (char c : t.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        // Sliding window approach
        while (r < s.length()) {
            // Expand the window to the right
            if (map.containsKey(s.charAt(r))) {
                int count3 = map.get(s.charAt(r));
                if (count3 > 0) {
                    count++;  // Increment count when a relevant character is added
                }
                map.put(s.charAt(r), count3 - 1); // Decrement the map value
            }

            // When we have a valid window containing all characters of t
            while (count == t.length()) {
                int len = r - l + 1;  // Adjusted for correct length calculation
                if (len < minlen) {
                    minlen = len;
                    firstindex = l; // Update the start index of the minimum window
                }

                // Shrink the window from the left
                if (map.containsKey(s.charAt(l))) {
                    int count2 = map.get(s.charAt(l));
                    map.put(s.charAt(l), count2 + 1); // Increment the map value
                    if (count2 >= 0) {
                        count--;  // Reduce count when a character is excluded from the window
                    }
                }
                l++; // Move left pointer to shrink window
            }

            r++; // Move right pointer to expand window
        }

        // If a valid window is found, print the minimum length and substring
        if (minlen == Integer.MAX_VALUE) {
            System.out.println("No valid window found");
        } else {
            System.out.println("Minimum window length: " + minlen);
            System.out.println("Substring: " + s.substring(firstindex, firstindex + minlen));
        }
    }
}
