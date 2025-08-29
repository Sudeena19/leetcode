class Solution {
    public boolean isPalindrome(int x) {
        String str = String.valueOf(x);
        String rev = new StringBuilder(str).reverse().toString();
        return rev.equals(str);
    }
}
