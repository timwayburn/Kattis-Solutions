/**
 * Created by Tim on 09/06/16.
 */
public class Aaah {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in);

        String doctor = io.getWord();
        String jon = io.getWord();

        if(doctor.length() >= jon.length()){
            io.print("go");
        }
        else{
            io.print("no");
        }
        io.close();
    }
}
