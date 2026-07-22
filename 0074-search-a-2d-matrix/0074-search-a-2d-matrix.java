class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;

        int start = 0;
        int end = m * n - 1;

        while(start <= end){
            int mid = start + (end - start) / 2;
            int row = mid / n;
            int col = mid % n;
            int newmid = matrix[row][col];

            if(target == newmid){
                return true;
            }
            else if(target < newmid){
                end = mid - 1;
            }else{
                start = mid + 1;
            }
           
        }
        return false;
    }
   
        
    
}