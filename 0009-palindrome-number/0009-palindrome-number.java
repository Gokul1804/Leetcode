class Solution {
    public boolean isPalindrome(int x) {
        int temp=0,s=x;
        if(x<0){
            return false;
        }
        while(s>0){
            temp=(temp*10)+(s%10);
            s=s/10;
        }
        if(temp==x){
            return true;
        }else{
            return false;
        }
    }
}