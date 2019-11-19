import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FavoriteGenres {

	public static void main(String[] args) {

		Map<String, List<String>> userSongs = new HashMap<String, List<String>>();
		userSongs.put("David", Arrays.asList("song1", "song2", "song3", "song4", "song8"));
		userSongs.put("Emma", Arrays.asList("song5", "song6", "song7"));

		Map<String, List<String>> songGenres = new HashMap<String, List<String>>();
		songGenres.put("Rock", Arrays.asList("song1", "song3"));
		songGenres.put("Dubstep", Arrays.asList("song7"));
		songGenres.put("Techno", Arrays.asList("song2", "song4"));
		songGenres.put("Pop", Arrays.asList("song5", "song6"));
		songGenres.put("Jazz", Arrays.asList("song8", "song9"));

		System.out.print(new FavoriteGenres().func(userSongs, songGenres));

	}

	public Map<String, List<String>> func(Map<String, List<String>> userSongs, Map<String, List<String>> genresToSong) {

		Map<String, List<String>> res = new HashMap<>();
		Map<String, String> songstogenre = new HashMap<>();

		for (String genre : genresToSong.keySet()) {
			List<String> songs = genresToSong.get(genre);
			for (String song : songs) {
				songstogenre.put(song, genre);
			}
		}
		Map<String, Integer> count = new HashMap();
		int max = 0;
		for (String user : userSongs.keySet()) {
			count = new HashMap();
			max = 0;
			res.put(user, new ArrayList());
			List<String> songs = userSongs.get(user);
			for (String song : songs) {
				String genre = songstogenre.get(song);
				int c = count.getOrDefault(genre, 0) + 1;
				count.put(genre, c);
				max = Math.max(c, max);
			}
			for (String key : count.keySet()) {
				if (count.get(key) == max) {
					res.get(user).add(key);
				}
			}
		}
		return res;
	}

}
