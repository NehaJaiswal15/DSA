import java.util.*;

class selection_sort{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        selectionSort(arr);

        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void selectionSort(int[] arr){

        int n = arr.length;

        for(int i=0; i<n; i++){
            int minIndex = i;

            for(int j=i+1; j<n; j++){
                if(arr[j] < arr[minIndex]){
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
}