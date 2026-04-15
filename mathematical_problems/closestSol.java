import java.util.*;

public class closestSol{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int result = closestNumber(n, m);

        System.out.print(result);
    }
    static int closestNumber(int n, int m) {
        int lower = (n/m)*m;
        int upper;
        
        if(n * m > 0){
            upper = lower + m;
        }else{
            upper = lower - m;
        }
        
        int diff1 = Math.abs(n - lower);
        int diff2 = Math.abs(n - upper);
        
        if(diff1 < diff2){
            return lower;
        }else if(diff1 > diff2){
            return upper;
        }else{
            return Math.abs(lower) > Math.abs(upper) ? lower: upper;
        }
    }
}
