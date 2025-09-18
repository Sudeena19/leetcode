class Solution {
    public boolean isMonotonic(int[] nums) {
        int x = 0;
        if (nums[0] < nums[nums.length - 1]) {
            for (int i = 0; i < nums.length - 1; i++) {
                if (nums[i] > nums[i + 1]) {
                    x += 1;
                    break;
                }
            }
        } else {
            for (int i = 0; i < nums.length - 1; i++) {
                if (nums[i] < nums[i + 1]) {
                    x += 1;
                    break;
                }
            }
        }
        if (x == 0)
            return true;
        else
            return false;
    }
}