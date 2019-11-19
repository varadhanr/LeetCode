import java.util.Stack;

public class PathWithMaximumScore {
	
	public static void main(String[] args) {
		
	}
	
	public int pathWithMaximunScore(int[][] matrix) {
		
		int rows = matrix.length;
		int columns = matrix[0].length;
		int [][] dirs = {{1,0},{0,1}}; //move up and down
		Stack<int []> stk = new Stack<int []>();
		stk.add(new int[] {0,0});
		int countMin = Integer.MAX_VALUE;
		while(!stk.isEmpty()) {
			int[] coor = stk.pop();
			for(int[] dir : dirs) {
				int x = coor[0] + dir[0];
				int y = coor[1] + dir[1];
				if(x<0 || y<0 || x>=rows || y>=columns) continue;
				
			}
		}
		return 0;
	}

}
