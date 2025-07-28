class RemoveDuplicates{
    public static void main(String[] args) {
        Solution sol=new Solution();
        int arr[]={1,1,2,3,3,4};
        System.out.println(sol.originalCount(arr));
    }
}
class Solution{
    public int originalCount(int nums[]){
        int i=0;
        for(int j=1;j<nums.length;j++){
            if(nums[i]!=nums[j]){
                i++;
                nums[i]=nums[j];
            }
        }
        return i+1;
    }
}