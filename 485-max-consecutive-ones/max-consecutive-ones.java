class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max=0;
        int l=0;
        int r=0;
        int n=nums.length;

        while(r<n)
        {
            if(nums[r]==0)
            {
                int len=r-l;
                max=Math.max(max,len);
                l=r+1;
            }
            r++;
        }

        max=Math.max(max,r-l);

        return max;
    }
}