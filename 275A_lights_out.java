class Solution{
	public static void lights_out(int[][] grid){
        int count;
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){
                count = grid[i][j];

                if(i!=0) count += grid[i-1][j];
                if(j!=0) count += grid[i][j-1];
                if(i!=grid.length-1) count += grid[i+1][j];
                if(j!=grid[0].length-1) count += grid[i][j+1];

				System.out.println((count%2==0?1:0)+" ");
            }
			System.out.println();
        }
    }
}
