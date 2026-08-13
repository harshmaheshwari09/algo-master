package two_pointers.container_with_most_water;

class Solution {
    public int maxArea(int[] height) {
        int left = 0, right = height.length - 1;
        int maxArea = 0;
        while (left < right) {
            // area with respect to the shorter line
            int length = right - left;
            int width = Math.min(height[left], height[right]);
            maxArea = Math.max(maxArea, length * width);

            // move the shorter line
            if (height[left] < height[right]) {
                left++;
            } else {
               right--;
            }
        }
        return maxArea;
    }
}
