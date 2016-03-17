/**
 * Created by Tim on 17/03/16.
 */
public class Server {
    static int time = 0;
    public static void main(String[] args) {
        Kattiosv io = new Kattiosv(System.in);

        int tasks = io.getInt();
        int totaltime = io.getInt();

        for (int i = 0; i < tasks; i++) {
            int currenttime = io.getInt();
            if(time + currenttime > totaltime){
                io.print(i);
                io.close();
            }
            time += currenttime;
        }
        io.print(tasks);
        io.close();
    }
}
