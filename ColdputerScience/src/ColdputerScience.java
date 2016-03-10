/**
 * Created by Tim on 10/03/16.
 */
public class ColdputerScience {
    static int result = 0;
    public static void main(String[] args) {
        Kattiocomp io = new Kattiocomp(System.in);
        int count = io.getInt();
        for(int i = 0; i < count; i++){
            int currenttemp = io.getInt();
            if(currenttemp < 0){
                result ++;
            }
        }
        io.print(result);
        io.close();
    }
}
