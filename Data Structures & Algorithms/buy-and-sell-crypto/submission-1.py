from typing import List

class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        if not prices:
            return 0  # If the list is empty, no profit

        min_price = prices[0]  # Initialize the min price to the first price
        max_profit = 0  # Initialize the max profit to 0

        for price in prices:
            # Update the minimum price
            min_price = min(min_price, price)
            # Calculate profit if selling at current price
            profit = price - min_price
            # Update max profit if it's higher than the previous
            max_profit = max(max_profit, profit)

        return max_profit
