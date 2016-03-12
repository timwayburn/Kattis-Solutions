import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/**
 * Created by Tim on 12/03/16.
 */
public class BlackFriday {
    static int largest = 0;
    static int ans = 0;

    public static void main(String[] args) {
        Kattiobf io = new Kattiobf(System.in);
        HashMap<Integer, Integer> unique = new HashMap<>();
        HashSet<Integer> visited = new HashSet<>();

        int total = io.getInt();
        for(int i = 0; i < total; i++){
            int current = io.getInt();
            if(!visited.contains(current))
                unique.put(current, i);
            else
                unique.remove(current);

            visited.add(current);
        }

        for(int key : unique.keySet()) {
            if(key > largest) {
                largest = key;
                ans = unique.get(key);
            }
        }
        if(largest == 0){
            io.print("none");
        }
        else{
            io.print(ans + 1);
        }
        io.close();
    }
}
