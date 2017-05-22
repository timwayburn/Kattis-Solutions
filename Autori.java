/**
 * Created by Tim on 2017-05-22.
 */
public class Autori {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in, System.out);
        StringBuilder sb = new StringBuilder();

        String name = io.getWord();
        String[] subnames = name.split("-");

        for(String n : subnames){
            sb.append(n.charAt(0));
        }

        System.out.println(sb.toString());
        io.close();
    }
}
