/**
 * Created by Tim on 06/03/16.
 */
public class MixedFractions {
    static Kattio io = new Kattio(System.in);
    static boolean go = true;

    public static void main(String[] args) {
        while(go) {
            double c = io.getDouble();
            double d = io.getDouble();

            if (c == 0 && d == 0) {
                io.close();
                return;
            }

            double whole = Math.floor(c / d);
            double rest = (((c / d) - whole) * d);

            io.println(Double.valueOf(whole).intValue() + " " + Double.valueOf(rest).intValue() + " / " + Double.valueOf(d).intValue());
        }
    }


}
