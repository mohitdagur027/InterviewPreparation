package BasicPrograms;

public class Countofsecondhigestnumber {

        public static int getSecondHighestOccurrence(String input) {
            int highest = Integer.MIN_VALUE;
            int secondHighest = Integer.MIN_VALUE;

            // Find the highest and second-highest digits
            for (char c : input.toCharArray()) {
                int num = Character.getNumericValue(c);

                if (num > highest) {
                    secondHighest = highest;
                    highest = num;
                } else if (num > secondHighest && num < highest) {
                    secondHighest = num;
                }
            }

            // If there's no second-highest number, return 0
            if (secondHighest == Integer.MIN_VALUE) {
                return 0;
            }

            // Count occurrences of the second-highest number
            int count = 0;
            for (char c : input.toCharArray()) {
                if (Character.getNumericValue(c) == secondHighest) {
                    count++;
                }
            }

            return count;
        }

        public static void main(String[] args) {
            String input = "1234455";
            int result = getSecondHighestOccurrence(input);
            System.out.println("Occurrence of the second-highest number: " + result);
        }
    }


