import java.util.Arrays;
class FrequencyElement{
    public static void main(String[] args){
        Solution sol=new Solution();
        int arr[]={1,2,4};
        int n=5;
        System.out.println(sol.frequency(arr,n));
    }
}
class Solution{
    public int frequency(int nums[], int k){
        int left=0;
        int right=0;
        int result=0;
        long total=0;
        Arrays.sort(nums);
        for(right=0;right<nums.length;right++){
            total=total+nums[right];
            while(k<(long)nums[right]*(right-left+1)-total){
                total=total-nums[left];
                left++;
            }
            result=Math.max(result,right-left+1);
        }
        return result;
    }
}