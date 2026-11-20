
class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> ans = new ArrayList<>();
        if (digits.length() == 0) {
            return ans;
        }

        String[] mapping = {
            "", "", "abc", "def", "ghi",
            "jkl", "mno", "pqrs", "tuv", "wxyz"
        };

        backtrack(digits, 0, new StringBuilder(), mapping, ans);

        return ans;
    }

    public void backtrack(String digits, int index,
                          StringBuilder current,
                          String[] mapping,
                          List<String> ans) {

        if (index == digits.length()) {
            ans.add(current.toString());
            return;
        }
        String letters = mapping[digits.charAt(index) - '0'];
        for (int i = 0; i < letters.length(); i++) {

            current.append(letters.charAt(i));

            backtrack(digits, index + 1, current, mapping, ans);

            current.deleteCharAt(current.length() - 1);
        }
    }
}
