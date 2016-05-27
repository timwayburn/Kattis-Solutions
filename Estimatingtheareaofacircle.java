import java.text.DecimalFormat;

/**
 * Created by Tim on 27/05/16.
 */
public class Estimatingtheareaofacircle {
    public static void main(String[] args) {

        Kattio io = new Kattio(System.in);
        double realpi = Math.PI;

        while(true){

            double radius = io.getDouble();
            double mdots = io.getDouble();
            double cdotsinc = io.getDouble();

            if(radius == 0){
                break;
            }

            double pi = (((2*radius)*(2*radius))*cdotsinc) / mdots;

            io.println(realpi*radius*radius + " " + pi);
        }
        io.close();
    }
}
