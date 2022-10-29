class Solution {
    public String breakPalindrome(String str) {
        if(str.length() == 1)return "";
        for(int i = 0 ;  i < str.length() ; i++){
            if(str.charAt(i) != 'a'){
                StringBuilder sb = new StringBuilder(str);
                sb.setCharAt(i, 'a');
                if(!isPalindrome(sb.toString()))
                    return sb.toString();
            }
        }
        StringBuilder sb = new StringBuilder(str);
                sb.setCharAt(str.length()-1, 'b');
                return sb.toString();
    }
    public boolean isPalindrome(String str){
        int i  = 0 , j = str.length()-1;
        while(i < j){
            if(str.charAt(i++) != str.charAt(j--))return false;
        }
        return true;
    }
}