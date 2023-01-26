class Solution {
    public int removeDuplicates(int[] nums) {
        boolean[] check = new boolean[201];
        int j = 0;
        List<Integer> buffer = new ArrayList<>();
        for(int i = 0; i < nums.length; i++, j++){
            while(i < nums.length && check[nums[i]+100]){
                i++;
            }
            if(i >= nums.length)break;
            nums[j] = nums[i];
            check[nums[i]+100] = true;
        }
        return j;
    }
}