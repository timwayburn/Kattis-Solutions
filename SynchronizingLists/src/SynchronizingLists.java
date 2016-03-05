import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by Tim on 03/03/16.
 */
public class SynchronizingLists {
    static Kattio io;

    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<>();
        ArrayList<Integer> array2 = new ArrayList<>();
        io = new Kattio(System.in);
        int n = io.getInt();
        if(n == 0){
            io.close();
        }

            for(int m = 0; m < n-1; m++){
            int current = io.getInt();
                array.add(current);
            }
            for(int m = 0; m < n-1; m++) {
                int current = io.getInt();
                array2.add(current);
            }
        Collections.sort(array);
        Collections.sort(array2);
        for (int m = 0; m < n -1; m++) {
            io.println(array.get(m));
        }
        io.println("");
        for (int m = 0; m < n -1; m++) {
            io.println(array2.get(m));
        }
        io.close();
    }
}

