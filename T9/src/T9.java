import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Tim on 04/03/16.
 */
public class T9 {
    static Kattio io = new Kattio(System.in);
    ArrayList<Character> chars = new ArrayList<>();
    static Reader reader = new InputStreamReader(System.in);

    public static void main(String[] args){
        int n = io.getInt();
        int x = 0;
        boolean stop = false;
        while(!stop){
            try {
                char current = (char) reader.read();
                if(current == -1){

                }
            } catch (IOException e) {
                e.printStackTrace();}
            x++;
        }
        io.close();
    }
}
