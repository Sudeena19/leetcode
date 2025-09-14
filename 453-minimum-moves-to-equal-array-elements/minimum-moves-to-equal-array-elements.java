class Solution {
    public int minMoves(int[] nums) {
        int min = Integer.MAX_VALUE;
        int sum = 0;
        
        for (int num : nums) {
            sum += num;
            if (num < min) {
                min = num;
            }
        }
        
        return sum - nums.length * min;
    }
}
