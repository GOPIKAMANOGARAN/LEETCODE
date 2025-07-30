
import java.util.Arrays;

class MoveZeroes{
    public static void main(String[] args){
        Solution sol=new Solution();
        int arr[]={1,0,3,0,5};
        sol.moveZeroes(arr);
        System.out.println(Arrays.toString(arr));
    }
}
class Solution{
    public void moveZeroes(int nums[]){
        int n=nums.length;
        int left=0;
        for(int right =0;right<n;right++){
            while(nums[right]!=0){
                 int temp=nums[right];
                 nums[right]=nums[left];
                 nums[left]=temp;
                 left++;
            }
           
        }
    }
}