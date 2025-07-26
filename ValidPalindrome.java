class ValidPalindrome{
    public static void main(String[] args){
        Solution sol=new Solution();
        String s1="m,al,ay-ala M";
        System.out.println(sol.isPalindrome(s1));
    }
}

class Solution{
    public boolean isPalindrome(String s){
        s=s.replaceAll("[^A-Za-z0-9]","").toLowerCase();
        int left=0;
        int right=s.length()-1;
        while(left<right){
            if(s.charAt(left)!=s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}

