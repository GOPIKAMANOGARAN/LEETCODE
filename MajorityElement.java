//Boyer moore voting algorithm, time complexity=O(n), space complexity=O(1)

class MajorityElement{
    public static void main(String[] args){
        Solution sol=new Solution();
        int nums[]={1,2,3,2,2,3,2,2};
        System.out.println(sol.majorele(nums));
    }
}
class Solution{
    public int majorele(int nums[]){
        int n=nums.length;
        int cnt=0;
        int ele=0;
        for(int num:nums){
            if(cnt==0){
                cnt=1;
                ele=num;
            }
            else if(ele==num){
                cnt++;
            }
            else{
                cnt--;
            }
        }
        int cnt1=0;
        for(int num:nums){
            if(ele==num){
                cnt1++;
            }
        }
        if(cnt1>n/2){
            return ele;
        }
        return -1;
    }
}