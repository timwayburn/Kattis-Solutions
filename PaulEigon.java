/**
 * Created by Tim on 2016-11-09.
 * Solution to Paul Eigon.
 */
public class PaulEigon {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in, System.out);

        long N = io.getLong();

        if(((io.getLong()+io.getLong())/N)%2 == 0){
            io.print("paul");
        }
        else{
            io.print("opponent");
        }

        io.close();

    }
}
