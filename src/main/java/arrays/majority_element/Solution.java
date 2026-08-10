package arrays.majority_element;

class Solution {
    public int majorityElement(int[] nums) {
        int count = 0, candidate = -1;
        for (var curr_candidate : nums) {
            if (count == 0) {
                candidate = curr_candidate;
                count = 1;
            } else if (curr_candidate == candidate) {
                count++;
            } else {
                count--;
            }
        }
        return candidate;
    }
}
