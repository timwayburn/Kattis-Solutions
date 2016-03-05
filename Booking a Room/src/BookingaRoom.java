import java.util.ArrayList;

/**
 * Created by Tim on 03/03/16.
 */
public class BookingaRoom {
    static KattioBook io;
    static int totalrooms;
    static int busyrooms;
    static int firstavailable = 0;

        public static void main(String[] args) {
            io = new KattioBook(System.in);
            totalrooms = io.getInt();
            busyrooms = io.getInt();
                ArrayList<Integer> rooms = new ArrayList();
                for (int m = 1; m <= totalrooms; m++) {
                    rooms.add(-1);
                }

                int u = 0;
                while (u < busyrooms) {
                    int currentbusy = io.getInt();
                    if(currentbusy>= 1 && currentbusy <= totalrooms) {
                        rooms.set(currentbusy -1, currentbusy);
                        u++;
                    }
                }
                for (int i = 0; i < totalrooms; i++) {
                        firstavailable = rooms.get(i);
                        if (firstavailable == -1) {
                            io.print(i+1);
                            io.close();
                            return;
                        }
                }
                io.print("too late");
                io.close();
        }
}

