class Solution {
    public boolean validPalindrome(String s) {
        if(s.isEmpty()){
            return true;
        }
        int start = 0;
        int last = s.length() - 1;
        while(start < last){
            if(s.charAt(start) == s.charAt(last)){
                start++;
                last--;
            }
            else{
                return checkPalin(s,start+1,last) || checkPalin(s,start,last-1);
            }
            
        }
        return true;
    }
    boolean checkPalin(String s, int start, int last){
        while(start < last){
            if(s.charAt(start++) != s.charAt(last--)){
                return false;
            }
        }
        return true;
    }
}