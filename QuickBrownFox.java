/**
 * Created by Tim on 09/06/16.
 */
public class QuickBrownFox {
    static String[] alphabet = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};

    public static void main(String[] args) {
        Kattio io = new Kattio(System.in);
        int iterations = io.getInt();

        for(int i=0; i < iterations; i++){
            String line = io.getLine().toLowerCase();

            System.out.println(checkLine(line));
        }
        
        io.close();
    }

    static private String checkLine(String line){
        StringBuilder sb = new StringBuilder();

        for(String c : alphabet)
        if(!line.contains(c)){
            sb.append(c);
        }

        if(sb.length() == 0){
            return "pangram";
        }
        else{
            return "missing " + sb.toString();
        }
    }
}
