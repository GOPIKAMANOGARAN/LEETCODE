import java.util.Arrays;
import java.util.HashMap;
class TwoSum{
    public static void main(String[] args) {
        Solution sol=new Solution();
        int nums[]={1,2,3,4,7};
        int target=6;
       /*int result[]=sol.twoNum(nums,target);
        System.out.println(result[0]+" "+result[1]);
        for(int j=0;j<result.length;j++){
            System.out.println(result[j]);
        }*/
        System.out.println(Arrays.toString(sol.twoNum(nums,target)));
    }
}
class Solution{
    public int[] twoNum(int nums[],int target){
        int n=nums.length;
        HashMap<Integer,Integer> mpp=new HashMap<>();
        int arr[]=new int[2];
        arr[0]=arr[1]=-1;
        for(int i=0;i<n;i++){
            int res=target-nums[i];
            if(mpp.containsKey(res)){
                arr[0]=mpp.get(res);
                arr[1]=i;
                return arr;
            }
            mpp.put(nums[i],i);
        }
        return arr;
    }
}