class Solution {
    public int romanToInt(String s) {
        int res = 0, prev = 0;
        
        for (int i = s.length() - 1; i >= 0; i--) {
            int curr = value(s.charAt(i));
            
            if (curr < prev) res -= curr;
            else res += curr;
            
            prev = curr;
        }
        
        return res;
    }
    
    private int value(char c) {
        if (c == 'I') return 1;
        if (c == 'V') return 5;
        if (c == 'X') return 10;
        if (c == 'L') return 50;
        if (c == 'C') return 100;
        if (c == 'D') return 500;
        return 1000; 
    }
}