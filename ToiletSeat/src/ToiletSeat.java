import java.util.ArrayList;

/**
 * Created by Tim on 05/03/16.
 *
 * Toilet seat solution.
 *
 * The three cases are
 *
 * 1. When you leave, always leave the seat up
 * 2. When you leave, always leave the seat down
 * 3. When you leave, always leave the seat as you would like to find it
 */
public class ToiletSeat {
    static Kattiotoilet io = new Kattiotoilet(System.in);
    static ArrayList<Character> characters = new ArrayList<>();

    public static void main(String[] args) {
        String toilet = io.getLine();
        StringBuilder sb = new StringBuilder();
        int n = io.getInt();
        for(int i = 0; i<n; i++){
            toilet = io.getLine();
            for(int x = 0; x < toilet.length(); x++){
                characters.add(toilet.charAt(x));
            }
        }

    }

}
