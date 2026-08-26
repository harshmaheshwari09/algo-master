package sliding_window.fixed_size.permutation_in_string;

class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int s1Len = s1.length(), s2Len = s2.length();
        if (s1Len > s2Len) return false;

        int[] s1Count = new int[26];
        int[] s2Count = new int[26];
        int matches = 0;
        for (int i = 0; i < s1Len; i++) {
            s1Count[s1.charAt(i) - 'a']++;
            s2Count[s2.charAt(i) - 'a']++;
        }
        for (int i = 0; i < 26; i++) {
            if (s1Count[i] == s2Count[i]) matches++;
        }

        for (int i = s1Len; i < s2Len; i++) {
            if (matches == 26) return true;

            int inChar = s2.charAt(i) - 'a';
            int outChar = s2.charAt(i - s1Len) - 'a';

            s2Count[inChar]++;
            if (s2Count[inChar] == s1Count[inChar]) {
                matches++;
            } else if (s2Count[inChar] == s1Count[inChar] + 1) {
                matches--;
            }

            s2Count[outChar]--;
            if (s2Count[outChar] == s1Count[outChar]) {
                matches++;
            } else if (s2Count[outChar] == s1Count[outChar] - 1) {
                matches--;
            }
        }
        return matches == 26;
    }
}
