# Minimum Window Substring

[AlgoMaster Problem](https://algomaster.io/practice/dsa/minimum-window-substring?list=am-75)  
[LeetCode Problem](https://leetcode.com/problems/minimum-window-substring/)

Given two strings `s` and `t`, return the minimum window substring of `s` such that every character in `t`, including duplicates, is included in the window.

If there is no such substring, return an empty string `""`.

The test cases will be generated such that the answer is unique.

---

#### Example 1:

> Input: s = "ADOBECODEBANC", t = "ABC"  
Output: "BANC"  
Explanation: The minimum window substring "BANC" includes 'A', 'B', and 'C' from string t.

#### Example 2:

> Input: s = "a", t = "a"  
Output: "a"  
Explanation: The entire string s is the minimum window.

#### Example 3:

> Input: s = "a", t = "aa"  
Output: ""  
Explanation: Both 'a's from t must be included in the window.

---

#### Constraints:

* `1 <= s.length, t.length <= 10^5`
* `s` and `t` consist of uppercase and lowercase English letters.
