class Solution {
    public void solve(List<List<Integer>> result, List<Integer> list, int  [] nums, int remain, int start) {
        if (remain < 0) {
            return;
        }
        else if(remain == 0) {
            result.add(new ArrayList<>(list));
        }
        else {
            for (int i = start; i < nums.length; i++) {
                if (i > start && nums[i] == nums[i - 1]){
                    continue;
                }
                list.add(nums[i]);
                solve(result, list, nums, remain - nums[i], i + 1);
                list.remove(list.size() - 1);
            }
        }
    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(candidates);
        solve(result, new ArrayList<>(), candidates, target, 0);
        return result;
    }
}