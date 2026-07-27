class Solution {
    public int numWays(String s) {
        int m = 1_000_000_007;
        int n = s.length();
        int sum = 0;
        for(int i = 0; i < n; i++){
            if(s.charAt(i) == '1'){
                sum++;
            }
        }
        
        if(sum % 3 != 0){
           return 0;
        }
       if(sum == 0){
    long ways = (long)(n - 1) * (n - 2) / 2;
    return (int)(ways % m);
}
        long firstZeros = 0 , secondZeros = 0 , avg = sum / 3, prefixOnes = 0;
        for(int i = 0; i < n; i++){
            char c = s.charAt(i);
            if(c == '1') prefixOnes++;
            else{
                if(prefixOnes == avg) firstZeros++;
                else if(prefixOnes == avg * 2) secondZeros++;
            }
        }
        return (int) ((firstZeros+1) * (secondZeros+1) % m);
    }
}