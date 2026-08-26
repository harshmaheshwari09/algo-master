package sliding_window.fixed_size.find_all_anagrams_in_a_string;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();
        int[] pCount = new int[26];
        int[] slidingWindow = new int[26];
        int pLen = p.length(), sLen = s.length();

        if (sLen < pLen) return result;

        for (int i = 0; i < pLen; i++) {
            pCount[p.charAt(i) - 'a']++;
            slidingWindow[s.charAt(i) - 'a']++;
        }

        // calculate the initial match
        int matches = 0;
        for (int i = 0; i < 26; i++) {
            if (pCount[i] == slidingWindow[i]) matches++;
        }
        if (matches == 26) result.add(0);

        for (int i = pLen; i < sLen; i++) {
            int inChar = s.charAt(i) - 'a';
            int outChar = s.charAt(i - pLen) - 'a';

            slidingWindow[inChar]++;
            if (slidingWindow[inChar] == pCount[inChar]) {
                matches++;
            } else if (slidingWindow[inChar] == pCount[inChar] + 1) {
                matches--;
            }

            slidingWindow[outChar]--;
            if (slidingWindow[outChar] == pCount[outChar]) {
                matches++;
            } else if (slidingWindow[outChar] == pCount[outChar] - 1) {
                matches--;
            }

            if (matches == 26) {
                result.add(i - pLen + 1);
            }
        }

        return result;
    }
}
