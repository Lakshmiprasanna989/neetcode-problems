class Solution:
    def hasDuplicate(self, nums: List[int]) -> bool:
        lt=sorted(nums)
        for i in range(1,len(nums)):
            if (lt[i]==lt[i-1]):
                return True
        return False



        