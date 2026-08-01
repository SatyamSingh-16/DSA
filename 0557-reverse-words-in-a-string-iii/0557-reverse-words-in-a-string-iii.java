class Solution {
    public String reverseWords(String s) {
        String[] str = s.split(" ");
        // String[] revstr = new String[str.length];
        // for(int i = 0;i<str.length;i++){
        //     revstr[i] = str[str.length-i-1]; 
        // }
        for(int i = 0;i<str.length;i++){
            String rev = new StringBuilder(str[i]).reverse().toString();
            str[i] = rev;
        }
        return String.join(" ", str);
    }
}