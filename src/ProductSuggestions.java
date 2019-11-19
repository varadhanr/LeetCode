import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ProductSuggestions {

	public static void main(String[] args) {

		int numOfProducts = 5;
		List<String> repository = new ArrayList<String>(
				Arrays.asList("mobile", "mouse", "moneypot", "monitor", "mousepad"));
		String cusQuery = "mouse";

		System.out.print(new ProductSuggestions().productSuggestions(numOfProducts, repository, cusQuery));

	}

	public List<List<String>> productSuggestions(int numOfProducts, List<String> repository, String cusQuery) {

		List<List<String>> result = new ArrayList<List<String>>();
		cusQuery = cusQuery.toLowerCase();
		for (int i = 2; i <= cusQuery.length(); i++) {
			String subQuery = cusQuery.substring(0, i);
			List<String> eachResult = new ArrayList<String>();

			for (String repo : repository) {
				String repoLower = repo;
//				repoLower = repoLower.toLowerCase();
				if (repoLower.toLowerCase().contains(subQuery)) {
					eachResult.add(repo);
				}
			}
//			Arrays.sort(eachResult.toArray());
			Collections.sort(eachResult);
			if (eachResult.size() > 3) {
				eachResult = new ArrayList<String>(
						Arrays.asList(eachResult.get(0), eachResult.get(1), eachResult.get(2)));
			}
			if (eachResult != null)
				result.add(eachResult);

		}
		return result;
	}
}
