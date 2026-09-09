package sliding_window.dynamic_size.minimum_window_substring;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public String minWindow(String s, String t) {
        if (t.length() > s.length()) return "";

        Map<Character, Integer> tFreq = new HashMap<>();
        for (char c : t.toCharArray()) {
            tFreq.put(c, tFreq.getOrDefault(c, 0) + 1);
        }

        int expectedMatch = tFreq.size();
        int ansLeft = 0, ansSize = Integer.MAX_VALUE;
        int left = 0, currMatch = 0;
        Map<Character, Integer> sFreq = new HashMap<>();

        for (int right = 0; right < s.length(); right++) {
            char inChar = s.charAt(right);
            sFreq.put(inChar, sFreq.getOrDefault(inChar, 0) + 1);

            if (sFreq.get(inChar).equals(tFreq.getOrDefault(inChar, 0))) {
                currMatch++;
            }

            while (currMatch == expectedMatch) {
                if (right - left + 1 < ansSize) {
                    ansLeft = left;
                    ansSize = right - left + 1;
                }
                char outChar = s.charAt(left);
                left++;
                sFreq.put(outChar, sFreq.get(outChar) - 1);
                if (sFreq.get(outChar) < tFreq.getOrDefault(outChar, 0)) {
                    currMatch--;
                }
            }
        }
        return (ansSize == Integer.MAX_VALUE) ? "" : s.substring(ansLeft, ansLeft + ansSize);
    }
}
