class Solution {
    public int thirdMax(int[] nums) {
        long largest=Long.MIN_VALUE;
        long Slargest=Long.MIN_VALUE;
        long Tlargest=Long.MIN_VALUE;
        for(int num:nums)
        {
            if(num>largest){
                Tlargest=Slargest;
                Slargest=largest;
                largest=num;
            }
            else if(num>Slargest && num!=largest){
                Tlargest=Slargest;
                Slargest=num;
            }
            else if(num>Tlargest && num!=Slargest && num!=largest){
                Tlargest=num;
            }
        }
        if(Tlargest==Long.MIN_VALUE){
            return (int)largest;
        }
        return (int)Tlargest;
    }
}