package prefix_sum.subarray_sum_equals_k;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int subarraySum(int[] nums, int k) {
        int ans = 0;
        int prefixSum = 0;
        Map<Integer, Integer> prefixSumCount = new HashMap<>();
        prefixSumCount.put(0, 1);
        for (int num : nums) {
            prefixSum += num;
            ans += prefixSumCount.getOrDefault(prefixSum - k, 0);
            prefixSumCount.put(prefixSum, prefixSumCount.getOrDefault(prefixSum, 0) + 1);
        }
        return ans;
    }
}
