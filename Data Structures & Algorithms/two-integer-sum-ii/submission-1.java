class Solution {
    public int[] twoSum(int[] numbers, int target) {
        if (numbers == null || numbers.length < 2) {
            return new int[] {};  // Handle edge case
        }
        
        int sp = 0; 
        int ep = numbers.length - 1;
        while (sp < ep) {
            int sum = numbers[sp] + numbers[ep];
            if (sum < target) {
                sp++;
            } else if (sum > target) {
                ep--;
            } else {
                return new int[] {sp + 1, ep + 1}; // 1-based index result
            }
        }
        return new int[] {};  // No solution found
    }
}
