class Solution {
    public boolean isMonotonic(int[] nums) {
        return isMonotoneIncreasing(nums) || isMonotoneDecreasing(nums);
    }
    
    private boolean isMonotoneIncreasing(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < nums[i - 1]) {
                return false;
            }
        }
        return true;
    }
    
    private boolean isMonotoneDecreasing(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i - 1]) {
                return false;
            }
        }
        return true;
    }
}