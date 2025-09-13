class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int max = 1; 
        int idx = 0; 

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] <= nums[i - 1]) {
                max = Math.max(max, i - idx);
                idx = i;
            }
        }
        return Math.max(nums.length - idx, max);
    }
}