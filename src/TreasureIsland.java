import java.util.LinkedList;
import java.util.Queue;

public class TreasureIsland {

	public static void main(String[] args) {

		char[][] islandMap = new char[][] { { 'o', 'o', 'o', 'o' }, { 'D', 'o', 'D', 'o' }, { 'o', 'o', 'o', 'o' },
				{ 'X', 'D', 'D', 'o' } };
				
		System.out.print(new TreasureIsland().findDestinationInIsland(islandMap));

	}

	public int findDestinationInIsland(char[][] islandMap) {

		if (islandMap.length == 0 || islandMap[0].length == 0 || islandMap[0][0] == 'D')
			return -1;

		int[][] dirs = new int[][] { { 0, 1 }, { 0, -1 }, { 1, 0 }, { -1, 0 } };

		int r = islandMap.length; 
		int c = islandMap[0].length;
		Queue<int[]> q = new LinkedList<int[]>();
		q.add(new int[] { 0, 0 });
		islandMap[0][0] = 'D';
		int steps = 1;

		while (!q.isEmpty()) {

			for(int i=0;i<q.size();i++) {
			int[] coor = q.poll();
			for (int[] dir : dirs) {
				int x = coor[0] + dir[0];
				int y = coor[1] + dir[1];
				if (x < 0 || y < 0 || x >= r || y >= c || islandMap[x][y] == 'D')
					continue;
				if (islandMap[x][y] == 'X')
					return steps;
				q.add(new int[] { x, y });
				islandMap[x][y] = 'D';

			}
			}
			steps++;

		}
		return 0;

	}

}
