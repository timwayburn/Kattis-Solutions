/**
 * Created by Tim on 2017-09-28.
 *
 * Solution to: Faktor
 */
public class Faktor {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in, System.out);

        Double artcount = io.getDouble();
        Double impfactor = io.getDouble() - 1;

        io.println((int)(artcount*impfactor + 1));

        io.close();
    }
}
