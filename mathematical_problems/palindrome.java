import java.util.*;

class palindrome{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int original = n;

        int rev = 0;
        while(n != 0){
            int temp = n%10;
            rev = rev*10+ temp;
            n = n/10;
        }

        if(rev == original){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not Plaindrome");
        }
    }
}