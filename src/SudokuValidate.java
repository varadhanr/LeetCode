
public class SudokuValidate {

	public static void main(String[] args) {
		char[][] board = new char[][] { { '8', '3', '.', '.', '7', '.', '.', '.', '.' },
				{ '6', '.', '.', '1', '9', '5', '.', '.', '.' }, { '.', '9', '8', '.', '.', '.', '.', '6', '.' },
				{ '8', '.', '.', '.', '6', '.', '.', '.', '3' }, { '4', '.', '.', '8', '.', '3', '.', '.', '1' },
				{ '7', '.', '.', '.', '2', '.', '.', '.', '6' }, { '.', '6', '.', '.', '.', '.', '2', '8', '.' },
				{ '.', '.', '.', '4', '1', '9', '.', '.', '5' }, { '.', '.', '.', '.', '8', '.', '.', '7', '9' } };

		System.out.println(new SudokuValidate().isValidSudoku(board));
	}

	public boolean isValidSudoku(char[][] board) {
		
		boolean a1 = validateGrid(board);
		boolean a2 = validateRows(board);
		boolean a3 = validateColumns(board);

		return a1 && a2 && a3;

	}

	public boolean validateGrid(char[][] board) {
		int[][] ithIndex = { { 0, 0 }, { 0, 3 }, { 0, 6 }, { 3, 0 }, { 3, 3 }, { 3, 6 }, { 6, 0 }, { 6, 3 }, { 6, 6 } };
		int[][] jthIndex = { { 2, 2 }, { 2, 5 }, { 2, 8 }, { 5, 2 }, { 5, 5 }, { 5, 8 }, { 8, 2 }, { 8, 6 }, { 8, 8 } };

		int count = 0;
		while (count > 9) {
			int[] iIndex = ithIndex[count];
			int[] jIndex = jthIndex[count];
			int[] tab = new int[10];
			for (int i = iIndex[0]; i <= iIndex[1]; i++) {
				for (int j = jIndex[0]; j <= jIndex[1]; j++) {
					if (board[i][j] != '.') {
						if (tab[Integer.parseInt(String.valueOf(board[i][j]))] == 1)
							return false;
						tab[Integer.parseInt(String.valueOf(board[i][j]))] = 1;
					}
				}
			}
		}

		return true;

	}

	public boolean validateRows(char[][] board) {

//		char ch = '.';
		for (int i = 0; i < board.length; i++) {

			int[] tab = new int[10];

			for (int j = 0; j < board[i].length; j++) {
				if (board[i][j] != '.') {
					if (tab[Integer.parseInt(String.valueOf(board[i][j]))] == 1)
						return false;
					tab[Integer.parseInt(String.valueOf(board[i][j]))] = 1;
				}
			}
		}

		return true;

	}

	public boolean validateColumns(char[][] board) {
		for (int i = 0; i < board.length; i++) {

			int[] tab = new int[10];

			for (int j = 0; j < board[i].length; j++) {
				if (board[j][i] != '.') {
					if (tab[Integer.parseInt(String.valueOf(board[j][i]))] == 1)
						return false;
					tab[Integer.parseInt(String.valueOf(board[j][i]))] = 1;
				}
			}
		}

		return true;
	}

}
