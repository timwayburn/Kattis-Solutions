import java.util.Arrays;

/**
 * Created by Tim on 29/05/16.
 */
public class Simon {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in);

        int iter = io.getInt();

        for(int i = 0; i < iter; i++) {
            String line = io.getLine();

            String[] words = line.split("\\s");

            if (words.length >= 3) {
                if (words[0].equals("simon") && words[1].equals("says")) {
                    words = Arrays.copyOfRange(words, 2, words.length);
                    printArray(words, io);
                }
                else {
                    io.println("");
                }
            }
        }
        io.close();
    }

    static private void printArray(String[] words, Kattio io){
            StringBuilder sb = new StringBuilder();

            for (String word : words) {
                sb.append(word + " ");
            }

            sb.setLength(sb.length() - 1);
            io.println(sb.toString());
    }
}
