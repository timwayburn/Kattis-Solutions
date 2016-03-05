/**
 * Created by Tim on 03/03/16.
 */
public class Oddities {
    static Kattio io;
    public static void main(String[] args) {
        io = new Kattio(System.in);

        int first = io.getInt();
        if(first <= 20 && first >= 0){
            for(int i =0; i < first; i++){
                int check = io.getInt();
                if(check % 2 == 0){
                    io.println(check + " is even");
                }
                else{
                    io.println(check + " is odd");
                }
            }
        }
        io.close();
    }
}
