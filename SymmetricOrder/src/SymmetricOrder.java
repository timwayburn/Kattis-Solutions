import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by Tim on 06/03/16.
 */
public class SymmetricOrder {
    static Kattios io = new Kattios(System.in);
    static int setcount = 1;
    static boolean go = true;

    public static void main(String[] args) {
        while(go){
            int length = io.getInt();
            if (length == 0) {
                io.close();
                return;
            }
            io.println("SET " + setcount);
            ArrayList<String> currentset = new ArrayList<>();
            for (int i = 0; i < length; i++) {
                String currentln = io.getLine();
                currentset.add(currentln);
            }

            Collections.sort(currentset, new Comp());

            ArrayList<String> set1 = new ArrayList<>();
            ArrayList<String> set2 = new ArrayList<>();

            for(int i = 0; i < currentset.size(); i++){
                if(i%2 == 0){
                    set1.add(currentset.get(i));
                }
                else{
                    set2.add(currentset.get(i));
                }
            }
            Collections.reverse(set2);
            set1.addAll(set2);

            for(String names: set1){
                io.println(names);
            }
            setcount ++;
        }
    }
}
