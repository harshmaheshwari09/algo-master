package strings.reverse_words_in_a_string;

class Solution {
    public String reverseWords(String s) {
        StringBuilder ans = new StringBuilder();
        for (var part : s.trim().split("\\s+")) {
            ans.insert(0, part + " ");
        }
        return ans.toString().trim();
    }
}
