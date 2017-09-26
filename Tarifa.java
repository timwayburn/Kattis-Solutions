/**
 * Created by Tim on 2017-08-18.
 *
 * Solution to Kattis problem: Tarifa
 */

public class Tarifa {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in, System.out);

        int monthlyData = io.getInt();
        int totalMonths = io.getInt();
        int pot = monthlyData * (totalMonths + 1);

        for(int i = 0; i < totalMonths; i++){
            int currData = io.getInt();
            pot -= currData;
        }

        io.print(pot);
        io.close();
    }
}
