

/**
 * Created by Tim on 2016-10-16.
 */
public class Soylent {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in, System.out);

        int cases = io.getInt();

        for(int i = 0; i < cases; i++){
            int totalcals = io.getInt();
            if(totalcals % 400 == 0){
                io.println(totalcals/400);
            }
            else{
                io.println((totalcals/400) + 1);
            }
        }

        io.close();
    }
}
