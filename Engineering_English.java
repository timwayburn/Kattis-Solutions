import java.util.ArrayList;
import java.util.HashSet;

/**
 * Created by Tim on 19/05/16.
 */
public class Engineering_English {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in, System.out);

        HashSet<String> dictionary = new HashSet<>();
        StringBuilder sb = new StringBuilder();
        ArrayList<String> story = new ArrayList<>();

        String nextline = io.getLine();

        while(true){
            String currentline = nextline;
            String[] line = currentline.split("\\s+");

            for (String word: line){
                story.add(word);
            }

            story.add("ö");

            nextline = io.getLine();

            if(nextline == null){
                break;
            }
        }

        for (String word : story) {
            if(word.equals("ö")){
                sb.append("\n");
            }
            else if (dictionary.contains(word.toUpperCase())) {
                sb.append(". ");
                dictionary.add(word.toUpperCase());
            } else {
                sb.append(word + " ");
                dictionary.add(word.toUpperCase());
            }
        }

        sb.setLength(sb.length()-2);

        io.print(sb.toString());
        io.close();
    }
}
