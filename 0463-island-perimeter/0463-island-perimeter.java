class Solution {
    public int islandPerimeter(int[][] grid) {
        int pre = 0;
        for(int i = 0;i<grid.length;i++){
            for(int j = 0;j<grid[i].length;j++){
                if(grid[i][j] == 1){
                    pre = pre + 4;
                    if(j < grid[i].length-1){
                        if(grid[i][j+1] == 1){
                            pre = pre-2;
                        }
                    }
                    if(i<grid.length-1){
                        if(grid[i+1][j] == 1){
                            pre = pre -2;
                        }
                    }
                    
                }
            }
        }

        return pre;
    }
}