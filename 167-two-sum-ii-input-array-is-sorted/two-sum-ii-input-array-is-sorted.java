class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left=0;
        int right=numbers.length-1;
        //int firstval=-1;
        //int secondval=-1;
        while(left<right){
            int sum=numbers[left]+numbers[right];
            if(sum==target){
                return new int[] {left+1,right+1};//issme hum direct return krr skte h index ko kyuki phle se sorted array given h aur firstval,secondval waale case issliye lggre thae kyuki hmne firstval aur secondval ki values sorted array mai nikaali thi usske baad hume original array mai nikalni thi toh vo search krrne ke liye kaam aata jese hi val values mil jaati oringinal aaray mai waha hum krre thae return index ko.
                //firstval=nums[left];
               // secondval=nums[right];
               // break;
            }
            else if(sum>target){
                right--;
            }
            else if(sum<target){
                left++;
            }
        }
        return new int[] {-1,-1};
      /*  int firstindex=-1;
        int secondindex=-1;
        for(int i=0;i<numbers.length;i++){
            if(firstindex=-1&&numbers[i]==firstval){
                firstindex=i;
            }
            else
                if(secondindex=-1&&numbers[i]==secondval){
                    secondindex=i;
                }
            }
          // ye nhi krrne ki jarrurat kyuki given arrray sorted h index mai koi frk nhi aaega jese two sum ki phli problem mai aaya tha*/

        }

    }
