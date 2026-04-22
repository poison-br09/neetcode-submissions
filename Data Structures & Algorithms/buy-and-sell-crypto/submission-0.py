from typing import List

class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        n = len(prices)  # Correcting the length function
        if n == 0:
            return 0  # If there are no prices, no profit

        less = [0] * n  # Initializing the 'less' array
        high = [0] * n  # Initializing the 'high' array

        less[0] = prices[0]  # First element is the minimum for the first day
        high[n-1] = prices[n-1]  # Last element is the maximum for the last day

        for i in range(1, n):
            less[i] = min(less[i-1], prices[i])

        for i in range(n-2, -1, -1):
            high[i] = max(high[i+1], prices[i])

        ans = float('-inf')
        for i in range(n):
            ans = max(ans, high[i] - less[i])

        return ans
