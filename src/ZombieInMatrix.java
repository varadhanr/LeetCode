
public class ZombieInMatrix {
	
	public static void main(String[] args) {
		
		int[][] matrix = new int[][] { { 1,1,1,1,1 }, { 0,0,0,0,0 },
			{ 0,0,0,0,0 }, { 0,0,0,0,0},{0,0,0,0,0 },{0,0,0,0,0}};
			
			System.out.print(new ZombieInMatrix().makeAllZombies(matrix));
		
	}
	
	public int makeAllZombies(int [][] grid){
		
		int [][] dirs = new int [][] {{1,0},{-1,0},{0,1},{0,-1}};
		
		int rLen = grid.length;
		int cLen = grid[0].length;
		
		int steps = 0;
		while(!isAllOnes(grid)) {
			int [][] visited = new int[rLen][cLen];
		for(int i=0;i<rLen;i++) {
			for(int j=0;j<cLen;j++) {
				if(grid[i][j] == 1 && visited[i][j] == 0) {
					visited[i][j] = 1;
					for(int[] dir : dirs) {
						int x = i + dir[0];
						int y = j + dir[1];
						if(x >=0 && y >=0 && x<rLen && y<cLen && visited[x][y] == 0 && grid[x][y] == 0) {
							grid[x][y] = 1;
							visited[x][y] = 1;
							
						}
					}
				}
			}
		}
		steps++;
		}
		return steps;
	}
	
	
	public boolean isAllOnes(int[][] matrix) {
		int rLen = matrix.length;
		int cLen = matrix[0].length;
		for(int i=0;i<rLen;i++) {
			for(int j=0;j<cLen;j++) {
				if(matrix[i][j] == 0) {
					return false;
				}
			}
		}
		return true;
	}

}
