/**
 * Created by Tim on 28/02/16.
 */

import java.util.Scanner;

public class Carrot {
    private static Kattio io;
    public static void main(String[] args) {
        io = new Kattio(System.in, System.out);
        Scanner reader = new Scanner(System.in);
        String input = reader.nextLine();

        String[] inputList = input.split(" ");
        int n = Integer.parseInt(inputList[0]);
        int p = Integer.parseInt(inputList[1]);

        String[] hufflePuffs = new String[n];

        for(int i = 0; i < n; i++){
            hufflePuffs[i] = reader.nextLine();
        }
        io.println(p);
        io.close();
    }
}