from typing import List

class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        map = {}
        for i, num in enumerate(nums):
            compatible = target - num
            if compatible in map:
                return [map[compatible], i]
            map[num] = i
        return []
        