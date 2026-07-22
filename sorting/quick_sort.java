import java.util.*;

class quick_sort{


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        // Input
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Sort
        quickSort(arr, 0, n - 1);

        // Output
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void quickSort(int[] arr, int low, int high){
        if(low < high){
            int pivotIdx = partition(arr, low, high);

            quickSort(arr, low, pivotIdx-1);
            quickSort(arr, pivotIdx, high);
        }
    }

    public static int partition(int[] arr, int low, int high){
        int pivot = arr[high];

        int i = low-1;

        for(int j=low; j<high; j++){
            if(arr[j] < pivot){
                i++;

                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;

        return i+1;
    }

}