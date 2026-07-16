import java.util.*;

class SecondLargest{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int arr[] = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        int largest = Integer.MIN_VALUE;
        int secondLar = Integer.MIN_VALUE;

        for(int i=0; i<n; i++){
            if(arr[i] > largest){
                secondLar = largest;
                largest = arr[i];
            }
            if(arr[i] > secondLar && arr[i] != largest){
                secondLar = arr[i];
            }
        }

        if(secondLar == Integer.MIN_VALUE){
            System.out.println(-1);
        }

        System.out.println(secondLar);
    }
}