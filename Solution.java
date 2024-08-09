//public class MinLengthAfterOperations {
//    public static int minLengthAfterOperations(String s) {
//        int n = s.length();
//        int minLength = n;
//
//        // Iterate through all characters in 's'
//        for (int i = 0; i < n; i++) {
//            // Find the longest prefix of the same characters
//            int prefixLength = 1;
//            while (i + prefixLength < n && s.charAt(i + prefixLength) == s.charAt(i)) {
//                prefixLength++;
//            }
//
//            // Find the longest suffix of the same characters
//            int suffixLength = 1;
//            while (i - suffixLength >= 0 && s.charAt(i - suffixLength) == s.charAt(i)) {
//                suffixLength++;
//            }
//
//            // Calculate the minimum length after performing the operation for the current character
//            int newLength = n - (prefixLength + suffixLength - 1);
//            minLength = Math.min(minLength, newLength);
//        }
//
//        return minLength;
//    }
//
//    public static void main(String[] args) {
//        String s1 = "ca";
//        System.out.println("Output for s = \"ca\": " + minLengthAfterOperations(s1));
//
//        String s2 = "aabccabba";
//        System.out.println("Output for s = \"aabccabba\": " + minLengthAfterOperations(s2));
//    }

//public class MinimumLengthAfterOperations {
//    public static int minLenAfterOperations(String s) {
//        int n = s.length();
//        int minLen = n; // Initialize the minimum length to the length of the original string
//
//        // Iterate through each character in the string
//        for (int i = 0; i < n; i++) {
//            // Find the longest prefix and suffix of the same character at index i
//            int j = i;
//            while (j < n && s.charAt(j) == s.charAt(i)) {
//                j++;
//            }
//            int prefixLen = j - i; // Length of the prefix
//
//            int k = n - 1;
//            while (k >= 0 && s.charAt(k) == s.charAt(i)) {
//                k--;
//            }
//            int suffixLen = n - 1 - k; // Length of the suffix
//
//            // Calculate the remaining length after removing the prefix and suffix
//            int remainingLen = n - prefixLen - suffixLen;
//
//            // Update the minimum length
//            minLen = Math.min(minLen, remainingLen);
//
//            // Move the pointer to the end of the suffix to avoid unnecessary iterations
//            i = k;
//        }
//
//        return minLen;
//    }
//
//    public static void main(String[] args) {
//        String s1 = "ca";
//        System.out.println("Output for s = \"ca\": " + minLenAfterOperations(s1));
//
//        String s2 = "aabccabba";
//        System.out.println("Output for s = \"aabccabba\": " + minLenAfterOperations(s2));
//    }
//}

class Solution {
    public static int minimumLength(String s) {
        int left = 0, right = s.length() - 1;
        while (left < right) {
            char leftChar = s.charAt(left), rightChar = s.charAt(right);
            if (leftChar != rightChar)
                return s.length();
            while (left < right && s.charAt(left) == leftChar)
                left++;
            if (left == right)
                return 0;
            while (left < right && s.charAt(right) == rightChar)
                right--;
        }
        return right - left + 1;
    }

    public static void main(String[] args) {
        String s1 = "ca";
        System.out.println("Output for s = \"ca\": " + minimumLength(s1));

        String s2 = "aabccabba";
        System.out.println("Output for s = \"aabccabba\": " + minimumLength(s2));
    }
}



