/**
 * Created by Tim on 01/08/16.
 */
public class Stuckinatimeloop {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in);
        int count = io.getInt();

        for (int i = 1; i < count +1; i++){
            io.println(i + " Abracadabra");
        }
        io.close();
    }
}
