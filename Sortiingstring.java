import java.util.Arrays;
import java.util.Scanner;

public class Sortiingstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a string : ");
        String str = sc.nextLine();
        char charArray[] = str.toCharArray();
        Arrays.sort(charArray);
        System.out.println(new String(charArray));
    }
}
