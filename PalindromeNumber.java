class PalindromeNumber{
    public static void main(String[] args) {
        Solution sol=new Solution();
        int x1=121;
        System.out.println(sol.isPalindrome(x1));
    }}
class Solution{
    public boolean isPalindrome(int x){
        if(x<0 || (x!=0 && x%10==0)){
            return false;
        }
        int rev=0;
        while(x>rev){
            int last=x%10;
            rev=(rev*10)+last;
            x=x/10;
        }
        return(x==rev || rev/10==x);
    }
}


class Solution{
    public boolean isPalindrome(int x){
        if (x<0) return false;

        String str=Integer.toString(x);
        int left=0;
        int right=str.length()-1;
        while(left<right){
            if(str.charAt(left)!=str.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
          
    }
}