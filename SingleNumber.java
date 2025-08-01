class SingleNumber{
    public static void main(String[] args) {
        Solution sol=new Solution();
        int arr[]={1,2,2,3,3,4,4};
        System.out.println(sol.SingleOccur(arr));
    }
}
class Solution{
    public int SingleOccur(int arr[]){
        int n=arr.length;
        int xor=0;
        for(int i=0;i<n;i++){
            xor=xor^arr[i];
        }
        return xor;
    }
}