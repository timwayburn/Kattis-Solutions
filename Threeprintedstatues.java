/**
 * Created by Tim on 2017-11-26.
 *
 * Solution to 3D Printed Statues
 */
public class Threeprintedstatues {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in, System.out);

        int statues = io.getInt();
        int printers = 1;
        int statuesprinted = 0;
        int days = 0;

        while(statuesprinted < statues){
            if((statues-statuesprinted) > printers){
                days += 1;
                printers += printers;
            }
            else {
                days += 1;
                statuesprinted += printers;
            }
        }
        
        io.println(days);
        io.close();
    }
}
