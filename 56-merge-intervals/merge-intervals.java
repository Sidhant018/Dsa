class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
        //we done this because Arrays.sort works for primary
        List<int[]> result=new ArrayList<>();//making a list because to store the result
        for(int[]interval:intervals){
            if(result.size()==0||result.get(result.size()-1)[1]<interval[0]){//checking for overlapping
                result.add(interval);
            }
            else{
                result.get(result.size()-1)[1]= Math.max(result.get(result.size()-1)[1],interval[1]);
            }
           
        }
        return result.toArray(new int[result.size()][]);

    }
}