class Solution {
    public boolean validPalindrome(String s) {
        return isPalindrome(s,0,s.length()-1,false);
    }
    public boolean isPalindrome(final String s,int low,int high,final boolean isChardeleted){
        while(low<high){
            if(s.charAt(low)!=s.charAt(high)){
                if(isChardeleted){
                    return false;
                }
                return isPalindrome(s,low+1,high,true)||isPalindrome(s,low,high-1,true);
            }
            low++;
            high--;
        }
        return true;
    }
}