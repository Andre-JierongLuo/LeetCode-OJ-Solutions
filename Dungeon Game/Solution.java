public class Solution {
    public int calculateMinimumHP(int[][] dungeon) {
        if(dungeon == null || dungeon.length == 0 || dungeon[0].length == 0)
            return 1;
        // row
        int m = dungeon.length;
        // col
        int n = dungeon[0].length;
        
        int[][] minHP = new int[m][n];
        // calculating the minimum HP starting from bottom right. 
        minHP[m-1][n-1] = Math.max(1, 1 - dungeon[m-1][n-1]);
        
        // then step by step until we reach the top left.
        for(int i = m-2; i >= 0; i--){
            minHP[i][n-1] = Math.max(1, minHP[i+1][n-1] - dungeon[i][n-1]);
        }
        for(int i = n-2; i >= 0; i--){
            minHP[m-1][i] = Math.max(1, minHP[m-1][i+1] - dungeon[m-1][i]);
        }
        for(int i = m-2; i>= 0; i--){
            for(int j = n-2; j >= 0; j--){
                int fromRight = Math.max(1, minHP[i][j+1] - dungeon[i][j]); 
                int fromDown = Math.max(1, minHP[i+1][j] - dungeon[i][j]);
                minHP[i][j] = Math.min(fromRight, fromDown);
            }
        }
        return minHP[0][0];
    }
}