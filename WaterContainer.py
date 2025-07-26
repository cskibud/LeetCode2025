from typing import List
class Solution:
    def maxArea(self, height: List[int]) -> int:
        maxA, left, right = 0, 0, len(height) - 1
        while left < right:
            maxA = max(maxA, min(height[left], height[right]) * (right - left))
            if height[left] < height[right]:
                left += 1
            else:
                right -= 1
        return maxA   