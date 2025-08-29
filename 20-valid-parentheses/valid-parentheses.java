class Solution {
    public boolean isValid(String s) {
        if(s.length()%2!=0) return false;
        char[] array=new char[s.length()];
        int top=-1;
        for(char ch:s.toCharArray()){
            if(ch=='(' || ch=='[' || ch=='{'){
                array[++top]=ch;
            }
            else{
                if(top==-1) return false;
                char last=array[top--];
                if ((ch == ')' && last != '(') ||
                    (ch == ']' && last != '[') ||
                    (ch == '}' && last != '{')) {
                    return false;
                }
            }
        }
        return top==-1; 
    }
}