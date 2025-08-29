class Solution {
    public boolean isPalindrome(int x) {
        String str=String.valueOf(x);
        char[] array=str.toCharArray();
        String rev="";
        for(int i=array.length-1;i>=0;i--){
                rev=rev+array[i];
        }
        return rev.equals(str);
           
    }
}