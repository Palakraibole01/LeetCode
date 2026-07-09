class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        List<Integer> maxCol = new ArrayList<>();
        List<Integer> minRow = new ArrayList<>();

        for(int i = 0; i < m; i++){
            int min = Integer.MAX_VALUE;
            for(int j = 0; j < n; j++){
                min = Math.min(min,matrix[i][j]);
            }
            minRow.add(min);
        }

        for(int i= 0;i < n ; i++){
            int max = Integer.MIN_VALUE;
            for(int j = 0; j < m; j++){
                max = Math.max(matrix[j][i],max);
            }
            maxCol.add(max);
        }

        List<Integer> res = new ArrayList<>();
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
               if(matrix[i][j] == minRow.get(i) && matrix[i][j] == maxCol.get(j)){
                res.add(matrix[i][j]);
               }
            }
        }
        return res;
    }
}