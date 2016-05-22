/**
 * Created by Tim on 22/05/16.
 */
public class Trik {

    public static void main(String[] args) {
        Kattio io = new Kattio(System.in);

        char correctcup = 'A';
        String byten = io.getWord();
        for (int i = 0; i < byten.length(); i++){
            if (byten.charAt(i) == 'A'){
                if(correctcup == 'A'){
                    correctcup = 'B';
                }
                else if(correctcup == 'B'){
                    correctcup = 'A';
                }
            }
            else if (byten.charAt(i) == 'B'){
                if(correctcup == 'C'){
                    correctcup = 'B';
                }
                else if(correctcup == 'B'){
                    correctcup = 'C';
                }
            }
            else if (byten.charAt(i) == 'C'){
                if(correctcup == 'A'){
                    correctcup = 'C';
                }
                else if(correctcup == 'C'){
                    correctcup = 'A';
                }
            }
        }
        if(correctcup == 'A'){
            io.print(1);
        }
        else if(correctcup == 'B') {
            io.print(2);
        }
        else{
            io.print(3);
        }
        io.close();
    }
}
