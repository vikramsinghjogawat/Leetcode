class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int m = grid.length;
        int n = grid[0].length;
        k=k%(m*n);
        for(int i=0;i<k;i++){
            grid=shiftByOne(grid);
        }
        List<List<Integer>> res = new ArrayList();
        for(int i=0;i<m;i++){
            res.add(Arrays.stream(grid[i]).boxed().collect(Collectors.toList()));
        }
        return res;
    }

    public int[][] shiftByOne(int[][] grid){
        int m = grid.length;
        int n = grid[0].length;
        Integer last = grid[m-1][n-1];
        int[] lastCol = new int[m];
        //col=n-1 and row=0 to m
        for(int i=0;i<m;i++){
            lastCol[i]=grid[i][n-1];
        }
        for(int i=0;i<m;i++){
            for(int j=n-2;j>=0;j--){
                grid[i][j+1] = grid[i][j]; 
            }
        }
        for(int i=0;i<m-1;i++){
            grid[i+1][0]=lastCol[i];
        }
        grid[0][0]=last;
        //print(grid);

        //for(int i:lastCol)
        //    System.out.println("lastCol= "+i);
        return grid;
    }
    public void print(int[][] grid){
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                System.out.print(grid[i][j]+"  ");
            }
            System.out.println();
        }
    }
}