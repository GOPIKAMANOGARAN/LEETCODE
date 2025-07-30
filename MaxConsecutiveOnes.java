class MaxConsecutiveOnes{
    public static void main(String[] args){
        int nums[]={1,2,1,1,3,1,1,1};
        Solution sol=new Solution();
        System.out.println(sol.maxOnes(nums));
    }
}
class Solution{
    public int maxOnes(int arr[]){
        int n=arr.length;
        int count=0;int maxi=0;
        for(int i=0;i<n;i++){
            if(arr[i]==1){
                count++;
                maxi=Math.max(count,maxi);
            }
            else{
                count=0;
            }
            
        }
        return maxi;
    }
}