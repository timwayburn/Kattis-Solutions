/**
 * Created by Tim on 04/03/16.
 */
public class SpeedLimit {
    static Kattio io = new Kattio(System.in);

    public static void main(String[] args) {
        boolean nice = true;
        while(nice) {
            int n = io.getInt();
            if(n != -1) {
                int lasttime = 0;

                int totaldistance = 0;
                for (int i = 0; i < n; i++) {
                    if (i == 0) {
                        int speed = io.getInt();
                        int time = io.getInt();
                        lasttime = time;
                        totaldistance = totaldistance + (speed * time);
                    } else {
                        int speed = io.getInt();
                        int time = io.getInt();
                        totaldistance = totaldistance + (speed * (time - lasttime));
                        lasttime = time;
                    }
                }
                io.println(totaldistance + " miles");
            }
            else{
                nice = false;
                io.close();
            }
        }
    }

}
