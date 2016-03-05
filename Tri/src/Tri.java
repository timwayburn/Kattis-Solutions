/**
 * Created by Tim on 03/03/16.
 */
public class Tri {
    static Kattio io = new Kattio(System.in);
    public static void main(String[] args) {
        int[] a = new int[3];
        int index  = 0;
        while(io.hasMoreTokens()){
            a[index] = io.getInt();
            index++;
        }
        if(a[0] + a[1] == a[2]){
            io.print(a[0] + "+" + a[1] + "=" + a[2]);
        }
        else if(a[0] == a[1] + a[2]){
            io.print(a[0] + "=" + a[1] + "+" + a[2]);
        }
        else if(a[0] - a[1] == a[2]){
            io.print(a[0] + "-" + a[1] + "=" + a[2]);
        }
        else if(a[0] == a[1] - a[2]){
            io.print(a[0] + "=" + a[1] + "-" + a[2]);
        }
        else if(a[0] * a[1] == a[2]){
            io.print(a[0] + "*" + a[1] + "=" + a[2]);
        }
        else if(a[0] == a[1] * a[2]){
            io.print(a[0] + "=" + a[1] + "*" + a[2]);
        }
        else if(a[0] / a[1] == a[2]){
            io.print(a[0] + "/" + a[1] + "=" + a[2]);
        }
        else if(a[0] == a[1] / a[2]){
            io.print(a[0] + "=" + a[1] + "/" + a[2]);
        }
        io.close();
    }
}
