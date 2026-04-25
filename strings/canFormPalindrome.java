import java.util.*;

public class canFormPalindrome{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String s = sc.nextLine();

        boolean result = canFormPalindrome(s);

        if (result) {
            System.out.println("Yes, can be rearranged into a palindrome");
        } else {
            System.out.println("No, cannot be rearranged into a palindrome");
        }

        sc.close();
    }

    public static boolean canFormPalindrome(String s) {

        int[] freq = new int[26];

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            freq[ch - 'a']++;
        }

        int oddCount = 0;

        for (int i = 0; i < 26; i++) {
            if (freq[i] % 2 != 0) {
                oddCount++;
            }
        }
        return oddCount <= 1;
    }
}