/**
 * Created by Tim on 2016-11-08.
 *
 * Solution to Seven Wonders.
 */
public class SevenWonders {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in, System.out);

        int T = 0;
        int C = 0;
        int G = 0;
        int smallest;

        String sequence = io.getWord();

        for(int i = 0 ; i < sequence.length(); i++){
            if(sequence.charAt(i) == 'T'){
                T++;
            }
            else if(sequence.charAt(i) == 'C'){
                C++;
            }
            else{
                G++;
            }
        }

        if(T <= C && T <= G){
            smallest = T;
        }
        else if(C <= G){
            smallest = C;
        }
        else{
            smallest = G;
        }

        T = T*T;
        C = C*C;
        G = G*G;

        io.println((7*smallest) + T + C + G);

        io.close();
    }
}
