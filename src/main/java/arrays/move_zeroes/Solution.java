package arrays.move_zeroes;

class Solution {
    public void moveZeroes(int[] nums) {
        int zero_pointer = 0, non_zero_pointer = 0;
        while (non_zero_pointer < nums.length) {
            if (nums[non_zero_pointer] == 0) {
                non_zero_pointer++;
                continue;
            }
            swap(nums, zero_pointer++, non_zero_pointer++);
        }
    }

    private void swap(int[] nums, int a, int b) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}
