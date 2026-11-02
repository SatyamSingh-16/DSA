import java.util.*;

class Solution {
    public String minWindow(String s, String t) {

        HashMap<Character, Integer> mapt = new HashMap<>();
        HashMap<Character, Integer> maps = new HashMap<>();

        for (int i = 0; i < t.length(); i++) {
            char ch = t.charAt(i);
            mapt.put(ch, mapt.getOrDefault(ch, 0) + 1);
        }

        int l = 0;
        int r = 0;

        int minLength = Integer.MAX_VALUE;
        int startIndex = 0;

        int formed = 0;
        int required = mapt.size();

        while (r < s.length()) {

            char ch = s.charAt(r);
            maps.put(ch, maps.getOrDefault(ch, 0) + 1);

            if (mapt.containsKey(ch) &&
                maps.get(ch).equals(mapt.get(ch))) {
                formed++;
            }
            while (formed == required) {
                if (r - l + 1 < minLength) {
                    minLength = r - l + 1;
                    startIndex = l;
                }

                char leftChar = s.charAt(l);
                if (mapt.containsKey(leftChar) &&
                    maps.get(leftChar).equals(mapt.get(leftChar))) {
                    formed--;
                }
                maps.put(leftChar, maps.get(leftChar) - 1);

                l++;
            }

            r++;
        }

        if (minLength == Integer.MAX_VALUE) {
            return "";
        }

        return s.substring(startIndex, startIndex + minLength);
    }
}