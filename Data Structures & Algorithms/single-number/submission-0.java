class Solution {
    public int singleNumber(int[] nums) {
        int remove=0;
        for(int i:nums){
            remove^=i;
        }
        return remove;
        
    }
}
