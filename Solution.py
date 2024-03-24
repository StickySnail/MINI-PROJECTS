class Solution:
    def maxProfit(self, prices: List[int]) -> int:

        # when there are only one record
        if len(prices) < 2:
            return 0

        left = 0
        right = 1
        maxProfit = 0
        while right < len(prices):
            currentProfit = prices[right] - prices[left]
            if currentProfit > 0:
                maxProfit = max(currentProfit, maxProfit)
            else:
                left = right
            right += 1
        return maxProfit
