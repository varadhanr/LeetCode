import java.util.LinkedList;
import java.util.Queue;

public class A01Matrix {

	public static void main(String[] args) {

	}

	public int[][] updateMatrix(int[][] matrix) {

		int r = matrix.length;
		int c = matrix[0].length;
		int[][] dirs = new int[][] { { 1, 0 }, { -1, 0 }, { 0, -1 }, { 0, 1 } };

		int[][] res = new int[r][c];

		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				int steps = 1;
				Queue<int[]> q = new LinkedList<int[]>();
				q.add(new int[] { i, j });
				if (matrix[i][j] == 0) {
					matrix[i][j] = 1;
					res[i][j] = 0;
					continue;
				}
				while (!q.isEmpty()) {
					for (int i1 = 0; i1 < q.size(); i1++) {
						for (int[] dir : dirs) {
							int x = i1 + dir[0];
							int y = j + dir[1];
							if (x < 0 || y < 0 || x >= r || y >= c || matrix[i1][j] == 1)
								continue;
							if (matrix[i1][j] == 0) {
								matrix[i1][j] = steps;
							}

						}
					}
					steps++;
				}
			}
		}

		return null;

	}

}
