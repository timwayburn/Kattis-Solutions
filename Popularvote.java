import java.util.ArrayList;

/**
 * Created by Tim on 2017-11-23.
 *
 * Solution to Popular Vote
 */
public class Popularvote {
    private static int winner;
    private static int winvotes;
    private static boolean draw;
    private static int totalvotes;

    public static void main(String[] args) {
        Kattio io = new Kattio(System.in, System.out);

        int elections = io.getInt(); // Retreive number of elections
        for(int i = 0; i < elections; i++){
            totalvotes = 0;
            draw = false;
            ArrayList<Integer> votes = new ArrayList<>();
            int candidates = io.getInt(); // Retreive number of candidates in current vote

            for (int j = 0; j < candidates; j++){
                votes.add(io.getInt());
            }
            calcWinner(votes);

            if(draw == true){
                io.println("no winner");
            }
            else{
                if(winvotes > (totalvotes/2)){
                    io.println("majority winner " + (winner + 1));
                }
                else{
                    io.println("minority winner " + (winner + 1));
                }
            }
        }

        io.close();
    }

    private static void calcWinner(ArrayList<Integer> cands){
        winner = 0;
        winvotes = -1;
        for(int i = 0; i < cands.size(); i++){
            totalvotes += cands.get(i);
            if(cands.get(i) == winvotes){
                draw = true;
            }
            else if(cands.get(i) >= winvotes){
                draw = false;
                winvotes = cands.get(i);
                winner = i;
            }
        }
    }
}
