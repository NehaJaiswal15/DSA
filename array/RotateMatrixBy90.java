class Solution {
    public void rotate(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        for(int i=0; i<m-2; i++){
            for(int j=i+1; j<n-1; j++){
                int[][] temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp[i][j];
            }
        }
        for(int i=0; i<m-1; i++){
            int p1 = 0, p2 = m-1;
            while(p1<p2){
                int temp = arr[p2];
                arr[p2] = arr[p1];
                arr[p1] = temp;
                p1++;
                p2--;
            }
        }
    }
}