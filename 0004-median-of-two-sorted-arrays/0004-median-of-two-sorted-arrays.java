class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] combined = new int[nums1.length + nums2.length];
        System.arraycopy(nums1, 0, combined, 0, nums1.length);
        System.arraycopy(nums2, 0, combined, nums1.length, nums2.length);
        Arrays.sort(combined);

        int size = combined.length;
        if (size % 2 == 0) {
            return (combined[size / 2 - 1] + combined[size / 2]) / 2.0;
        } else {
            return combined[size / 2];
        }
    }
}