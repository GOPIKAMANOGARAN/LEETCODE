class MissingNumber{
    public static void main(String[] args){
        int arr[]={1,3,4,5,6,7};
        Solution sol=new Solution();
        System.out.println(sol.missingno(arr));
    }
}
class Solution{
    public int missingno(int nums[]){
        int n=nums.length+1;
        int expectedSum=(n*(n+1))/2;
        int actualSum=0;
        for(int i=0;i<nums.length;i++){
            actualSum+=nums[i];
        }
        int number=expectedSum-actualSum;
        return number;
    }
}
//if arr starts with 0 then n will be nums.length