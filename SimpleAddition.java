import java.math.BigInteger;

/**
 * Created by Tim on 29/05/16.
 */
public class SimpleAddition {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in);

        BigInteger one = new BigInteger(io.getWord());
        BigInteger two = new BigInteger(io.getWord());

        io.print(one.add(two));

        io.close();
    }
}
