/**
 * Created by Tim on 05/06/16.
 */
public class Ptice {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in);

        int questions = io.getInt();
        String answers = io.getLine();

        String adrian = "ABC";
        String bruno = "BABC";
        String goran = "CCAABB";

        int adriancorr = 0;
        int brunocorr = 0;
        int gorancorr = 0;

        for(int i = 0; i < questions; i++){
            if(answers.charAt(i) == adrian.charAt(i%3)){
                adriancorr++;
            }
            if(answers.charAt(i) == bruno.charAt(i%4)){
                brunocorr++;
            }
            if(answers.charAt(i) == goran.charAt(i%6)){
                gorancorr++;
            }
        }

        int mostcorr = Math.max(Math.max(adriancorr,brunocorr),gorancorr);

        if(mostcorr == 0){
            io.println(0);
        }

        else if(adriancorr == mostcorr && adriancorr == brunocorr && adriancorr != gorancorr){
            io.println(mostcorr);
            io.println("Adrian");
            io.println("Bruno");
        }

        else if(brunocorr == mostcorr && gorancorr == brunocorr && brunocorr != adriancorr){
            io.println(mostcorr);
            io.println("Bruno");
            io.println("Goran");
        }

        else if(adriancorr == mostcorr && adriancorr == gorancorr && gorancorr != brunocorr){
            io.println(mostcorr);
            io.println("Adrian");
            io.println("Goran");
        }

        else if(gorancorr == brunocorr && brunocorr == adriancorr){
            io.println(mostcorr);
            io.println("Adrian");
            io.println("Bruno");
            io.println("Goran");
        }

        if(mostcorr == adriancorr && mostcorr != brunocorr && mostcorr != gorancorr){
            io.println(mostcorr);
            io.println("Adrian");
        }
        if(mostcorr != adriancorr && mostcorr == brunocorr && mostcorr != gorancorr){
            io.println(mostcorr);
            io.println("Bruno");
        }
        if(mostcorr != adriancorr && mostcorr != brunocorr && mostcorr == gorancorr){
            io.println(mostcorr);
            io.println("Goran");
        }

        io.close();
    }
}
