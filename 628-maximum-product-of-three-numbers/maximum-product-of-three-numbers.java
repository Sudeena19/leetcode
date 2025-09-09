class Solution {
    public int maximumProduct(int[] nums) {
        if(nums.length==3){
            return nums[0]*nums[1]*nums[2];
        }
        long max1 = Long.MIN_VALUE, max2 = Long.MIN_VALUE, max3 = Long.MIN_VALUE;
        long min1 = Long.MAX_VALUE, min2 = Long.MAX_VALUE;
        for(int v : nums){
            long n=v;
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

            if(n<min1){
                min2=min1;
                min1=n;
            }
            else if (n < min2) {
                min2 = n;
            }
        }
        long product1 = 1L*max1 * max2 * max3;   
        long product2 = 1L*min1 * min2 * max1;
        return (int) (product1 > product2 ? product1 : product2);
    }
}