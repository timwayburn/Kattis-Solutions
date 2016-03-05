import static java.lang.Integer.parseInt;
import static java.lang.Integer.reverse;

/**
 * Created by Tim on 29/02/16.
 */
public class ReversedBinary {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in);
        String x = Integer.toBinaryString(io.getInt());
        StringBuilder sb = new StringBuilder(x).reverse();
        io.print(Integer.parseInt(String.valueOf((sb.toString())),2));
        io.close();
    }

}
