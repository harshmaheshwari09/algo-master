package bit_manipulation.single_number_iii;

class Solution {
    public int[] singleNumber(int[] nums) {
        int xorAll = 0;
        for (int num : nums) {
            xorAll = xorAll ^ num;
        }

        // isolating the rightmost set bit
        int diffBit = xorAll & (-xorAll);

        int x = 0;
        for (int num : nums) {
            if ((num & diffBit) != 0) {
                x = x ^ num;
            }
        }

        return new int[]{x, xorAll ^ x};
    }
}
