import java.text.DecimalFormat;

/**
 * Created by Tim on 19/05/16.
 */
public class Pizza_Crust {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in);

        DecimalFormat numberFormat = new DecimalFormat("#.000000");

        double radius = io.getDouble();
        double cheeseradius = radius - io.getDouble();

        double totalarea = Math.PI * radius * radius;
        double cheesearea = Math.PI * cheeseradius * cheeseradius;

        double cheesepercent = cheesearea/totalarea *100;

        io.print(numberFormat.format(cheesepercent));
        io.close();
    }
}
