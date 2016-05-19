/**
 * Created by Tim on 19/05/16.
 */
public class Bijele {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in);
        int[] correct = {1, 1, 2, 2, 2, 8};
        int[] real = {io.getInt(), io.getInt(), io.getInt(), io.getInt(), io.getInt(), io.getInt()};

        for(int i = 0; i < 6; i++){
            io.print(correct[i] - real[i]);
            if(i != 5){
                io.print(" ");
            }
        }
        io.close();
    }
}
