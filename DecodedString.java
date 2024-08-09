import java.util.Stack;

public class DecodedString {
    public static String decodeString(String s) {
        Stack<Integer> counts = new Stack<>();
        Stack<String> result = new Stack<>();
        String currentString = "";
        int count = 0;

        for (char ch : s.toCharArray()) {
            if (Character.isDigit(ch)) {
                count = count * 10 + (ch - '0');
            } else if (ch == '[') {
                counts.push(count);
                result.push(currentString);
                currentString = "";
                count = 0;
            } else if (ch == ']') {
                StringBuilder temp = new StringBuilder(result.pop());
                int repeatTimes = counts.pop();
                for (int i = 0; i < repeatTimes; i++) {
                    temp.append(currentString);
                }
                currentString = temp.toString();
            } else {
                currentString += ch;
            }
        }
        return currentString;
    }

    public static void main(String[] args) {
        String s1 = "3[a]2[bc]";
        System.out.println("Output for s = \"3[a]2[bc]\": " + decodeString(s1));

        String s2 = "3[a2[c]]";
        System.out.println("Output for s = \"3[a2[c]]\": " + decodeString(s2));
    }
}
