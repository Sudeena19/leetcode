class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs==null || strs.length==0) return "";
        
        for(int i=0; i<strs.length;i++){
            for(int j=0;j<strs.length-i-1;j++){
                if (strs[j].compareTo(strs[j + 1]) > 0) {
                    String temp=strs[j];
                    strs[j]=strs[j+1];
                    strs[j+1]=temp;
                }
            }
        }

        String first=strs[0];
        String last=strs[strs.length-1];
        int i=0;
        while(i<first.length() && i<last.length() && first.charAt(i)==last. charAt(i)){
            i++;
        }
        return first.substring(0,i);

        
    }
}