class Solution {
    public int lengthOfLastWord(String s) {
        String[] parts = s.trim().split(" ");
        String lastWord = parts[parts.length - 1];

        return lastWord.length();
    }
    
}