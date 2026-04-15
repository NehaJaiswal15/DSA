import java.util.*;

public class getTable{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        ArrayList<Integer> result = getTable(n);

        for(int i=0; i<result.size(); i++){
            System.out.print(result.get(i) + " ");
        }
    }

    public static ArrayList<Integer> getTable(int n) {
        // code here
        ArrayList<Integer> ans = new ArrayList<>();
        
        for(int i=1; i<=10; i++){
            int res = (n*i);
            ans.add(res);
        }
        return ans;
    }
}