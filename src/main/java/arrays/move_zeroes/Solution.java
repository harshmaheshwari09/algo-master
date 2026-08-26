package arrays.move_zeroes;

import helper.Helper;

class Solution {
    public void moveZeroes(int[] nums) {
        int zero_pointer = 0, non_zero_pointer = 0;
        while (non_zero_pointer < nums.length) {
            if (nums[non_zero_pointer] == 0) {
                non_zero_pointer++;
                continue;
            }
            Helper.swap(nums, zero_pointer++, non_zero_pointer++);
        }
    }
}
