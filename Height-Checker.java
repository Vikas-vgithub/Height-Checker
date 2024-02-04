class Solution {
    public int heightChecker(int[] heights) {
        int [] ans = new int[heights.length];
        int total = 0;

        for(int i=0; i<heights.length; i++){
            ans[i]=heights[i];
        }

        Arrays.sort(ans);

        for(int i=0; i<heights.length; i++){
            if(heights[i]!=ans[i]){
                total++;
            }
        }

        return total;
    }
}
