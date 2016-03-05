import java.util.ArrayList;

/**
 * Created by Tim on 03/03/16.
 */
public class BookingaRoom {
    static Kattio io;
    static int totalrooms;
    static int busyrooms;
    static int firstavailable = 0;

        public static void main(String[] args) {
            io = new Kattio(System.in);
            totalrooms = io.getInt();
            busyrooms = io.getInt();
            if(totalrooms>=1 && totalrooms<=100 && busyrooms>=0 && busyrooms<= totalrooms) {
                ArrayList<Integer> rooms = new ArrayList();
                for (int m = 0; m < 100 -1; m++) {
                    rooms.add(-1);
                }
                int u = 0;
                while (u < busyrooms) {
                    int currentbusy = io.getInt();
                    if(currentbusy>= 1 && currentbusy <= totalrooms) {
                        rooms.add(currentbusy, currentbusy);
                        u++;
                    }
                }

                for (int i = 0; i <= busyrooms -1; i++) {
                        firstavailable = rooms.get(i);
                        if (firstavailable == -1 && i == busyrooms) {
                            io.print("too late");
                            io.close();
                            return;
                        }
                        i++;
                }
                io.print(firstavailable +1);
                io.close();
            }
        }
}

