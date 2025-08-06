//Dutch national flag problem , time complexity:O(n), space complexity:O(1);
import java.util.Arrays;

class SortColors{
    public static void main(String[] args){
        Solution sol=new Solution();
        int nums[]={0,2,0,2,1,1,0};
        sol.sortcolors(nums);
        System.out.println(Arrays.toString(nums));
    }
}
class Solution{
    public void sortcolors(int nums[]){
        int n=nums.length;
        int low=0;int mid=0;int high=n-1;
        while(mid<=high){
            if(nums[mid]==0){
                int temp=nums[low];
                nums[low]=nums[mid];
                nums[mid]=temp;
                low++;mid++;
            }
            else if(nums[mid]==1){
                mid++;
            }
            else{
                int temp=nums[mid];
                nums[mid]=nums[high];
                nums[high]=temp;
                high--;
            }
        }
    }
}