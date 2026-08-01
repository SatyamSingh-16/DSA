class Solution {
    public String reverseWords(String s) {

        String[] str = s.trim().split("\\s+");
        String[] revstr = new String[str.length];

        for (int i = 0; i < str.length; i++) {
            revstr[i] = str[str.length - i - 1];
        }

        return String.join(" ", revstr);
    }
}