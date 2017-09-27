/**
 * Created by Tim on 2017-09-26.
 */
public class QuadrantSelection {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in, System.out);

        int x = io.getInt();
        int y = io.getInt();

        if(x > 0 && y > 0){
            io.print("1");
        }
        else if(x > 0){
            io.print("4");
        }
        else if(x < 0 && y < 0){
            io.print("3");
        }
        else{
            io.print("2");
        }

        io.close();
    }
}
