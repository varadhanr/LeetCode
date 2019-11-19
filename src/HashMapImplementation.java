
public class HashMapImplementation {

	public static void main(String[] args) {

		String[] query = new String[] { "Insert", "Insert", "AddToKey", "get", "AddToValue", "get" };
		
		String[][] queryType = new String[][] {{"1","3"},{"2","4"},{"3"},{"4"},{"4"},{"5"}};
		
		System.out.println(new HashMapImplementation().returnFromHashMap(query, queryType));

	}

	public int returnFromHashMap(String[] query, String[][] queryType) {

		int[] arrayForHashMap = new int[100000];
		int[] arrayForFilledKey = new int[100000];
		int count = 0;
		int sum = 0;

		for (int i = 0; i < query.length; i++) {

			String[] qType = queryType[i];
			String eachQuery = query[i];
			switch (eachQuery) {
			case "Insert":
				arrayForHashMap[Integer.valueOf(qType[0])] = Integer.valueOf(qType[1]);
				arrayForFilledKey[count] = Integer.valueOf(qType[0]);
				count++;

				break;
			case "AddToKey":

				for (int iter = 0; iter < count; iter++) {
					int key = arrayForFilledKey[iter];
					arrayForHashMap[key + Integer.valueOf(qType[0])] = arrayForHashMap[key];
					arrayForHashMap[key] = 0;
					arrayForFilledKey[iter] = key + Integer.valueOf(qType[0]);
				}

				break;
			case "AddToValue":

				for (int iter2 = 0; iter2 < count; iter2++) {
					int key = arrayForFilledKey[iter2];
					arrayForHashMap[key] = arrayForHashMap[key] + Integer.valueOf(qType[0]);
				}
				break;
			case "get":

				sum = sum + arrayForHashMap[Integer.valueOf(qType[0])];
				break;
			}
		}

		return sum;
	}
}
