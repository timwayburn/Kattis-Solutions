/**
 * Created by Tim on 01/03/16.
 */

import java.lang.*;

import static java.lang.Math.sin;

public class Ladder {
     static Kattio io = new Kattio(System.in);

    public static void main(String[] args) {
        Double ans2 = Math.ceil((new Integer(io.getInt()).doubleValue())/(sin(Math.toRadians(new Integer(io.getInt()).doubleValue()))));
        int realans = ans2.intValue();
        System.out.println(realans);
        io.close();
    }
}
