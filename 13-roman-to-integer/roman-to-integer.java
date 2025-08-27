class Solution {
    public int romanToInt(String s) {

        int total = 0;
        int n = s.length();
        for (int i = 0; i < n; i++) {
            int currentVal = 0;
            switch(s.charAt(i)) {
                case 'I': currentVal = 1; break;
                case 'V': currentVal = 5; break;
                case 'X': currentVal = 10; break;
                case 'L': currentVal = 50; break;
                case 'C': currentVal = 100; break;
                case 'D': currentVal = 500; break;
                case 'M': currentVal = 1000; break;
            }
            if (i < n - 1) {
                int nextVal = 0;
                switch(s.charAt(i + 1)) {
                    case 'I': nextVal = 1; break;
                    case 'V': nextVal = 5; break;
                    case 'X': nextVal = 10; break;
                    case 'L': nextVal = 50; break;
                    case 'C': nextVal = 100; break;
                    case 'D': nextVal = 500; break;
                    case 'M': nextVal = 1000; break;
                }

                if (currentVal < nextVal) {
                    total -= currentVal;
                    continue;
                }
            }
            total += currentVal;
        }
        return total;
    }
}