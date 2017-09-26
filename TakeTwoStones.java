/**
 * Created by Tim on 20/09/16.
 *
 * Solution to "Take Two Stones" on Kattis
 */
public class TakeTwoStones {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in);

        int i = io.getInt();

        if (i >= 1 && i <= 10000000) {
            i = i % 2;

            if (i == 0) {
                io.println("Bob");
            } else {
                io.print("Alice");
            }
        }

        io.close();
    }
}
