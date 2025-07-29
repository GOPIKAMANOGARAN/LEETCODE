
import java.util.Arrays;

class RotateArray{
    public static void main(String[] args){
        int nums[]={1,2,3,4,5,6,7};
        int k=3;
        Solution sol=new Solution();
        sol.rotate(nums,k);
        System.out.println(Arrays.toString(nums));
    }
}
class Solution{
    public void rotate(int nums[],int k){
        int n=nums.length;
        k=k%n;
        reverse(nums,0,n-1);
        reverse(nums,0,k-1);
        reverse(nums,k,n-1);
    }
    public void reverse(int arr[],int start, int end){
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;end--;
        }
    }

}
