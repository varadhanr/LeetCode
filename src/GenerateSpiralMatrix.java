
public class GenerateSpiralMatrix {

	public int[][] generateMatrix(int n) {

		int rowFirst = 0;
		int colFirst = 0;
		int rowLast = n - 1;
		int colLast = n - 1;

		int[][] resultMatrix = new int[n][n];

		int i = 1;

		while (i <= n * n) {

			int col = colFirst;
			int row = rowFirst;

			for (col = colFirst; col <= colLast; col++) {
				resultMatrix[row][col] = i;
				i++;
			}

			col = colLast;

			for (row = rowFirst + 1; row <= rowLast; row++) {
				resultMatrix[row][col] = i;
				i++;
			}

			row = rowLast;

			for (col = colLast - 1; col >= colFirst; col--) {
				resultMatrix[row][col] = i;
				i++;
			}

			col = colFirst;

			for (row = rowLast - 1; row > rowFirst; row--) {
				resultMatrix[row][col] = i;
				i++;
			}

			rowFirst++;
			colFirst++;
			rowLast--;
			colLast--;

		}

		return resultMatrix;

	}

}
