//public class EquilibriumElementFinder {
//        public static int findEquilibriumElement(int[] arr) {
//            // Calculate the total sum of all elements in the array
//            int totalSum = 0;
//            for (int num : arr) {
//                totalSum += num;
//            }
//
//            // Initialize left sum
//            int leftSum = 0;
//
//            // Iterate through the array to find the equilibrium element
//            for (int i = 0; i < arr.length; i++) {
//                // Subtract the current element from the total sum to get the right sum
//                int rightSum = totalSum - leftSum - arr[i];
//
//                // Check if left sum equals right sum
//                if (leftSum == rightSum) {
//                    return arr[i]; // Equilibrium element found
//                }
//
//                // Update left sum for the next iteration
//                leftSum += arr[i];
//            }
//
//            // No equilibrium element found
//            return 0;
//        }
//
//        public static void main(String[] args) {
//            int[] arr1 = {1, 7, 5, 2, 6};
//            System.out.println("Output for [1, 7, 5, 2, 6]: " + findEquilibriumElement(arr1));
//
//            int[] arr2 = {10, 1, 1, 9};
//            System.out.println("Output for [10, 1, 1, 9]: " + findEquilibriumElement(arr2));
//        }

//public class AlternateWordReplacer {
//        public static void replaceAlternateWords(String input) {
//            // Convert the input string to character array
//            char[] chars = input.toCharArray();
//
//            // Initialize a flag to track alternate words
//            boolean replaceWord = false;
//
//            // Iterate through each character in the array
//            for (int i = 0; i < chars.length; i++) {
//                // Check if the current character is a dot
//                if (chars[i] == '.') {
//                    // Toggle the flag to indicate the next word should be replaced
//                    replaceWord = !replaceWord;
//                    continue;
//                }
//
//                // If the flag is true, replace the characters of the word with "xyz"
//                if (replaceWord) {
//                    chars[i] = 'xyz';
//                    // Skip the characters of the word until the next dot
//                    while (i < chars.length && chars[i] != '.') {
//                        i++;
//                    }
//                    // Adjust the index to point to the next character after the dot
//                    i--;
//                }
//            }
//
//            // Print the modified string
//            System.out.println(chars);
//        }
//
//        public static void main(String[] args) {
//            String input = "i.like.this.program.very.much";
//            replaceAlternateWords(input);
//        }
//    }

public class AlternateWordReplacer {
    public static void main(String[] args) {
        String input = "“i.like.this.program.very.much";

        String replacedString = replaceAlternateWords(input);
        System.out.println(replacedString);
    }

    public static String replaceAlternateWords(String input) {
        StringBuilder result = new StringBuilder();
        boolean replace = false;
        int start = 0;

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == '.') {
                String word = input.substring(start, i);
                if (replace) {
                    result.append("xyz");
                } else {
                    result.append(word);
                }
                result.append('.');
                replace = !replace;
                start = i + 1;
            }
        }

        // Append the last word if any
        if (start < input.length()) {
            String lastWord = input.substring(start);
            if (replace) {
                result.append("xyz");
            } else {
                result.append(lastWord);
            }
        } else {
            // Remove the last dot if present
            result.deleteCharAt(result.length() - 1);
        }

        return result.toString();
    }
}

//public class AlternateWordReplacement {
//    public static String replaceAlternateWords(String input) {
//        StringBuilder result = new StringBuilder();
//        boolean replace = false; // Flag to determine whether to replace or keep the word
//
//        int i = 0;
//        while (i < input.length()) {
//            // Find the start of the word
//            while (i < input.length() && !isAlphabet(input.charAt(i))) {
//                result.append(input.charAt(i));
//                i++;
//            }
//
//            StringBuilder word = new StringBuilder();
//
//            // Extract the word
//            while (i < input.length() && isAlphabet(input.charAt(i))) {
//                word.append(input.charAt(i));
//                i++;
//            }
//
//            // Replace alternate words
//            if (replace) {
//                result.append("abc");
//            } else {
//                result.append(word);
//            }
//
//            // Toggle the flag
//            replace = !replace;
//        }
//
//        return result.toString();
//    }
//
//    // Helper function to check if a character is an alphabet or dot
//    private static boolean isAlphabet(char c) {
//        return Character.isLetter(c) || c == '.';
//    }
//
//    public static void main(String[] args) {
//        String input = "“i.like.this.program.very.much";
//        String replacedString = replaceAlternateWords(input);
//        System.out.println(replacedString);
//    }
//}




