import java.util.ArrayList;

/**
 * Created by Tim on 03/03/16.
 */
public class Easiest {
    static Kattio io = new Kattio(System.in);
    static ArrayList<Integer> numbers;


    public static void main(String[] args) {
        numbers = new ArrayList<>();
        while (io.hasMoreTokens()) {          // for each number inserted
            int currentint = io.getInt();
            if (currentint == 0) {
                break;
            }
            numbers.add(currentint);  // add each number to the arraylist
        }
        for (int number : numbers) { // for each number or test input
            int p = 10;
            boolean notfound = true;
            while (notfound) {        // find and print the p number in this loop
                p++;
                int product = number * p;
                if (digitSum(product) == digitSum(number)){
                    System.out.println(p);
                    notfound = false;
                }
            }
        }
        io.close();
    }
    static int digitSum(int number) {
        String numberString = Integer.toString(number); // we change to string to access certain chars
        int sum = 0;
        for (int charcount = 0; charcount < numberString.length(); charcount++) { // add each charvalue to total count
            int tmp = Integer.parseInt(numberString.charAt(charcount) + "");
            sum += tmp;
        }
        return sum; // return sum of all digits in number
    }
}