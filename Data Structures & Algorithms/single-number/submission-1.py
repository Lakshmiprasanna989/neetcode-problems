class Solution:
    def singleNumber(self, nums: List[int]) -> int:
        remove=0
        for i in nums:
            remove^=i
        return remove
        
        