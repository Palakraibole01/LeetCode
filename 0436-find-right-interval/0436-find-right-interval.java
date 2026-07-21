class Solution {
    public int[] findRightInterval(int[][] intervals) {
        int n = intervals.length;
        int[] ans = new int[n];

        int[][] starts = new int[n][2];
        for(int i = 0; i < n; i++){
            starts[i][0] = intervals[i][0];
            starts[i][1] = i;
        }

        Arrays.sort(starts , (a,b) -> a[0]-b[0]);
        for(int i = 0; i < n; i++){
            int idx = BinarySearch(starts, intervals[i][1]);
            if(idx == -1){
                ans[i] = -1;
            }else{
                ans[i] = starts[idx][1];
            }
        }
        return ans;
        
        }
        int BinarySearch(int[][] starts, int target){
            int start = 0;
            int end = starts.length - 1;
            int ans = -1;
            while(start <= end){
                int mid = start + (end - start) / 2;
                if(starts[mid][0] >= target){
                    ans = mid;
                    end = mid - 1;
                }else{
                    start = mid + 1;
                }
            }
             return ans;
        }
       
    }
