import java.util.ArrayList;
import java.util.HashSet;

/**
 * Created by Tim on 12/03/16.
 */
public class BeenEverywhere {

    public static void main(String[] args) {
        Kattioew io = new Kattioew(System.in);
         int tests = io.getInt();
        for(int i = 0; i < tests; i++) {
            ArrayList<String> unique = new ArrayList<>();
            HashSet<String> visited = new HashSet<>();

            int total = io.getInt();
            for (int x = 0; x < total; x++) {
                String current = io.getWord();
                if (!visited.contains(current))
                    unique.add(current);

                visited.add(current);
            }

            io.println(unique.size());
        }
        io.close();
    }
}
