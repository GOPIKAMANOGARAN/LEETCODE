class FibonacciNumber{
    public static void main(String args[]){
        Solution sol=new Solution();
        int y=8;
        System.out.println(sol.fib(y));
    }
}
class Solution{
    public int fib(int n){
        if(n==0) return 0;
        if(n==1) return 1;
        int a=0,b=1,temp=0;
        for(int i=2;i<=n;i++){
            temp=a+b;
            a=b;b=temp;
        }
        return temp;
    }
}