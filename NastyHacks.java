/**
 * Created by Tim on 2017-09-26.
 */
public class NastyHacks {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in, System.out);

        int iterations = io.getInt();

        for(int i = 0; i < iterations; i++){
            int r = io.getInt();
            int rwithads = io.getInt() - io.getInt();

            if(r > rwithads){
                io.println("do not advertise");
            }
            else if(r == rwithads){
                io.println("does not matter");
            }
            else{
                io.println("advertise");
            }
        }
        io.close();
    }
}
