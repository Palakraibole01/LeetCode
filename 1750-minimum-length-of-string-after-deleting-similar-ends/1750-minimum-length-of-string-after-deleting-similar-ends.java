class Solution {
    public int minimumLength(String s) {
        int prefix = 0;
        int suffix = s.length()-1;
        
        while(prefix < suffix){
            if(s.charAt(prefix) != s.charAt(suffix))  break;

            if(s.charAt(prefix) == s.charAt(suffix)){
                char ch = s.charAt(prefix);

                while(prefix <= suffix && s.charAt(prefix) == ch){
                    prefix++;
                }
                while(suffix >= prefix && s.charAt(suffix) == ch){
                    suffix--;
                }
            }
        }
        return suffix - prefix + 1;
    }
}