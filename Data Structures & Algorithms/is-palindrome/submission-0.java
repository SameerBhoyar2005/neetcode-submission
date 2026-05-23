class Solution {
    public boolean isPalindrome(String s) {
        String c = s.replaceAll("[^a-zA-z0-9]","").toLowerCase();
        int left = 0;
        int right = c.length()-1;
        while(left<right){
            if(c.charAt(left) != c.charAt(right)){
                return false;
            }
            left ++;
            right --;
        }
        return true;
    }
}
