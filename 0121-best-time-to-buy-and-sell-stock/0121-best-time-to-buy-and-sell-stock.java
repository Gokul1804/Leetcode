class Solution {
    public int maxProfit(int[] arr) {
        int max=0,profit=0,min=arr[0];
        int n=arr.length;
        int i;
        for(i=0;i<=n-1;i++){
            if(min>arr[i]){
                min=arr[i];
            }
            profit=arr[i]-min;
            if(max<profit){
                max=profit;
            }
        }
        return max;
    }
}