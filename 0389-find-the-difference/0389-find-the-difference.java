class Solution {
    public char findTheDifference(String s, String t) {
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i = 0;i<s.length();i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        char ch = 'a';
        for(int i = 0;i<t.length();i++){
            ch = t.charAt(i);
            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) - 1);

                if (map.get(ch) == 0) {
                    map.remove(ch);
                }
            }else{
                break;
            }
        }
        return ch;
    }
}