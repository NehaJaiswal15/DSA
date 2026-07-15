import java.util.*;

class factorial{

    public static int factorial(int n){
        if(n == 0||n == 1){
            return 1;
        }

        return n * factorial(n-1);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
                                                    //Solution obj = new Solution();
        int num = sc.nextInt();

        int ans = factorial(num);                   // int ans = obj.factorial(num);
        System.out.println(ans);
    }
}