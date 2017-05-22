/**
 * Solution to R2
 * Created by Tim on 2017-04-17.
 */
public class R2 {
    static Kattio io = new Kattio(System.in, System.out);

    public static void main(String[] args) {
        int r1 = io.getInt();
        int Sdouble = io.getInt() * 2;

        io.println(Sdouble - r1);
        io.close();
    }
}
