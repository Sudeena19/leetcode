class Solution {
    public int maximumProduct(int[] nums) {
        if(nums.length==3){
            return nums[0]*nums[1]*nums[2];
        }
        int min1 = Integer.MAX_VALUE, min2 = Integer.MAX_VALUE;
        int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE, max3 = Integer.MIN_VALUE;
        for(int n : nums){
            if (n>=max3) {
                if(n>max1){
                    max3=max2;
                    max2=max1;
                    max1=n;
                }
                else if(n>max2){
                    max3=max2;
                    max2=n;
                }
                else if(n>max3){
                    max3=n;
                }
            }
            if(n<=min2){
                if(n<min1){
                    min2=min1;
                    min1=n;
                }
                else if (n < min2) {
                    min2 = n;
                }
            }
        }
        long product1 = 1L*max1 * max2 * max3;   
        long product2 = 1L*min1 * min2 * max1;
        return (int) (product1 > product2 ? product1 : product2);
    }
}