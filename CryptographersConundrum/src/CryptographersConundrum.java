/**
 * Created by Tim on 04/03/16.
 */
public class CryptographersConundrum {
    static int answer = 0;

    public static void main(String[] args) {
        Kattio io = new Kattio(System.in);
        String input = io.getWord();
        String[] code = input.split("");

        String y = "PER";
        String[] per = y.split("");

        for (int x = 0;x < code.length; x++) {
            if (!code[x].equals(per[x % 3])){
                answer++;
            }
        }
        System.out.println(answer);
    }
}
