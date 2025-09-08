class Solution {
    public int[] plusOne(int[] digits) {
        int n=digits.length;
        int i=n-1;
        while(i>=0){
            if(digits[i]<9){
                digits[i]++;
                return digits;
            }
            digits[i]=0;
            i--;
        }
        int[] result=new int[n+1];
        result[0]=1;
        return result;
    }
}