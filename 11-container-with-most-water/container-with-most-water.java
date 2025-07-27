class Solution {
    //APPROACH-1 BRUTE FORCE TC(N^2)
  /*  public int maxArea(int[] height) {
        int max=0;
        for(int i=0;i<height.length;i++){
            for(int j=i+1;j<height.length;j++){
                int h=Math.min(height[i],height[j]);
                int w=j-i;
                int area=h*w;
                max=Math.max(area,max);
            }
        }
        return max;
    }
}*/
//APPROACH NUMBER 2
public int maxArea(int[] height) {
    int left=0;
    int right=height.length-1;
    int max=0;
    while(left<=right){
        int h=Math.min(height[left],height[right]);
        int w=right-left;
        int area=h*w;
        max=Math.max(area,max);
        if(height[left]<=height[right]){
            left++;
        }
        else{
            right--;
        }
    }
    return max;
}
}