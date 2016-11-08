/**
 * Created by Tim on 2016-11-08.
 *
 * Solution to Cetvrta.
 */
public class Cetvrta {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in, System.out);

        int x1 = io.getInt();
        int y1 = io.getInt();

        int x2 = io.getInt();
        int y2 = io.getInt();

        int x3 = io.getInt();
        int y3 = io.getInt();

        if(x1 == x2){
            io.print(x3);
        }
        else if(x2 == x3){
            io.print(x1);
        }
        else{
            io.print(x2);
        }

        if(y1 == y2){
            io.print(" " +y3);
        }
        else if(y2 == y3){
            io.print(" " +y1);
        }
        else{
            io.print(" " +y2);
        }

        io.close();
    }
}
