class Solution {
    public String reverseWords(String s) {
        String[] a = s.split(" ");
        StringBuilder result = new StringBuilder();
        for(int i = 0; i < a.length; i++){
            StringBuilder sb = new StringBuilder(a[i]);
            result.append(sb.reverse());
            if(i < a.length - 1){
                result.append(" ");
            }
        } 
        return result.toString();
    }
}