public class Solution {
	public static int uniquePaths(int m, int n) {
        if(m == 1 || n == 1)
            return 1;
    
        int row = 1;
        int col = 1;
    
        // two rows in each 2d array.
        // one row for current.
        // the other for the past. 
        // just for saving a little bit memory.
        // simple way is just declare an array with [m][n].
        int[][] l1 = new int[2][m];
        int[][] l2 = new int[2][n];
        
        // solving from bottom right to top left.

        // up down
        for(int i = 0; i < m; i++){
        	l1[0][i] = 1;
        }
        
        // left right
        for(int i = 0; i < n; i++){
        	l2[0][i] = 1;
        }
        
        int x = 1;
        
        while(row < m && col < n){
        	
        	if(x == 0){
        		l1[0][row] = l1[1][row] + l2[1][col];
        		l2[0][col] = l1[1][row] + l2[1][col];
        		for(int i = row+1; i < m; i++){
        			l1[0][i] = l1[0][i-1] + l1[1][i];
        		}
        		for(int i = col+1; i < n; i++){
        			l2[0][i] = l2[1][i] + l2[0][i-1];
        		}
        		x++;
        		row++;
            	col++;
        		continue;
        	}
        	else if(x == 1){
        		
        		l1[1][row] = l1[0][row] + l2[0][col];
        		l2[1][col] = l1[0][row] + l2[0][col];
        		
        		for(int i = row+1; i < m; i++){
        			l1[1][i] = l1[1][i-1] + l1[0][i];
        		}
        		for(int i = col+1; i < n; i++){
        			l2[1][i] = l2[0][i] + l2[1][i-1];
        		}
        		x--;
        		row++;
            	col++;
        		continue;
        	}
        	else {}
        	
        }
        
        if(m > n){
        	if(x == 0){
        		return l1[1][m-1];
        	}
        	else {
        		return l1[0][m-1];
        	}
        } else {
        	if(x == 0){
        		return l2[1][n-1];
        	}
        	else {
        		return l2[0][n-1];
        	}
        		
        }
    }
	
}