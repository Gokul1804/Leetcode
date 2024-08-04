import java.util.*;

class Solution {
    private void solve(int[] nums, List<List<Integer>> result, List<Integer> tempList, boolean[] used) {
        if (tempList.size() == nums.length) {
            result.add(new ArrayList<>(tempList));
        } else {
            for (int i = 0; i < nums.length; i++) {
                if (used[i] || (i > 0 && nums[i] == nums[i - 1] && !used[i - 1])) continue;
                used[i] = true;
                tempList.add(nums[i]);
                solve(nums, result, tempList, used);
                used[i] = false;
                tempList.remove(tempList.size() - 1);
            }
        }
    }

    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        solve(nums, result, new ArrayList<>(), new boolean[nums.length]);
        return result;
    }
}
