class Solution {
    public int removeDuplicates(int[] nums) {
        int size=nums.length;
        int ptr1=0;
        int ptr2=1;
        while(ptr2<size){
            if(nums[ptr1]==nums[ptr2]){
                for(int ind=ptr2;ind<size-1;ind++){
                    nums[ind]=nums[ind+1];
                }
                nums[--size]=0;
            }
            else{
                ptr1++;
                ptr2++;
            }
        }
        return size;
    }
}