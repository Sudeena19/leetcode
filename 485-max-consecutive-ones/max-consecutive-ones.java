class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0, count = 0;
        for (int n : nums) {
            count = (n == 1) ? count + 1 : 0;
            if (count > max) max = count;
        }
        return max;
    }
}