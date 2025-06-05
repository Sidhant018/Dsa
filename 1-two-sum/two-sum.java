import java.util.Arrays;
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int aux[]=Arrays.copyOf(nums,nums.length);
        Arrays.sort(nums);
        int left=0;
        int right=nums.length-1;
        int firstvalue=-1;
        int secondvalue=-1;
        while(left<right){
            int sum=nums[left]+nums[right];
            if(sum==target){
                firstvalue=nums[left];
                secondvalue=nums[right];
                break;
            
            }
            else if(sum>target){
                right--;
            }
            else{
                left++;
            }
        }
        int firstindex=-1;
        int secondindex=-1;
        for(int i=0;i<=aux.length;i++){
            if(firstindex==-1&&aux[i]==firstvalue){
                firstindex=i;
            }
            else if(secondindex==-1&&aux[i]==secondvalue){
                secondindex=i;
            }
        }
        return new int[]{firstindex,secondindex};

       
        }

    }

