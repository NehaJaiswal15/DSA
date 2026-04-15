import java.util.*;

public class printPattern{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        ArrayList<Integer> result = printPat(n);

        for(int i=0; i<result.size(); i++){
            System.out.print(result.get(i) + " ");
        }
    }
    public static ArrayList<Integer> printPat(int n){
        ArrayList<Integer> ans = new ArrayList<>();

        for(int i=n; i>=1; i--){
            for(int j = n; j>=1; j--){
                for(int k = 1; k<=i; k++){
                    ans.add(j);
                }
            }
            ans.add(-1);
        }
        return ans;
    }

}
