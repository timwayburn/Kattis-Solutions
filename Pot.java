/**
 * Created by Tim on 2017-10-01.
 *
 * Solution to: Pot
 */
public class Pot {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in, System.out);

        int iterations = io.getInt(); // Amount of numbers to add together
        int sum = 0;

        for(int i = 0; i < iterations; i++){
            String currentnum = io.getLine();

            int pivot = String.valueOf(currentnum).length();
            int base = Integer.parseInt(currentnum.substring(0, pivot-1));
            int exp = Integer.parseInt(currentnum.substring(pivot-1, pivot));

            sum += powerCalc(base, exp);
        }
        io.print(sum);
        io.close();
    }

    private static int powerCalc(int base, int exp){
        int res = 1;
        for(int i = 0; i < exp; i++){
            res *= base;
        }
        return res;
    }
}
