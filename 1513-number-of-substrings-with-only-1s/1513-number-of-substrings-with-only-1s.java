class Solution {
    public int numSub(String s) {
        final int mod = 1000000007;
        long ans = 0;
        int count = 0;

        for(char c : s.toCharArray()){
            if(c == '1'){
                count++;
            }
            else{
                ans += (long) count * (count + 1) /2;
                count = 0;
            }
        }
        ans += (long) count * (count + 1) / 2;
        return (int) (ans % mod);
    }
}