package sliding_window.dynamic_size.longest_substring_without_repeating_characters;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int sLen = s.length();
        int left = 0, longestSubstringLen = 0;
        Map<Character, Integer> indexMap = new HashMap<>();
        for (int right = 0; right < sLen; right++) {
            char inChar = s.charAt(right);
            if (indexMap.containsKey(inChar)) {
                left = Math.max(left, indexMap.get(inChar) + 1);
            }
            indexMap.put(inChar, right);
            longestSubstringLen = Math.max(longestSubstringLen, right - left + 1);
        }
        return longestSubstringLen;
    }
}
