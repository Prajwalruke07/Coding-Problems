public class SubsequenceChecker {
    public static boolean isSubsequence(String s, String t) {
        int sPointer = 0; // Pointer for string s
        int tPointer = 0; // Pointer for string t

        // Iterate through both strings
        while (sPointer < s.length() && tPointer < t.length()) {
            // If characters match, move pointer for s
            if (s.charAt(sPointer) == t.charAt(tPointer)) {
                sPointer++;
            }
            // Move pointer for t
            tPointer++;
        }

        // If sPointer reaches the end of s, it means all characters of s have been found in order in t
        return sPointer == s.length();
    }

    public static void main(String[] args) {
        String s1 = "abc", t1 = "ahbgdc";
        System.out.println("Output for s = \"abc\", t = \"ahbgdc\": " + isSubsequence(s1, t1));

        String s2 = "axc", t2 = "ahbgdc";
        System.out.println("Output for s = \"axc\", t = \"ahbgdc\": " + isSubsequence(s2, t2));

        String s3 = "agb", t3 = "ahbgdc";
        System.out.println("Output for s = \"agb\", t = \"ahbgdc\": " + isSubsequence(s3, t3));
    }
}

