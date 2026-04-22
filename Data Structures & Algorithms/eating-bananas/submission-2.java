class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int n = piles.length;
        int max = 0;
        
        for (int i = 0; i < n; i++) {
            max = Math.max(max, piles[i]);
        }
        
        return func(piles, h, n, max);
    }

    private int func(int[] piles, int h, int n, int max) {
        int left = 1; 
        int right = max;
        int k = max;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            long expected_time = 0;

            for (int i = 0; i < n; i++) {
                expected_time += (piles[i] + mid - 1) / mid;
            }

            if (expected_time <= h) {
                k = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return k;
    }
}