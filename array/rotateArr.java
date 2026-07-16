import java.util.*;

class rotateArr{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int d = sc.nextInt();

        int[] arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        d = d%n;
        rev(arr, 0, d-1);
        rev(arr, d, n-1);
        rev(arr, 0, n-1);

        System.out.println(Arrays.toString(arr));
    }

    public static void rev(int[] arr, int first, int last){
        while(first < last){
            int temp = arr[first];
            arr[first] = arr[last];
            arr[last] = temp;

            first++;
            last--;
        }
    }
}