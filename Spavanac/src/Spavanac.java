/**
 * Created by Tim on 03/03/16.
 */
public class Spavanac {
    private static int hr;
    private static int min;
    static Kattio io;

    public static void main(String[] args) {
        io = new Kattio(System.in);
        hr = io.getInt();
        min = io.getInt();
        for(int i=0; i<45; i++){
            if(min == 0){
                if(hr == 0){
                    hr = 23;
                    min = 59;
                }
                else {
                    hr--;
                    min = 59;
                }
            }
            else {
                min--;
            }
        }
        io.print(hr + " " + min);
        io.close();
    }
}
