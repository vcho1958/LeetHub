class Solution {
    public int removeElement(int[] nums, int val) {
        int size = 0;
        for(int i = 0; i < nums.length;i++){
            if(nums[i]==val)continue;
            nums[size] = nums[i];
            size++;
        }
        return size;
    }
}