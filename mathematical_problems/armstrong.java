import java.util.*;

public class armstrong{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        boolean result = armstrongNumber(n);

        if(result){
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
 

    static boolean armstrongNumber(int n) {
        // code here
        int original = n;
        int sum = 0;
         while(n>0){
             int digit = n%10;
             sum+= digit * digit * digit;
             n = n/10;
         }
         return sum == original;
    }
}
