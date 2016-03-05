import java.util.ArrayList;

/**
 * Created by Tim on 05/03/16.
 *
 * Toilet seat solution.
 *
 * The three cases are
 *
 * 1. When you leave, always leave the seat up
 * 2. When you leave, always leave the seat down
 * 3. When you leave, always leave the seat as you would like to find it
 */
public class ToiletSeat {
    static Kattiotoilet io = new Kattiotoilet(System.in);
    static ArrayList<Character> positions = new ArrayList<>();
    static int case1 = 0;
    static int case2 = 0;
    static int case3 = 0;
    static char initialpos;
    static char first;

    public static void main(String[] args) {
        String toilet = io.getLine(); // The input
        for(int x = 0; x < toilet.length(); x++) {  // Turn the string into an array of chars
            positions.add(toilet.charAt(x));
        }

        initialpos = positions.get(0);
        first = positions.get(1);

        //Case 1, always leave up

        for(int i = 2; i < positions.size(); i++){
            if(positions.get(i) != 'U') {
                    case1 += 2;
            }
        }
        if(initialpos == 'D' && first == 'U'){
            case1 ++;
        }
        if(initialpos == 'D' && first == 'D'){
            case1 ++;
        }
        if(initialpos == 'U' && first == 'D'){
            case1 += 2;
        }

        //Case 2, always leave down

        for(int i = 2; i < positions.size(); i++){
            if(positions.get(i) != 'D') {
                    case2 += 2;
            }
        }
        if(initialpos == 'U' && first == 'D'){
            case2 ++;
        }
        if(initialpos == 'U' && first == 'U'){
            case2 ++;
        }
        if(initialpos == 'D' && first == 'U'){
            case2 += 2;
        }


        //Case 3, as next wishes

        char lastchar = positions.get(1);
        for(int i = 2; i < positions.size(); i++){
            if(positions.get(i) != lastchar) {
                case3 ++;
            }
            lastchar = positions.get(i);
        }
        if(initialpos == 'D' && first == 'U'){
            case3 += 1;
        }
        if(initialpos == 'U' && first == 'D'){
            case3 += 1;
        }


        io.println(case1);
        io.println(case2);
        io.println(case3);
        io.close();
    }

}
