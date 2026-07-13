class Solution {
    public int romanToInt(String s) {
        int res = 0;
        for(int i = 0; i < s.length() - 1; i++){
            if(valueOf(s.charAt(i)) < valueOf(s.charAt(i+1))){
                res -= valueOf(s.charAt(i));
            }else{
                res += valueOf(s.charAt(i));
            }
            
        }
        return res + valueOf(s.charAt(s.length() - 1));
    }
    private int valueOf(char c){
        switch(c){
            case 'I' : return 1;
            case 'V' : return 5;
            case 'X' : return 10;
            case 'L' : return 50;
            case 'C' : return 100;
            case 'D' : return 500;
            case 'M' : return 1000;
            default : return 0;
        }
    }
}