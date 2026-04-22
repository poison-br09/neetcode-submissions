class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int forward[] = new int[n+1];
        int backward[] = new int[n+1];
        forward[0] = 1;
        backward[n] = 1;
        for (int i = 1; i <= n; i++) {
            forward[i] = forward[i - 1] * nums[i - 1];
        }

        backward[n] = 1;
        for (int i = n - 1; i >= 0; i--) {
            backward[i] = backward[i + 1] * nums[i];
        }

        int[] prod = new int[n];
        for (int i = 0; i < n; i++) {
            prod[i] = forward[i] * backward[i + 1];
        }

        return prod;
    }
}  
