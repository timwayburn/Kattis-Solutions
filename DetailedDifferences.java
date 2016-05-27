/**
 * Created by Tim on 27/05/16.
 */
public class DetailedDifferences {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in);

        int iterations = io.getInt();

        for(int i= 0; i < iterations; i++){
            StringBuilder sb = new StringBuilder();

            String line1 = io.getLine();
            String line2 = io.getLine();

            for(int n = 0; n <line1.length(); n++){
                if(line1.charAt(n) == line2.charAt(n)){
                    sb.append('.');
                }
                else{
                    sb.append('*');
                }
            }
            io.println(line1);
            io.println(line2);
            io.println(sb.toString());
            io.println("");
        }
        io.close();
    }
}
