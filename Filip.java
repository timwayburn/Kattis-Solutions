/**
 * Solution to Filip
 * Created by Tim on 2017-05-22.
 */
public class Filip {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in, System.out);
        StringBuilder sb = new StringBuilder();
        int max = 0;

        sb.append(io.getWord());
        sb.append(",");
        sb.append(io.getWord());

        String fullinput = sb.reverse().toString();
        String[] numbers = fullinput.split(",");

        for(String s : numbers){
            if(Integer.parseInt(s) > max){
                max = Integer.parseInt(s);
            }
        }

        System.out.println(max);
        io.close();
    }
}
