class ArraySortedRotated{
    public static void main(String[] args){
        Solution sol=new Solution();
        int arr[]={3,4,5,1,2};
        System.out.println(sol.rotatedsorted(arr));
    }
}
class Solution{
    public boolean rotatedsorted(int nums[]){
        int count=0;
        int n=nums.length;
        for (int i=0;i<n;i++){
            if(nums[i]>nums[(i+1)%n]){
            count++;
            
        }}
        return count<=1;
    }

    
}