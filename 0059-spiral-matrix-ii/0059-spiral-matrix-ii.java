class Solution {
    public int[][] generateMatrix(int n) {
        int[][] spiral = new int[n][n];
        int top = 0 , bottom = n - 1;
        int left = 0 , right = n - 1;
        int num = 1;
        
        while(top <= bottom && left <= right){
            for(int i = left; i <= right; i++){
                spiral[top][i] = num++;
            }
            top++;

            for(int j = top; j <= bottom; j++){
                spiral[j][right] = num++;
            }
            right--;

            if(left <= right){
                for(int k = right; k >= left; k--){
                    spiral[bottom][k] = num++;
                }
                bottom--;
            }
            if(top <= bottom){
                for(int l = bottom; l >= top; l--){
                    spiral[l][left] = num++;
                }
                left++;
            }
        }
        return spiral;

    }
}