class Solution {
    public boolean checkPalindromeFormation(String a, String b) {
        return validate(a,b) || validate(b,a);
    }
    private boolean validate(String a, String b){
        int start = 0, end = a.length() - 1;
        while(start < end){
            if(a.charAt(start) != b.charAt(end)){
                break;
               
            }  
             start++;
                end--;
        }
        return validate(a, start, end) || validate(b, start, end);
    }
    private boolean validate(String a, int start, int end){
        while(start < end){
            if(a.charAt(start) != a.charAt(end)){
                break;
               
            }
             start++;
                end--;
        }
        return start >= end;
    }
}