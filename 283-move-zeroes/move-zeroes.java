class Solution {
    public void moveZeroes(int[] nums) {
        int writer=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                int temp=nums[writer];
                nums[writer]=nums[i];
                nums[i]=temp;
                writer++;
            }
        }
    }
}