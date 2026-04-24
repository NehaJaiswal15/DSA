import java.util.*;

public class lcs{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int result = longestConsecutive(arr);

        System.out.println("Longest Consecutive Length: " + result);

        sc.close();
    }

    public static int longestConsecutive(int[] arr) {
        int n = arr.length;
        int count = 0;
        int maxLen = 0;
        
        HashSet<Integer> set = new HashSet<>();
        for(int i=0; i<n; i++){
            set.add(arr[i]);
        }
        
        for(int i=0; i<n; i++){
            int num = arr[i];
            
            if(!set.contains(num-1)){
                int curr = num;
                int len = 1;
                
                while(set.contains(curr+1)){
                    curr++;
                    len++;
                }
                
                if(len > maxLen){
                    maxLen = len;
                }
            }
        }
        return maxLen;
    }
}
