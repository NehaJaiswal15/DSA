import java.util.*;

public class printKthDigit{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int k = sc.nextInt();

        long result = kthDigit(a, b, k); // function call

        System.out.println(result);
    }

    static long kthDigit(int a, int b, int k){
        long num = 1;

        for(int i=0; i<b; i++){
            num *= a;
        }
        for(int i=1; i<k; i++){
            num = num/10;   //remove (k-1) digit
        }
        return num %10; //return kth digit
    } 
}