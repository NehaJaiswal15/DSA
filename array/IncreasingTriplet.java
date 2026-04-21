import java.util.*;

public class IncreasingTriplet{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // input size
        int n = sc.nextInt();
        int[] arr = new int[n];

        // input array
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        ArrayList<Integer> result = find3Numbers(arr);

        // print result
        if(result.size() == 0){
            System.out.println("No such triplet found");
        } else {
            for(int num : result){
                System.out.print(num + " ");
            }
        }
    }

    public static ArrayList<Integer> find3Numbers(int[] arr) {
        // code here
        int n = arr.length;
        
        int[] leftMin = new int[n];
        int[] RightMax = new int[n];
        
        int minIdx = 0;
        leftMin[0] = -1;
        
        for(int i=1; i<n; i++){
            if(arr[i] <= arr[minIdx]){
                minIdx = i;
                leftMin[i] = -1;
            }else{
                leftMin[i] = minIdx;
            }
        }
        
        int maxIdx = n-1;
        RightMax[n-1] = -1;
        
        for(int i=n-2; i>=0; i--){
            if(arr[i] >= arr[maxIdx]){
                maxIdx = i;
                RightMax[i] = -1;
            }else{
                RightMax[i] = maxIdx;
            }
        }
        for(int i=0; i<n; i++){
            if(leftMin[i] != -1 && RightMax[i] != -1){
                ArrayList<Integer> res = new ArrayList<>();
                res.add(arr[leftMin[i]]);
                res.add(arr[i]);
                res.add(arr[RightMax[i]]);
                return res;
            }
        }
        return new ArrayList<>();
    }
}