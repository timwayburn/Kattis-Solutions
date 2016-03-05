import com.sun.tools.javac.util.List;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by Tim on 01/03/16.
 */
public class Birds {
    static Kattio io = new Kattio(System.in);
    public static void main(String[] args) {

        int l = io.getInt() - 12;   // sitting space
        int d = io.getInt();        // distance between birds
        int n = io.getInt();        // number of birds on wire
        int space = l;              // space left

        HashMap<Integer, Integer> list = new HashMap<>(); // arraylist position
        ArrayList<Boolean> marked = new ArrayList<>();
        int x = 0; // count

        while(io.hasMoreTokens()){
            Integer current = io.getInt();
            list.put(x, current);
            marked.add(current, true);
            x++;
        }

// ITERATE THROUGH birds instead. check if distance for each getINT

        for(Integer i: list){
            if(i != null){
                if(i == 1){
                    space = space - d;
                }
                if(i == n){
                   space = space - d;
                }
                else{
                    if(marked.get(i-d) && marked.get(i - 1 + d)){
                        space = space - (2*d);
                    }
                    else if(marked.get(i-2) || marked.get(i - 1 + d)){
                        space = space - d;
                    }
                }
            }
        }
        io.print(space / d);
        io.close();
    }
}
