package two_pointers.trapping_rain_water;

class Solution {
    public int trap(int[] height) {
        int left = 0, right = height.length - 1;
        int maxLeftHeight = 0, maxRightHeight = 0;
        int totalWaterTrapped = 0;
        while (left < right) {
            maxLeftHeight = Math.max(maxLeftHeight, height[left]);
            maxRightHeight = Math.max(maxRightHeight, height[right]);
            if (height[left] < height[right]) {
                totalWaterTrapped += (maxLeftHeight - height[left++]);
            } else {
                totalWaterTrapped += (maxRightHeight - height[right--]);
            }
        }
        return totalWaterTrapped;
    }
}
