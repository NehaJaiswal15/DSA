import java.util.*;

public class sortDescending {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String s = sc.nextLine();

        String result = sortDesc(s);

        System.out.println("Output: " + result);

        sc.close();
    }

    public static String sortDesc(String s) {

        int[] freq = new int[26];

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            freq[ch - 'a']++;
        }
        StringBuilder sb = new StringBuilder();

        for (int i = 25; i >= 0; i--) {

            while (freq[i] > 0) {
                sb.append((char)(i + 'a'));
                freq[i]--;
            }
        }

        return sb.toString();
    }
}