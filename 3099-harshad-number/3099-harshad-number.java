class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        int k=x,s=0;
        while(x!=0){
            s=s+x%10;
            x=x/10;
          
        }if(k%s==0){
            return s;
        }else{
            return -1;
        }
    }
}