/**
 * Created by Tim on 03/03/16.
 */
public class Spavanacnew {
    private static int hr;
    private static int min;
    static Kattio io;

    public static void main(String[] args) {
        io = new Kattio(System.in);
        hr = io.getInt();
        min = io.getInt();

        if(min < 45){
            if(hr == 0) {
                hr = 23;
                min = 60 - (45-min);
            }
            else{
                hr--;
                min = 60 - (45-min);
            }
        }
        else{
            min = min - 45;
        }

        io.print(hr + " " + min);
        io.close();
    }
}