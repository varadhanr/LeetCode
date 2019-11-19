
public class SearchInMatrix {
	
	public static void main(String[] args) {
		
		int [][] matrix = new int[][] {{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}};
		System.out.print(new SearchInMatrix().searchMatrix(matrix, 20));
 		
	}

	public boolean searchMatrix(int[][] matrix, int target) {
		
		if(matrix.length == 0 ) return false;
		int rows = matrix.length;
		int columns = matrix[0].length;
		
		int i=rows -1;
		int j = 0;
		
		while(i >=0 && j<columns) {
			
			if(matrix[i][j] == target) return true;
			
			if(matrix[i][j] > target) {
				i--;
			}
			else {
				j++;
			}
		}
		
		return false;

	}

}
