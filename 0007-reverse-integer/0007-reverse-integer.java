class Solution {
    public int reverse(int x) {
        long temp;
        long s=0;
        long n=x;
        x=Math.abs(x);
        while(x!=0){
            temp=x%10;
            s=s*10+temp;
            x=x/10;
        }
        if(s>2147483647||s<-2147483648) return 0;
        if(n>0){
            return (int)s;
        }else{
            return (int)-s;
        }
    }
}